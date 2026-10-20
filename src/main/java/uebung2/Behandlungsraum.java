package uebung2;

import static java.lang.Thread.sleep;

public class Behandlungsraum {
    public void vormerkenPatient(Patient patient) {
        patient.setAufnahmezeitpunkt(System.currentTimeMillis());
        System.out.println(patient.getName() + " wartet auf Behandlung in Zimmer " + patient.getBehandlungsraum());
    }

    public void startBehandlung(Patient patient) {
        patient.setBehandlungsstart(System.currentTimeMillis());
        try {
            sleep(patient.getBehandlungsdauer());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Behandlung von " + patient.getName() + " in Zimmer " + patient.getBehandlungsraum()
                + " gestartet. Behandlungszeit: " + (patient.getBehandlungsdauer() / 1000) + " Sekunden");
        System.out.println("Patient " + patient.getName() + " hatte eine Wartezeit von " + patient.getWartezeit() + " Sekunden.");
    }
}
