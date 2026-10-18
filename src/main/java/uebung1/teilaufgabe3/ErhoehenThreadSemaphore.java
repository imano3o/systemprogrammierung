package uebung1.teilaufgabe3;

import uebung1.teilaufgabe2.HilfszahlSynchronized;

import java.util.concurrent.Semaphore;

public class ErhoehenThreadSemaphore extends Thread {
    private static final Semaphore semaphore = new Semaphore(1);
    private HilfszahlSemaphore hilfszahl;

    public ErhoehenThreadSemaphore(String name, HilfszahlSemaphore hilfszahl) {
        super(name);
        this.hilfszahl = hilfszahl;
        start();
    }

    public void run() {

    }
}
