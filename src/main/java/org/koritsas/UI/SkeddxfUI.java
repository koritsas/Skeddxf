package org.koritsas.UI;

import java.awt.*;
import java.awt.event.*;
import java.nio.file.Paths;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.tree.DefaultMutableTreeNode;

import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Thu Nov 02 16:01:21 EET 2017
 */



/**
 * @author Ilias Koritsas
 */
public class SkeddxfUI extends JFrame {
    public SkeddxfUI() {
        initComponents();
    }

    private void importMenuItemMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void importMenuItemMouseClicked() {
        // TODO add your code here
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
        mScrollPane1 = new JScrollPane();
        mTree1 = new JTree();
        mTablePane = new JScrollPane();
        mTable = new JTable();
        mLabel13 = new JLabel();
        mFormatComboBox = new JComboBox();
        mTabbedPane = new JTabbedPane();
        mPointTab = new JPanel();
        mLabel15 = new JLabel();
        mPointName = new JTextField();
        mLabel16 = new JLabel();
        mNumberTab = new JPanel();
        mNumberCheckBox = new JCheckBox();
        mLabel4 = new JLabel();
        mNumberHeight = new JTextField();
        mLabel5 = new JLabel();
        mNumberName = new JTextField();
        mLabel6 = new JLabel();
        mElevationTab = new JPanel();
        mElevationCheckBox = new JCheckBox();
        mLabel7 = new JLabel();
        mElevationHeight = new JTextField();
        mLabel8 = new JLabel();
        mElevationName = new JTextField();
        mLabel9 = new JLabel();
        mDescriptionTab = new JPanel();
        mDescriptionCheckBox = new JCheckBox();
        mLabel10 = new JLabel();
        mDescriptionHeight = new JTextField();
        mLabel11 = new JLabel();
        mDescriptionName = new JTextField();
        mLabel12 = new JLabel();

        //======== this ========
        setTitle("Skeddxf"); //NON-NLS
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3", //NON-NLS
            // columns
            "[fill]" + //NON-NLS
            "[fill]", //NON-NLS
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

        //======== mScrollPane1 ========
        {
            mScrollPane1.setViewportView(mTree1);
        }
        contentPane.add(mScrollPane1, "cell 0 1"); //NON-NLS

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
            mTablePane.setViewportView(mTable);
        }
        contentPane.add(mTablePane, "cell 1 1"); //NON-NLS

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
        contentPane.add(mFormatComboBox, "cell 1 2"); //NON-NLS

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
            }
            mTabbedPane.addTab("Number", mNumberTab); //NON-NLS

            //======== mElevationTab ========
            {
                mElevationTab.setLayout(new MigLayout(
                    "fill,hidemode 3,align left top", //NON-NLS
                    // columns
                    "[fill]" + //NON-NLS
                    "[fill]" + //NON-NLS
                    "[]" + //NON-NLS
                    "[]" + //NON-NLS
                    "[]" + //NON-NLS
                    "[]", //NON-NLS
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
    private JScrollPane mScrollPane1;
    private JTree mTree1;
    private JScrollPane mTablePane;
    private JTable mTable;
    private JLabel mLabel13;
    private JComboBox mFormatComboBox;
    private JTabbedPane mTabbedPane;
    public JPanel mPointTab;
    private JLabel mLabel15;
    private JTextField mPointName;
    private JLabel mLabel16;
    private JPanel mNumberTab;
    private JCheckBox mNumberCheckBox;
    private JLabel mLabel4;
    private JTextField mNumberHeight;
    private JLabel mLabel5;
    private JTextField mNumberName;
    private JLabel mLabel6;
    private JPanel mElevationTab;
    private JCheckBox mElevationCheckBox;
    private JLabel mLabel7;
    private JTextField mElevationHeight;
    private JLabel mLabel8;
    private JTextField mElevationName;
    private JLabel mLabel9;
    private JPanel mDescriptionTab;
    private JCheckBox mDescriptionCheckBox;
    private JLabel mLabel10;
    private JTextField mDescriptionHeight;
    private JLabel mLabel11;
    private JTextField mDescriptionName;
    private JLabel mLabel12;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
