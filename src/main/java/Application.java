import org.koritsas.Launcher;
import org.koritsas.configuration.AppConfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application implements CommandLineRunner {
    public static void main(String[] args) {

        /*Launcher launcher = new Launcher();
        launcher.launch();
*/
        new SpringApplicationBuilder()
                .sources(AppConfiguration.class)
                .web(false).headless(false)
                .run(args);

    }

    @Override
    public void run(String... args) throws Exception {

        Launcher launcher = new Launcher();
        launcher.launch();


    }
}
