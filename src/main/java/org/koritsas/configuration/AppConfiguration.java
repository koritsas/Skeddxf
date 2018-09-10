package org.koritsas.configuration;


import com.jsevy.jdxf.DXFDocument;
import org.koritsas.UI.SkeddxfUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;

@Configuration
public class AppConfiguration {
    public AppConfiguration(){}


    @Bean(name = "ApplicationUI")
    public SkeddxfUI createUI(){
        SkeddxfUI ui = new SkeddxfUI();
        return ui;
    }






    @Autowired
    SkeddxfUI skeddadler;

    @Bean(name = "fileChooser")
    public JFileChooser createFileChooser(){
        JFileChooser chooser = new JFileChooser();
        chooser.addChoosableFileFilter(new FileNameExtensionFilter("Text","txt", "CSV", "csv"));

        return chooser;
    }

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

/*
        DXFLayer pointLayer = new DXFLayer();

        DXFLayer numbersLayer = new DXFLayer();
        DXFLayer heightLayer = new DXFLayer();
        DXFLayer descriptionLayer = new DXFLayer();

        if(add_numbers == true){

            numbersLayer.setName(numbers_layer_name);
            numbersLayer.setColor(colorToRGB(numbers_color));
        }

        if(add_elevation == true){

            heightLayer.setName(elevation_layer_name);
            heightLayer.setColor(colorToRGB(elevation_color));
        }

        if(add_description == true){
            descriptionLayer = new DXFLayer();
            descriptionLayer.setName(description_layer_name);
            descriptionLayer.setColor(colorToRGB(description_color));
        }

        TableModel model = skeddadler.getTable().getModel();

        for (int i = 0;i<model.getRowCount();i++){
            String id = model.getValueAt(0,0).toString();
            double x = Double.parseDouble(model.getValueAt(0,1).toString());
            double y = Double.parseDouble(model.getValueAt(0,2).toString());
            String elevation = model.getValueAt(0,3).toString();
            String description = model.getValueAt(0,4).toString();

            DXFPoint point = new DXFPoint(x,y,0);
            pointLayer.addDXFEntity(point);

            if (add_numbers == true && id != null){
                DXFText text = new DXFText();
                text.setText(id);
                text.setHeight(numbers_height);
                text.setX(x+1);
                text.setY(y+1);
            }

            if (add_elevation == true && elevation != null){
                DXFText text = new DXFText();
                text.setText(id);
                text.setHeight(elevetion_height);
                text.setX(x+1);
                text.setY(y);
            }

            if (add_description && description != null){
                DXFText text = new DXFText();
                text.setText(description);
                text.setHeight(description_height);
                text.setX(x+1);
                text.setY(y-1);
            }



        }

    dxfDocument.addDXFLayer(pointLayer);
        if (add_numbers == true){
            dxfDocument.addDXFLayer(numbersLayer);
        }
        if (add_elevation == true){
            dxfDocument.addDXFLayer(heightLayer);
        }
        if (add_description == true){
            dxfDocument.addDXFLayer(descriptionLayer);
        }

*/
    return dxfDocument;


    }

    private int colorToRGB(Color color){
        int rgb = color.getRed();
        rgb = (rgb << 8 )+ color.getGreen();
        rgb = (rgb << 8 )+ color.getBlue();
        return rgb;
    }

}
