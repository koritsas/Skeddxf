package org.koritsas.utils;

import org.apache.commons.csv.CSVRecord;

import javax.swing.table.DefaultTableModel;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class RecordTableModel extends DefaultTableModel {

    private final Vector<String> NAME_VECTOR = new Vector<String>(Arrays.asList(new String[] {
            "Point ID", "X", "Y", "Z", "Description" //NON-NLS
    }));


    public RecordTableModel(){
            this.setDataVector( new Object[][] {
                    {null, null, null, null, null},
            },new String[] {
                    "Point ID", "X", "Y", "Z", "Description" //NON-NLS
            });

            ;
    }

    public void setCSVRevords(List<CSVRecord> records){

        Vector data = new Vector();

        for (CSVRecord rec:records){
            Vector vector = new Vector();

            vector.add(0, rec.get(0));
            vector.add(1,  Double.parseDouble(rec.get(1)));
            vector.add(2,  Double.parseDouble(rec.get(2)));
            vector.add(3,  Double.parseDouble(rec.get(3)));
            vector.add(4,  rec.get(4));

            data.add(vector);

        }

        this.setDataVector(data,NAME_VECTOR);
    }



    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 1 || columnIndex == 2 || columnIndex == 3) {
            return Double.class;
        }
        return super.getColumnClass(columnIndex);
    }


}
