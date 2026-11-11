package uebung2.teilaufgabe4c;

import uebung2.Patient;

import java.util.concurrent.Semaphore;

import static java.lang.Thread.sleep;

public class Behandlungsraum4c {
    private int raumNummer;

    public Behandlungsraum4c(int raumNummer) {
        this.raumNummer = raumNummer;
    }

    private Semaphore semaphore = new Semaphore(1);

    public void vormerkenPatient(Patient patient) {
        patient.setAufnahmezeitpunkt(System.currentTimeMillis());
        System.out.println(patient.getName() + " wartet auf Behandlung in Zimmer " + raumNummer);
    }

    public void starteBehandlung(Patient patient) {
        try {
            semaphore.acquire(); // P: Eintritt in die kritische Region (Raum belegen)
        } catch (InterruptedException e) {
            System.out.println("acquire interrupted");
            return;
        }

        try {
            patient.setBehandlungsstart(System.currentTimeMillis());
            System.out.println("Behandlung von " + patient.getName() + " in Zimmer " + raumNummer
                    + " gestartet. Behandlungszeit: " + (patient.getBehandlungsdauer() / 1000) + " Sekunden");
            try {
                sleep(patient.getBehandlungsdauer()); // Behandlung simulieren
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Patient " + patient.getName() + " hatte eine Wartezeit von " + patient.getWartezeit() + " Sekunden.");
        } finally {
            semaphore.release(); // V: Verlassen der kritischen Region (Raum freigeben)
        }
    }
}