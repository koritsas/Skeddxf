package org.koritsas.utils;

import org.koritsas.datatypes.Point;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileParser {

    private File mFile;
    private String mRegex;
    private String[][] mData;
    private Vector<Vector<String>> dataVector,pointVector;

    private List<Point> mPoints = new ArrayList<>();

    public FileParser(File file,String regex){
        this.mFile = file;
        this.mRegex = regex;
    }

    public Vector<Vector<String>> getPointVector() {
        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pointVector;
    }

    private void readFile() throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(mFile)));

        dataVector= new Vector<Vector<String>>();
        pointVector = new Vector<Vector<String>>();
        /*while(br.readLine() != null){

            String[] line =br.readLine().split(mRegex) ;
            Vector<String> data = new Vector<String>();
            data.addAll(Arrays.asList(br.readLine().trim().split(mRegex)));
            dataVector.add(data);

        }*/

        Stream<String> stream = br.lines();

        List<String[]> lines=stream.map(s -> s.trim().split(mRegex)).collect(Collectors.toList());

        lines.stream().forEach(strings -> dataVector.add(new Vector<>(Arrays.asList(strings))));

        //dataVector.stream().forEach(v -> v.stream().filter(s -> s.contains(":")));

        for (String[] s:lines){

            List<String> point=Arrays.asList(s).stream().filter(s1 -> s1.contains(":")== false).collect(Collectors.toList());
            List<String> meta = Arrays.asList(s).stream().filter(s1 -> s1.contains(":")).collect(Collectors.toList());
            pointVector.add(new Vector<>(point));
            Point p;
            if (point.size() <5) {

                double d1 = Double.parseDouble(point.get(1));
                double d2 = Double.parseDouble(point.get(2));
                double d3 = Double.parseDouble(point.get(3));
                p = new Point(point.get(0), Double.parseDouble(point.get(1)), Double.parseDouble(point.get(2)), Double.parseDouble(point.get(3)));
            }else{
                p = new Point(point.get(0), Double.parseDouble(point.get(1)), Double.parseDouble(point.get(2)), Double.parseDouble(point.get(3)),point.get(4));
            }

            mPoints.add(p);

        }

        mPoints.stream().forEach(point -> System.out.println(point.toString()));
    }

    public List<Point> getPoints(){

        return mPoints;
    }

    public Vector<Vector<String>> getDataVector() {
        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataVector;
    }


}
