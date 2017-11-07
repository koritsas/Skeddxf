import org.koritsas.UI.SkeddxfUI;
import org.koritsas.configuration.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        SkeddxfUI skeddDXF = (SkeddxfUI) context.getBean("ApplicationUI");
        //context.getBean("Listeners");

        skeddDXF.setVisible(true);


    }
}
