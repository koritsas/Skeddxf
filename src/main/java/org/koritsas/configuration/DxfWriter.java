package org.koritsas.configuration;

import com.jsevy.jdxf.*;
import org.koritsas.UI.SkeddxfUI;

import javax.swing.*;
import java.util.Vector;

public class DxfWriter {


    SkeddxfUI ui;

    public void writeDxfFile(){


        DXFDocument dxf = new DXFDocument("Example");

        DXFGraphics graphics = dxf.getGraphics();

        System.out.println(ui);

        JTable mTable =ui.getTable();

        RecordTableModel model = (RecordTableModel) mTable.getModel();

        Vector<Vector<Object>> v = model.getDataVector();

       for (int i=0; i< model.getDataVector().size();i++){
           Vector<Object> n = (Vector<Object>) model.getDataVector().get(i);

           double pointx = (double) n.get(1);
           double pointy = (double) n.get(2);
           double pointz = (double) n.get(3);

           DXFText id = new DXFText(n.get(0).toString(),new RealPoint(pointx+0.5,pointy+0.5,0.0),0,null,graphics);

           RealPoint point = new RealPoint(pointx,pointy,0);

           DXFText description = new DXFText(n.get(0).toString(),new RealPoint(pointx+0.5,pointy-0.5,0.0),0,null,graphics);

           dxf.addEntity(id);
           dxf.addEntity(new DXFPoint(point,graphics));
           dxf.addEntity(description);
       }


        RealPoint po = new RealPoint(500600.123,4566826.125,0.0);

        DXFPoint p = new DXFPoint(po,graphics);

        dxf.addEntity(p);
    //    System.out.println(dxf.toDXFString());

        ui.getTable();

    }


}
