package uebung1.teilaufgabe3;

import java.util.concurrent.Semaphore;

public class ErhoehenThreadSemaphore extends Thread {
    private static final Semaphore semaphore = new Semaphore(1);
    private Hilfszahl hilfszahl;

    public ErhoehenThreadSemaphore(String name, Hilfszahl hilfszahl) {
        super(name);
        this.hilfszahl = hilfszahl;
        start();
    }

    public void run() {
        try {
            semaphore.acquire(); // P: Eintritt in die kritische Region
        } catch (InterruptedException e) {
            System.out.println(getName() + ": acquire interrupted");
            return;
        }

        try {
            int wert = hilfszahl.getWert();
            System.out.println(getName() + ": alter Wert: " + wert);

            int erhoeterWert = wert + 1;

            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println(getName() + ": sleep interrupted");
            }

            hilfszahl.setWert(erhoeterWert);
            System.out.println(getName() + ": neuer Wert: " + hilfszahl.getWert());
        } finally {
            semaphore.release(); // V: Verlassen der kritischen Region
        }
    }
}
