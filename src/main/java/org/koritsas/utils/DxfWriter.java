package org.koritsas.utils;

import com.jsevy.jdxf.*;
import org.koritsas.UI.SkeddxfUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;

@Component
public class DxfWriter {


    private SkeddxfUI ui;

    @Autowired
    public void setUi(SkeddxfUI ui) {
        this.ui = ui;
    }

    public DxfWriter(){

    }

    public void writeDxfFile(){


        String pointLayerName = ui.getPointName().getText();
        Color pointColor = ui.getPointColorBox().getSelectedColor();

        boolean addNumbers = ui.getNumberCheckBox().isSelected();
        double numbersTextHeight = Double.parseDouble(ui.getNumberHeight().getText());
        String numberLayerName = ui.getNumberName().getText();
        Color numberColor = ui.getNumberColorBox().getSelectedColor();

        boolean addElevation = ui.getElevationCheckBox().isSelected();
        double elevationTExtHeight = Double.parseDouble(ui.getElevationHeight().getText());
        String elevationLayerName = ui.getElevationName().getText();
        Color elevationColor = ui.getElevationColorBox().getSelectedColor();

        boolean addDescription = ui.getDescriptionCheckBox().isSelected();
        double descriptionTextHeight = Double.parseDouble(ui.getDescriptionHeight().getText());
        String descriptionLayerName = ui.getDescriptionName().getText();
        Color color = ui.getDescriptionColorBox().getSelectedColor();

        boolean point3D = ui.getmThreeDCheckBox().isSelected();





        DXFDocument dxf = new DXFDocument("Example");

        DXFGraphics graphics = dxf.getGraphics();



        JTable mTable =ui.getTable();

        RecordTableModel model = (RecordTableModel) mTable.getModel();

        Vector<Vector<Object>> v = model.getDataVector();

        DXFLayer numberLayer = new DXFLayer(numberLayerName);
        DXFLayer pointLayer = new DXFLayer(pointLayerName);
        DXFLayer elevationLayer = new DXFLayer(elevationLayerName);
        DXFLayer descriptionLayer = new DXFLayer(descriptionLayerName);



        DXFTableRecord tableRecord = new DXFTableRecord();


        for (int i=0; i< model.getDataVector().size();i++) {
            Vector<Object> n = (Vector<Object>) model.getDataVector().get(i);

            RealPoint point;

            double pointx = (double) n.get(1);
            double pointy = (double) n.get(2);
            double pointz = (double) n.get(3);



            if (point3D) {

            point = new RealPoint(pointx,pointy,pointz);

            } else {

            point = new RealPoint(pointx,pointy,0);

            }

            dxf.addEntity(new DXFPoint(point,graphics));
            if(addNumbers) {

                DXFText id = new DXFText(n.get(0).toString(),new RealPoint(point.x+0.5,point.y+0.5,point.z),0,new DXFStyle(new Font(Font.MONOSPACED,
                        Font.PLAIN, 38)),graphics);
                dxf.addEntity(id);


            }

            if (addDescription) {
                DXFText description = new DXFText(n.get(0).toString(),new RealPoint(point.x+0.5,pointy,point.z),0,new DXFStyle(new Font(Font.MONOSPACED,
                        Font.PLAIN, 38)),graphics);
                dxf.addEntity(description);
            }

            if(addElevation) {
                DXFText elevation = new DXFText(n.get(0).toString(),new RealPoint(point.x+0.5,point.y-0.5,point.z),new DXFStyle(new Font(Font.MONOSPACED,
                        Font.PLAIN, 38)),graphics);
                dxf.addEntity(elevation);
            }

        }


        try {
            FileOutputStream outputStream = new FileOutputStream("C:/Users/koritsas.il/Documents/My Drawings/Example.dxf");
            outputStream.write(dxf.toDXFString().getBytes());
            outputStream.close();

            System.out.println("File written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }


        

    }


    }



