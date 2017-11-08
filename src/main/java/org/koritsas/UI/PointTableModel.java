package org.koritsas.UI;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class PointTableModel extends DefaultTableModel {


    public PointTableModel(Vector<Vector<String>> pointVector, Vector<String> names) {
        super(pointVector,names);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 1 || columnIndex == 2) {
            return Double.class;
        }
        return super.getColumnClass(columnIndex);
    }

}
