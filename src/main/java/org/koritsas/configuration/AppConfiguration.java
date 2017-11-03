package org.koritsas.configuration;

import org.koritsas.UI.SkeddxfUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfiguration {
    public AppConfiguration(){}


    @Bean(name = "ApplicationUI")
    public SkeddxfUI createUI(){
        SkeddxfUI ui = new SkeddxfUI();
        return ui;
    }


    /*
    @Bean(name="Listeners")
    @Autowired
    SkeddxfUI skeddadler;
    public List<ActionEvent> getActionList(){
        List<ActionEvent> events = new ArrayList<>();
        //skeddadler.addMouseListener();


    }
*/


}
