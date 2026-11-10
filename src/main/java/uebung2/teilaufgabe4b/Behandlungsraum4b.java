package uebung2.teilaufgabe4b;

import uebung2.Patient;

import static java.lang.Thread.sleep;

public class Behandlungsraum4b {
    public void vormerkenPatient(Patient patient) {
        patient.setAufnahmezeitpunkt(System.currentTimeMillis());
        System.out.println(patient.getName() + " Wartet auf Behandlung in Zimmer " + patient.getBehandlungsraum());
    }

    public synchronized void starteBehandlung(Patient patient) {
        patient.setBehandlungsstart(System.currentTimeMillis());
        System.out.println("Behandlung von " + patient.getName() + " in Zimmer " + patient.getBehandlungsraum()
                + " gestartet Behandlungszeit " + (patient.getBehandlungsdauer() / 1000) + " Sekunden");
        try {
            sleep(patient.getBehandlungsdauer()); // Behandlung simulieren
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Patient " + patient.getName() + " hatte eine Wartezeit von " + patient.getWartezeit() + " Sekunden");
    }
}
