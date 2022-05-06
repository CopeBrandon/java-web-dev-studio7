package org.launchcode.studio7;

import java.util.ArrayList;

public interface Readable {
    public void spin();
    public void write(ArrayList<Boolean> contents, int usedSpace);
    public String read();


}
