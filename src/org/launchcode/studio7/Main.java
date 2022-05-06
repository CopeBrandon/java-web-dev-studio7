package org.launchcode.studio7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Boolean> bonJoviSong = new ArrayList<>();
        for(int i=0;i<100;i++){
            double rand=Math.random();
            if(rand>.5){bonJoviSong.add(true);} else {bonJoviSong.add(false);}
        }
        // TODO: Declare and initialize a CD and a DVD object.
        CD writeable = new CD(10, false, true, 5400);
        CD bonJovi = new CD(10, true, false, 5400, "The Man Who Sold the World", "Music Album", bonJoviSong, 9);

        System.out.println(writeable.read());
        System.out.println(bonJovi.read());
        writeable.write(bonJoviSong, 9);
        bonJovi.write(bonJoviSong, 9);
        System.out.println(writeable.read());
        System.out.println(bonJovi.read());
        System.out.println(bonJovi.getUsedSpace());
        System.out.println(bonJovi.getRpm());
        System.out.println(bonJovi.getDRM());
        System.out.println(bonJovi.getTitle());
        System.out.println(writeable.getDRM());
        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
