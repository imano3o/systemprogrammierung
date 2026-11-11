package uebung2;

import static java.lang.Thread.sleep;

public class Behandlungsraum {
    private int raumNummer;

    public Behandlungsraum(int raumNummer) {
        this.raumNummer = raumNummer;
    }

    public void vormerkenPatient(Patient patient) {
        patient.setAufnahmezeitpunkt(System.currentTimeMillis());
        System.out.println(patient.getName() + " wartet auf Behandlung in Zimmer " + raumNummer);
    }

    public void starteBehandlung(Patient patient) {
        patient.setBehandlungsstart(System.currentTimeMillis());
        System.out.println("Behandlung von " + patient.getName() + " in Zimmer " + raumNummer
                + " gestartet. Behandlungszeit: " + (patient.getBehandlungsdauer() / 1000) + " Sekunden");
        try {
            sleep(patient.getBehandlungsdauer());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Patient " + patient.getName() + " hatte eine Wartezeit von " + patient.getWartezeit() + " Sekunden.");
    }
}
