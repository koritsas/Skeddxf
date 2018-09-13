package org.koritsas.utils;

import org.apache.commons.csv.CSVRecord;

import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.Vector;

public class RecordTableModel extends DefaultTableModel {

    private List<CSVRecord> mRecords;
    private Vector<Vector<String>> dataVector = new Vector<Vector<String>>();

    public  RecordTableModel(List<CSVRecord> records){


        this.mRecords = records;

        this.addColumn("Point");
        this.addColumn("X");
        this.addColumn("Y");
        this.addColumn("Z");
        this.addColumn("Description");




    }

    public void populateTable(){


        for (CSVRecord rec:mRecords){
            Vector vector = new Vector();

            vector.add(0, rec.get(0));
            vector.add(1,  Double.parseDouble(rec.get(1)));
            vector.add(2,  Double.parseDouble(rec.get(2)));
            vector.add(3,  Double.parseDouble(rec.get(3)));
            vector.add(4,  rec.get(4));

            dataVector.add(vector);

        }


        Vector<String> names = new Vector<String>();
        names.add("Id");
        names.add("X");
        names.add("Y");
        names.add("Z");
        names.add("Description");


        this.setDataVector(dataVector,names);



    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 1 || columnIndex == 2 || columnIndex == 3) {
            return Double.class;
        }
        return super.getColumnClass(columnIndex);
    }


}
