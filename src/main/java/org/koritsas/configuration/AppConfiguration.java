package org.koritsas.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

@Configuration
@ComponentScan("org.koritsas.UI")
@ComponentScan("org.koritsas.utils")
public class AppConfiguration {
    public AppConfiguration(){}


    @Bean(name = "fileChooser")
    public JFileChooser createFileChooser(){
        JFileChooser chooser = new JFileChooser();
        chooser.addChoosableFileFilter(new FileNameExtensionFilter("Text","txt"));

        return chooser;
    }




}
