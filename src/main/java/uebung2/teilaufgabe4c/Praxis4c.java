package uebung2.teilaufgabe4c;

import uebung2.Patient;

public class Praxis4c {
    private Behandlungsraum4c[] behandlungsraeume;

    public Praxis4c(int anzahlRaeume) {
        behandlungsraeume = new Behandlungsraum4c[anzahlRaeume];
        for (int i = 0; i < anzahlRaeume; i++) {
            behandlungsraeume[i] = new Behandlungsraum4c(i + 1);
        }
    }

    public void patientBehandeln(Patient p) {
        Behandlungsraum4c raum = behandlungsraeume[p.getBehandlungsraum() - 1];
        raum.vormerkenPatient(p);
        raum.startBehandlung(p);
    }
}