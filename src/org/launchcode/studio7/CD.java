package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends Disc implements Readable{
    public CD(int storageCap, boolean hasDRM, boolean writeable, int rpm) {
        super(storageCap, hasDRM, writeable, rpm);
    }
    public CD(int storageCap, boolean hasDRM, boolean writeable, int rpm, String title, String contentType, ArrayList<Boolean> contents, int usedSpace) {
        super(storageCap, hasDRM, writeable, rpm, title, contentType, contents, usedSpace);
    }

    // TODO: Implement your custom interface.
    @Override
    public void spin() {
        System.out.println("The disc has spun " + this.getRpm() + " times.");
    }

    @Override
    public void write(ArrayList<Boolean> contents, int usedSpace) {
        if(this.getWriteable()) {
            this.spin();
            this.contents=contents;
            this.usedSpace=usedSpace;
        } else {
            System.out.println("You cannot write on this disc.");
        }
    }

    @Override
    public String read() {
        spin();
        if(contents==null||!contents.isEmpty()) {
            String contentString = "";
            for (int i = 0; i < contents.size(); i++) {
                if (contents.get(i)) {
                    contentString += "1";
                } else {
                    contentString += "0";
                }
            }
            return contentString;
        } else {
            return "This disk is empty";
        }
    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
