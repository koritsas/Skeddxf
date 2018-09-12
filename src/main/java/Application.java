import org.koritsas.UI.SkeddxfUI;
import org.koritsas.configuration.AppConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class Application {
    public static void main(String[] args) {

        /*Launcher launcher = new Launcher();
        launcher.launch();
*/
        new SpringApplicationBuilder()
                .sources(AppConfiguration.class).sources(SkeddxfUI.class)
                .web(false).headless(false)
                .run(args);



    }
}
