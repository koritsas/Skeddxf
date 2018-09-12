package org.koritsas.UI;

import net.miginfocom.swing.MigLayout;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.koritsas.UI.components.JColorComboBox;
import org.koritsas.configuration.DxfWriter;
import org.koritsas.configuration.RecordTableModel;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.List;
import java.util.Vector;
/*
 * Created by JFormDesigner on Thu Nov 02 16:01:21 EET 2017
 */



/**
 * @author Ilias Koritsas
 */

public class SkeddxfUI extends JFrame {

    @Autowired
    private JFileChooser mFileChooser;


    public SkeddxfUI() {
        initComponents();
        this.setVisible(true);
    }

    public JMenuItem getImportMenuItem() {
        return mImportMenuItem;
    }



    private void importMenuItemActionPerformed(ActionEvent e) {
       // mFileChooser = (JFileChooser) context.getBean("fileChooser");


        int status =mFileChooser.showDialog(null,"Select");


        if (status == JFileChooser.APPROVE_OPTION){
           File inputFile = mFileChooser.getSelectedFile();



            Vector<String> names = new Vector<String>();
            names.add("Id");
            names.add("X");
            names.add("Y");
            names.add("Z");
            names.add("Description");

            Reader reader;
            CSVFormat format;



            switch ( getFormatComboBox().getSelectedItem().toString()){

                case "nxyz_comma":
                    format = CSVFormat.DEFAULT;
                    break;
                case "nxyzd_comma":
                    format = CSVFormat.DEFAULT;
                    break;
                case "nxyz_tab":
                    format = CSVFormat.TDF;
                    break;
                case "nxyzd_tab":
                    format = CSVFormat.TDF;
                    break;
                case "nxyz_space":
                    format = CSVFormat.newFormat(' ');
                    break;
                case "nxyzd_space":
                    format = CSVFormat.newFormat(' ');
                    break;

                default:
                    format = CSVFormat.DEFAULT;
                    break;
            }



            try {
               reader=  new FileReader(inputFile);

               CSVParser parser = new CSVParser(reader, format);

               List<CSVRecord> records = parser.getRecords();

                RecordTableModel model = new RecordTableModel(records);
                model.populateTable();

               Vector<String> v=model.getDataVector();
                mTable.setModel(model);

            } catch (FileNotFoundException fileNotFound) {
                fileNotFound.printStackTrace();
            } catch (IOException IOError) {
                IOError.printStackTrace();
            }



            DxfWriter writer = new DxfWriter();

            writer.writeDxfFile();




        }else if(status == JFileChooser.CANCEL_OPTION){

            mFileChooser.cancelSelection();
        }


    }

    public JTable getTable() {
        return mTable;
    }

    public JComboBox getFormatComboBox() {
        return mFormatComboBox;
    }

    public JTextField getPointName() {
        return mPointName;
    }

    public JColorComboBox getPointColorBox() {
        return mPointColorBox;
    }

    public JCheckBox getNumberCheckBox() {
        return mNumberCheckBox;
    }

    public JTextField getNumberHeight() {
        return mNumberHeight;
    }

    public JTextField getNumberName() {
        return mNumberName;
    }

    public JColorComboBox getNumberColorBox() {
        return mNumberColorBox;
    }

    public JCheckBox getElevationCheckBox() {
        return mElevationCheckBox;
    }

    public JTextField getElevationHeight() {
        return mElevationHeight;
    }

    public JTextField getElevationName() {
        return mElevationName;
    }

    public JColorComboBox getElevationColorBox() {
        return mElevationColorBox;
    }

    public JCheckBox getDescriptionCheckBox() {
        return mDescriptionCheckBox;
    }

    public JTextField getDescriptionHeight() {
        return mDescriptionHeight;
    }

    public JTextField getDescriptionName() {
        return mDescriptionName;
    }

    public JColorComboBox getDescriptionColorBox() {
        return mDescriptionColorBox;
    }

    private void button1ActionPerformed(ActionEvent e) {






    }









    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ilias Koritsas
        mMenuBar1 = new JMenuBar();
        mFileMenu = new JMenu();
        mImportMenuItem = new JMenuItem();
        mExportMenuItem = new JMenuItem();
        mExitMenuItem = new JMenuItem();
        mSettingsMenu = new JMenu();
        mHelpMenu = new JMenu();
        mAboutMenu = new JMenu();
        mTablePane = new JScrollPane();
        mTable = new JTable();
        mButton1 = new JButton();
        mLabel13 = new JLabel();
        mFormatComboBox = new JComboBox();
        mTabbedPane = new JTabbedPane();
        mPointTab = new JPanel();
        mLabel15 = new JLabel();
        mPointName = new JTextField();
        mLabel16 = new JLabel();
        mPointColorBox = new JColorComboBox();
        mNumberTab = new JPanel();
        mNumberCheckBox = new JCheckBox();
        mLabel4 = new JLabel();
        mNumberHeight = new JTextField();
        mLabel5 = new JLabel();
        mNumberName = new JTextField();
        mLabel6 = new JLabel();
        mNumberColorBox = new JColorComboBox();
        mElevationTab = new JPanel();
        mElevationCheckBox = new JCheckBox();
        mLabel7 = new JLabel();
        mElevationHeight = new JTextField();
        mLabel8 = new JLabel();
        mElevationName = new JTextField();
        mLabel9 = new JLabel();
        mElevationColorBox = new JColorComboBox();
        mDescriptionTab = new JPanel();
        mDescriptionCheckBox = new JCheckBox();
        mLabel10 = new JLabel();
        mDescriptionHeight = new JTextField();
        mLabel11 = new JLabel();
        mDescriptionName = new JTextField();
        mLabel12 = new JLabel();
        mDescriptionColorBox = new JColorComboBox();

        //======== this ========
        setTitle("Skeddxf"); //NON-NLS
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3", //NON-NLS
            // columns
            "[left]" + //NON-NLS
            "[]", //NON-NLS
            // rows
            "[]" + //NON-NLS
            "[]" + //NON-NLS
            "[]" + //NON-NLS
            "[]" + //NON-NLS
            "[0]" + //NON-NLS
            "[]")); //NON-NLS

        //======== mMenuBar1 ========
        {

            //======== mFileMenu ========
            {
                mFileMenu.setText("File"); //NON-NLS

                //---- mImportMenuItem ----
                mImportMenuItem.setText("Import"); //NON-NLS
                mImportMenuItem.addActionListener(e -> importMenuItemActionPerformed(e));
                mFileMenu.add(mImportMenuItem);

                //---- mExportMenuItem ----
                mExportMenuItem.setText("Export"); //NON-NLS



                mFileMenu.add(mExportMenuItem);

                //---- mExitMenuItem ----
                mExitMenuItem.setText("Exit"); //NON-NLS
                mFileMenu.add(mExitMenuItem);
            }
            mMenuBar1.add(mFileMenu);

            //======== mSettingsMenu ========
            {
                mSettingsMenu.setText("Settings"); //NON-NLS
            }
            mMenuBar1.add(mSettingsMenu);

            //======== mHelpMenu ========
            {
                mHelpMenu.setText("Help"); //NON-NLS
            }
            mMenuBar1.add(mHelpMenu);

            //======== mAboutMenu ========
            {
                mAboutMenu.setText("About"); //NON-NLS
            }
            mMenuBar1.add(mAboutMenu);
        }
        setJMenuBar(mMenuBar1);

        //======== mTablePane ========
        {

            //---- mTable ----
            mTable.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                },
                new String[] {
                    "Point ID", "X", "Y", "Z", "Description" //NON-NLS
                }
            ));
            mTable.setCellSelectionEnabled(true);
            mTable.setSurrendersFocusOnKeystroke(true);
            mTable.setSelectionForeground(Color.lightGray);
            mTable.setAutoCreateRowSorter(true);
            mTablePane.setViewportView(mTable);
        }
        contentPane.add(mTablePane, "cell 0 1,growx"); //NON-NLS

        //---- mButton1 ----
        mButton1.setText("Export to DXF"); //NON-NLS
        mButton1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(mButton1, "cell 1 1"); //NON-NLS

        //---- mLabel13 ----
        mLabel13.setText("Choose File format:"); //NON-NLS
        contentPane.add(mLabel13, "cell 0 2"); //NON-NLS

        //---- mFormatComboBox ----
        mFormatComboBox.addItem("nxyz_comma"); //NON-NLS
        mFormatComboBox.addItem("nxyz_space"); //NON-NLS
        mFormatComboBox.addItem("nxyz_tab"); //NON-NLS
        mFormatComboBox.addItem("nxyzd_comma"); //NON-NLS
        mFormatComboBox.addItem("nxyzd_space"); //NON-NLS
        mFormatComboBox.addItem("nxyzd_tab"); //NON-NLS
        contentPane.add(mFormatComboBox, "cell 0 2,dock center"); //NON-NLS

        //======== mTabbedPane ========
        {

            //======== mPointTab ========
            {

                // JFormDesigner evaluation mark
                mPointTab.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER, //NON-NLS
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12), //NON-NLS
                        java.awt.Color.red), mPointTab.getBorder())); mPointTab.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}}); //NON-NLS

                mPointTab.setLayout(new MigLayout(
                    "fill,insets 0,hidemode 3,aligny center", //NON-NLS
                    // columns
                    "[fill]" + //NON-NLS
                    "[]" + //NON-NLS
                    "[]" + //NON-NLS
                    "[]" + //NON-NLS
                    "[fill]", //NON-NLS
                    // rows
                    "[grow,center]" + //NON-NLS
                    "[grow]")); //NON-NLS

                //---- mLabel15 ----
                mLabel15.setText("Layer:"); //NON-NLS
                mPointTab.add(mLabel15, "cell 1 1,alignx center,growx 0"); //NON-NLS

                //---- mPointName ----
                mPointName.setText("Points"); //NON-NLS
                mPointTab.add(mPointName, "cell 2 1,alignx center,growx 0"); //NON-NLS

                //---- mLabel16 ----
                mLabel16.setText("Color:"); //NON-NLS
                mPointTab.add(mLabel16, "cell 3 1,alignx center,growx 0"); //NON-NLS
                mPointTab.add(mPointColorBox, "cell 4 1,growy"); //NON-NLS
            }
            mTabbedPane.addTab("Point", mPointTab); //NON-NLS

            //======== mNumberTab ========
            {
                mNumberTab.setLayout(new MigLayout(
                    "fill,hidemode 3,align leading top", //NON-NLS
                    // columns
                    "[fill]" + //NON-NLS
                    "[fill]" + //NON-NLS
                    "[fill]" + //NON-NLS
                    "[fill]" + //NON-NLS
                    "[fill]" + //NON-NLS
                    "[fill]", //NON-NLS
                    // rows
                    "[]" + //NON-NLS
                    "[]")); //NON-NLS

                //---- mNumberCheckBox ----
                mNumberCheckBox.setText("Add Numbers"); //NON-NLS
                mNumberTab.add(mNumberCheckBox, "cell 0 0 2 1"); //NON-NLS

                //---- mLabel4 ----
                mLabel4.setText("Text height:"); //NON-NLS
                mNumberTab.add(mLabel4, "cell 0 1,alignx center,growx 0"); //NON-NLS

                //---- mNumberHeight ----
                mNumberHeight.setText("1.000"); //NON-NLS
                mNumberTab.add(mNumberHeight, "cell 1 1"); //NON-NLS

                //---- mLabel5 ----
                mLabel5.setText("Layer:"); //NON-NLS
                mNumberTab.add(mLabel5, "cell 2 1,alignx center,growx 0"); //NON-NLS

                //---- mNumberName ----
                mNumberName.setText("Point_id"); //NON-NLS
                mNumberTab.add(mNumberName, "cell 3 1"); //NON-NLS

                //---- mLabel6 ----
                mLabel6.setText("Color:"); //NON-NLS
                mNumberTab.add(mLabel6, "cell 4 1,alignx center,growx 0"); //NON-NLS
                mNumberTab.add(mNumberColorBox, "cell 5 1,growy"); //NON-NLS
            }
            mTabbedPane.addTab("Number", mNumberTab); //NON-NLS

            //======== mElevationTab ========
            {
                mElevationTab.setLayout(new MigLayout(
                    "fill,hidemode 3,align left top", //NON-NLS
                    // columns
                    "[fill]" + //NON-NLS
                    "[fill]" + //NON-NLS
                    "[fill]" + //NON-NLS
                    "[fill]" + //NON-NLS
                    "[fill]" + //NON-NLS
                    "[fill]", //NON-NLS
                    // rows
                    "[]" + //NON-NLS
                    "[]")); //NON-NLS

                //---- mElevationCheckBox ----
                mElevationCheckBox.setText("Add Elevation"); //NON-NLS
                mElevationTab.add(mElevationCheckBox, "cell 0 0 2 1"); //NON-NLS

                //---- mLabel7 ----
                mLabel7.setText("Text height:"); //NON-NLS
                mElevationTab.add(mLabel7, "cell 0 1,alignx center,growx 0"); //NON-NLS

                //---- mElevationHeight ----
                mElevationHeight.setText("1.000"); //NON-NLS
                mElevationTab.add(mElevationHeight, "cell 1 1"); //NON-NLS

                //---- mLabel8 ----
                mLabel8.setText("Layer:"); //NON-NLS
                mElevationTab.add(mLabel8, "cell 2 1,alignx center,growx 0"); //NON-NLS

                //---- mElevationName ----
                mElevationName.setText("Point_H"); //NON-NLS
                mElevationTab.add(mElevationName, "cell 3 1"); //NON-NLS

                //---- mLabel9 ----
                mLabel9.setText("Color:"); //NON-NLS
                mElevationTab.add(mLabel9, "cell 4 1,alignx center,growx 0"); //NON-NLS
                mElevationTab.add(mElevationColorBox, "cell 5 1,growy"); //NON-NLS
            }
            mTabbedPane.addTab("Elevation", mElevationTab); //NON-NLS

            //======== mDescriptionTab ========
            {
                mDescriptionTab.setLayout(new MigLayout(
                    "fill,hidemode 3,align left top", //NON-NLS
                    // columns
                    "[fill]" + //NON-NLS
                    "[fill]" + //NON-NLS
                    "[fill]" + //NON-NLS
                    "[fill]" + //NON-NLS
                    "[fill]" + //NON-NLS
                    "[fill]", //NON-NLS
                    // rows
                    "[]" + //NON-NLS
                    "[]")); //NON-NLS

                //---- mDescriptionCheckBox ----
                mDescriptionCheckBox.setText("Add Description"); //NON-NLS
                mDescriptionTab.add(mDescriptionCheckBox, "cell 0 0 2 1"); //NON-NLS

                //---- mLabel10 ----
                mLabel10.setText("Text height:"); //NON-NLS
                mDescriptionTab.add(mLabel10, "cell 0 1,alignx center,growx 0"); //NON-NLS

                //---- mDescriptionHeight ----
                mDescriptionHeight.setText("1.000"); //NON-NLS
                mDescriptionTab.add(mDescriptionHeight, "cell 1 1"); //NON-NLS

                //---- mLabel11 ----
                mLabel11.setText("Layer:"); //NON-NLS
                mDescriptionTab.add(mLabel11, "cell 2 1,alignx center,growx 0"); //NON-NLS

                //---- mDescriptionName ----
                mDescriptionName.setText("Point_Desc"); //NON-NLS
                mDescriptionTab.add(mDescriptionName, "cell 3 1"); //NON-NLS

                //---- mLabel12 ----
                mLabel12.setText("Color:"); //NON-NLS
                mDescriptionTab.add(mLabel12, "cell 4 1,alignx center,growx 0"); //NON-NLS
                mDescriptionTab.add(mDescriptionColorBox, "cell 5 1,growy"); //NON-NLS
            }
            mTabbedPane.addTab("Description", mDescriptionTab); //NON-NLS
        }
        contentPane.add(mTabbedPane, "cell 0 3 2 1,dock center"); //NON-NLS
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ilias Koritsas
    private JMenuBar mMenuBar1;
    private JMenu mFileMenu;
    private JMenuItem mImportMenuItem;
    private JMenuItem mExportMenuItem;
    private JMenuItem mExitMenuItem;
    private JMenu mSettingsMenu;
    private JMenu mHelpMenu;
    private JMenu mAboutMenu;
    private JScrollPane mTablePane;
    private JTable mTable;
    private JButton mButton1;
    private JLabel mLabel13;
    private JComboBox mFormatComboBox;
    private JTabbedPane mTabbedPane;
    public JPanel mPointTab;
    private JLabel mLabel15;
    private JTextField mPointName;
    private JLabel mLabel16;
    private JColorComboBox mPointColorBox;
    private JPanel mNumberTab;
    private JCheckBox mNumberCheckBox;
    private JLabel mLabel4;
    private JTextField mNumberHeight;
    private JLabel mLabel5;
    private JTextField mNumberName;
    private JLabel mLabel6;
    private JColorComboBox mNumberColorBox;
    private JPanel mElevationTab;
    private JCheckBox mElevationCheckBox;
    private JLabel mLabel7;
    private JTextField mElevationHeight;
    private JLabel mLabel8;
    private JTextField mElevationName;
    private JLabel mLabel9;
    private JColorComboBox mElevationColorBox;
    private JPanel mDescriptionTab;
    private JCheckBox mDescriptionCheckBox;
    private JLabel mLabel10;
    private JTextField mDescriptionHeight;
    private JLabel mLabel11;
    private JTextField mDescriptionName;
    private JLabel mLabel12;
    private JColorComboBox mDescriptionColorBox;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
