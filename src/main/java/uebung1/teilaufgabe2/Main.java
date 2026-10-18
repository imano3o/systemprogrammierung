package uebung1.teilaufgabe2;


import uebung1.teilaufgabe1.ErhoehenThread;

public class Main {
    public static void main(String[] args) {
        HilfszahlSynchronized hilfszahl = new HilfszahlSynchronized();

        ErhoehenThreadSynchronized thread1 = new ErhoehenThreadSynchronized("1. Thread", hilfszahl);
        ErhoehenThreadSynchronized thread2 = new ErhoehenThreadSynchronized("2. Thread", hilfszahl);
        ErhoehenThreadSynchronized thread3 = new ErhoehenThreadSynchronized("3. Thread", hilfszahl);
    }
}
