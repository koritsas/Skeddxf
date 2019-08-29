package org.koritsas.UI.components;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class JColorComboBox extends JComboBox {

    static Hashtable<String, Color> colors;

    public JColorComboBox() {
        super();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Enumeration colorNames = addColors().keys();
        while(colorNames.hasMoreElements()){
            String temp = colorNames.nextElement().toString();
            model.addElement(temp);
            System.out.println("colors"+temp);
        }
        setModel(model);
        setRenderer(new ColorRenderer());
        this.setOpaque(true);
       // this.setSelectedIndex(0);
    }
    @Override
    public void setSelectedItem(Object anObject) {
        super.setSelectedItem(anObject);

        setBackground((Color)colors.get(anObject));
        setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        if(anObject.toString().equals("BLACK") || anObject.toString().equals("DARK_GRAY")){
            setForeground(Color.white);
        }
    }
    public Color getSelectedColor(){

        return this.getBackground();
    }

    private Hashtable addColors(){

        colors = new <String, Color>Hashtable();


        File colorsFile = new File("src/main/resources/colors.txt");

        try {
            Scanner scanner = new Scanner(colorsFile);

            while (scanner.hasNextLine()){
                String[] colorString= scanner.nextLine().split(",");
                Color color = new Color(Integer.parseInt(colorString[1]),Integer.parseInt(colorString[2]),Integer.parseInt(colorString[3]));

                colors.put(colorString[0],color);
            }





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
/*
        colors.put("WHITE", Color.WHITE);
        colors.put("BLUE", Color.BLUE);
        colors.put("GREEN", Color.GREEN);
        colors.put("YELLOW", Color.YELLOW);
        colors.put("ORANGE", Color.ORANGE);
        colors.put("CYAN", Color.CYAN);
        colors.put("DARK_GRAY", Color.DARK_GRAY);
        colors.put("GRAY", Color.GRAY);
        colors.put("RED", Color.RED);
        colors.put("PINK",Color.PINK);
        colors.put("MAGENTA", Color.MAGENTA);
        colors.put("BLACK", Color.BLACK);
*/
        return colors;
    }

    class ColorRenderer extends JLabel implements javax.swing.ListCellRenderer {
        public ColorRenderer() {
            this.setOpaque(true);
        }
        public Component getListCellRendererComponent(JList list, Object key, int index,
                                                      boolean isSelected, boolean cellHasFocus) {

            Color color = colors.get(key);;
            String name = key.toString();

            list.setSelectionBackground(null);
            list.setSelectionForeground(null);

            if(isSelected){
                setBorder(BorderFactory.createEtchedBorder());
            } else {
                setBorder(null);
            }
            setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
            setBackground(color);
            setText(name);
            setForeground(Color.black);
            if(name.equals("BLACK") || name.equals("DARK_GRAY")){
                setForeground(Color.white);
            }

            return this;
        }
    }
}