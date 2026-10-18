package uebung1.teilaufgabe3;

public class Main {
    public static void main(String[] args) {
        Hilfszahl hilfszahl = new Hilfszahl();

        ErhoehenThreadSemaphore thread1 = new ErhoehenThreadSemaphore("1. Thread", hilfszahl);
        ErhoehenThreadSemaphore thread2 = new ErhoehenThreadSemaphore("2. Thread", hilfszahl);
        ErhoehenThreadSemaphore thread3 = new ErhoehenThreadSemaphore("3. Thread", hilfszahl);

    }
}
