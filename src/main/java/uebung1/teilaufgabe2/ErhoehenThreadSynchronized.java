package uebung1.teilaufgabe2;

public class ErhoehenThreadSynchronized extends Thread {
    Hilfszahl hilfszahl;

    public ErhoehenThreadSynchronized(String name, Hilfszahl hilfszahl ) {
        super(name);
        this.hilfszahl = hilfszahl;
        // TODO: start in main methode oder konstruktor?
        start();
    }

    public void run() {
        synchronized(hilfszahl) {
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
        }
    }
}
