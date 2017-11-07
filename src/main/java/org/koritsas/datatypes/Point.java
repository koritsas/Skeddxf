package org.koritsas.datatypes;

import java.util.Arrays;
import java.util.List;

public class Point {
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    public double getZ() {
        return Z;
    }

    public void setZ(double z) {
        Z = z;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String Id, description;
    private double X,Y,Z;
    private Metadata metadata;

    public Point(String id, double x, double y,double z){
        this.Id = id;
        this.X = x;
        this.Y = y;
        this.Z = z;
    }




    public Point(String id, double x, double y, double z, String description){
        this.Id = id;
        this.X = x;
        this.Y = y;
        this.Z = z;
        this.description = description;
    }


    public String[] toArray(){

        String[] pointArray;

        if(description == null) {
            pointArray = new String[]{Id, Double.toString(X), Double.toString(Y), Double.toString(Z)};
        }else{
            pointArray = new String[]{Id, Double.toString(X), Double.toString(Y), Double.toString(Z), description};
        }
        return pointArray;
    }

    public List<String> toList(){

        return Arrays.asList(toArray());
    }

    @Override
    public String toString(){
        String point ="ID: "+toArray()[0]+" X: "+toArray()[1]+" Y: "+toArray()[2]+" Z: "+toArray()[3];

        if (description !=null){
            point=point+" Description: "+toArray()[4];
        }

        return point;
    }
}
