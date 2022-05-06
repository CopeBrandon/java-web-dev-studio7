package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends Disc implements Readable {
    public DVD(int storageCap, boolean hasDRM, boolean writeable, int rpm) {
        super(storageCap, hasDRM, writeable, rpm);
    }

    public DVD(int storageCap, boolean hasDRM, boolean writeable, int rpm, String title, String contentType, ArrayList<Boolean> contents, int usedSpace) {
        super(storageCap, hasDRM, writeable, rpm, title, contentType, contents, usedSpace);
    }
    @Override
    public void spin() {

    }

    @Override
    public void write(ArrayList<Boolean> contents, int usedSpace) {

    }

    @Override
    public String read() {
        return null;
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
