package org.koritsas.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

@Configuration
public class AppConfiguration {
    public AppConfiguration(){}

/*
    @Bean(name = "ApplicationUI")
    public SkeddxfUI createUI(){
        SkeddxfUI ui = new SkeddxfUI();
        return ui;
    }
*/


    @Bean(name = "fileChooser")
    public JFileChooser createFileChooser(){
        JFileChooser chooser = new JFileChooser();
        chooser.addChoosableFileFilter(new FileNameExtensionFilter("Text","txt"));

        return chooser;
    }
/*
    @Autowired
    SkeddxfUI skeddadler;

    @Bean(name ="dxfDocument")
    public DXFDocument createDocument(){
        DXFDocument dxfDocument = new DXFDocument();

        boolean add_numbers = skeddadler.getNumberCheckBox().isSelected();
        boolean add_elevation = skeddadler.getElevationCheckBox().isSelected();
        boolean add_description = skeddadler.getDescriptionCheckBox().isSelected();

        String point_layer_name = skeddadler.getPointName().getText();
        String numbers_layer_name = skeddadler.getNumberName().getText();
        String elevation_layer_name = skeddadler.getElevationName().getText();
        String description_layer_name = skeddadler.getDescriptionName().getText();

        double numbers_height = Double.parseDouble(skeddadler.getNumberHeight().getText());
        double elevetion_height = Double.parseDouble(skeddadler.getElevationHeight().getText());
        double description_height = Double.parseDouble(skeddadler.getDescriptionHeight().getText());

        Color point_color = skeddadler.getPointColorBox().getSelectedColor();
        Color numbers_color = skeddadler.getNumberColorBox().getSelectedColor();
        Color elevation_color = skeddadler.getElevationColorBox().getSelectedColor();
        Color description_color = skeddadler.getDescriptionColorBox().getSelectedColor();

    return dxfDocument;


    }
*/

}
