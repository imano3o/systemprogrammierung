package uebung1.teilaufgabe4;

public class ThreadClass extends Thread {
    Hilfszahl hilfszahl;

    public ThreadClass(Hilfszahl hilfszahl, String name) {
        super(name);
        this.hilfszahl = hilfszahl;
    }

    @Override
    public void run() {
        hilfszahl.increment();
    }
}
