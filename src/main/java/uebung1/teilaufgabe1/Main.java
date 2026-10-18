package uebung1.teilaufgabe1;

public class Main {
    public static void main(String[] args) {
        Hilfszahl hilfszahl = new Hilfszahl();

        ErhoehenThread thread1 = new ErhoehenThread(hilfszahl, "1. Thread");
        ErhoehenThread thread2 = new ErhoehenThread(hilfszahl, "2. Thread");
        ErhoehenThread thread3 = new ErhoehenThread(hilfszahl, "3. Thread");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
