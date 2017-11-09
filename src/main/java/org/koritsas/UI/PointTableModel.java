package org.koritsas.UI;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class PointTableModel extends DefaultTableModel {


    public PointTableModel(Object[][] pointVector, String[] names) {
        super(pointVector,names);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 1 || columnIndex == 2 || columnIndex == 3) {

            return getValueAt(0,columnIndex).getClass();
        }
        return super.getColumnClass(columnIndex);
    }

}
