package org.koritsas.datatypes;

public class Metadata{

    private double HSDV,VSDV,PDOP,HDOP,VDOP;
    private Status STATUS;
    private int SATS;
    private String DATE;
    private String TIME;


    public double getHSDV() {
        return HSDV;
    }

    public double getVSDV() {
        return VSDV;
    }

    public double getPDOP() {
        return PDOP;
    }

    public double getHDOP() {
        return HDOP;
    }

    public double getVDOP() {
        return VDOP;
    }

    public Status getSTATUS() {
        return STATUS;
    }

    public int getSATS() {
        return SATS;
    }

    public String getDATE() {
        return DATE;
    }

    public String getTIME() {
        return TIME;
    }

    public Metadata(double HSDV, double VSDV, Status STATUS, int SATS, double PDOP, double HDOP, double VDOP, String DATE, String TIME ){
        this.HSDV = HSDV;
        this.VSDV = VSDV;
        this.STATUS = STATUS;
        this.SATS = SATS;
        this.PDOP = PDOP;
        this.HDOP = HDOP;
        this.VDOP = VDOP;
        this.DATE = DATE;
        this.TIME = TIME;

    }

}
