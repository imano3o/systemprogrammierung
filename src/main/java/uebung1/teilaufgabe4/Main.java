package uebung1.teilaufgabe4;

public class Main {
    public static void main(String[] args) {

        Hilfszahl hilfszahl = new Hilfszahl();

        ThreadClass thread1 = new ThreadClass(hilfszahl, "1. Thread");
        ThreadClass thread2 = new ThreadClass(hilfszahl, "2. Thread");
        ThreadClass thread3 = new ThreadClass(hilfszahl, "3. Thread");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
