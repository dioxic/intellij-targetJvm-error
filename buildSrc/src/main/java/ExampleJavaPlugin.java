import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile;

public class ExampleJavaPlugin implements Plugin<Project> {
    @Override
    public void apply(Project target) {
        target.getTasks()
                .withType(KotlinCompile.class)
                .forEach(it -> it.getKotlinOptions().setJvmTarget("1.8"));
    }
}
