package uebung1.teilaufgabe2;


public class Main {
    public static void main(String[] args) {
        Hilfszahl hilfszahl = new Hilfszahl();

        ErhoehenThreadSynchronized thread1 = new ErhoehenThreadSynchronized("1. Thread", hilfszahl);
        ErhoehenThreadSynchronized thread2 = new ErhoehenThreadSynchronized("2. Thread", hilfszahl);
        ErhoehenThreadSynchronized thread3 = new ErhoehenThreadSynchronized("3. Thread", hilfszahl);
    }
}
