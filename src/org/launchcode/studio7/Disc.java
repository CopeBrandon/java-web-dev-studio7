package org.launchcode.studio7;
import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Disc {
    int storageCap;
    int usedSpace;
    String title;
    ArrayList<Boolean> contents = new ArrayList<>();
    String contentType;
    boolean hasDRM;
    int rpm;
    boolean writeable;

    public Disc(int storageCap, boolean hasDRM, boolean writeable, int rpm){
        this.storageCap=storageCap; this.hasDRM=hasDRM; this.writeable=writeable; this.rpm=rpm;
    }

    public Disc(int storageCap, boolean hasDRM, boolean writeable, int rpm, String title, String contentType, ArrayList<Boolean> contents, int usedSpace) {
        this.storageCap=storageCap; this.hasDRM=hasDRM; this.writeable=writeable;this.title=title;this.contentType=contentType;this.contents=contents;this.usedSpace=usedSpace;
    }

    public int getStorageCap(){
        return storageCap;
    }
    public int getUsedSpace(){
        return usedSpace;
    }
    public String getTitle(){
        return title;
    }
    public boolean checkDRM(){
        return hasDRM;
    }
    public int getRpm(){
        return rpm;
    }
    public boolean getDRM(){
        return hasDRM;
    }
    public String discProperties(){
        return "Disc Properties:\nName: "+this.title+"\nCapacity: "+this.storageCap+"\nFree Storage: "+(storageCap-usedSpace)+"\nContent Type: "+contentType;
    }
    public boolean getWriteable(){
        return writeable;
    }
}
