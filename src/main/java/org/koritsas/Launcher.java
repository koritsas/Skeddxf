package org.koritsas;

import org.koritsas.UI.SkeddxfUI;
import org.koritsas.configuration.AppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {

    @Autowired
    SkeddxfUI skeddDXF;

    public void launch(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        skeddDXF = (SkeddxfUI) context.getBean("ApplicationUI");


        skeddDXF.setVisible(true);
    }

}
