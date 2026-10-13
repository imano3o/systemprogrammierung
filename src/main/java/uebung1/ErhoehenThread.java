package uebung1;

public class ErhoehenThread extends Thread {
    private Hilfszahl hilfszahl;

    public ErhoehenThread(Hilfszahl hilfszahl, String name) {
        super(name);
        this.hilfszahl = hilfszahl;
    }

    public void run() {
        int wert = hilfszahl.getWert();
        System.out.println(getName() + ": alter Wert: " + wert);
        int erhoeterWert = wert + 1;

        try {
            sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        hilfszahl.setWert(erhoeterWert);
        System.out.println(getName() + ": neuer Wert: " + hilfszahl.getWert());

    }
}
