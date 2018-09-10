package org.koritsas;

import org.koritsas.UI.SkeddxfUI;
import org.koritsas.configuration.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {

    public void launch(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        SkeddxfUI skeddDXF = (SkeddxfUI) context.getBean("ApplicationUI");


        skeddDXF.setVisible(true);
    }

}
