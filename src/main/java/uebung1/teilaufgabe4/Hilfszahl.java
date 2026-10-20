package uebung1.teilaufgabe4;

import java.lang.Thread;

import static java.lang.Character.getName;
import static java.lang.Thread.sleep;

public class Hilfszahl {
    private int wert = 0;

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    public synchronized void increment() {
        int wert = getWert();
        System.out.println(Thread.currentThread().getName() + ": alter Wert: " + wert);
        int erhoeterWert = wert + 1;
        setWert(erhoeterWert);
        System.out.println(Thread.currentThread().getName() + ": neuer Wert: " + getWert());
        try {
            sleep(100);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + ": sleep interrupted");
        }


    }
}


