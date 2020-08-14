import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    jcenter()
}

gradlePlugin {
    plugins {
        register("example-plugin") {
            id = "example"
            implementationClass = "ExamplePlugin"
        }
    }
}

dependencies {
    implementation(kotlin("gradle-plugin", KotlinCompilerVersion.VERSION))
}

println("buildSrc build script classpath kotlin compiler version " + KotlinCompilerVersion.VERSION)