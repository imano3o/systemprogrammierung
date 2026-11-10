package uebung2.teilaufgabe4b;

import uebung2.Patient;

public class Praxis4b {
    private Behandlungsraum4b[] behandlungsraeume;

    public Praxis4b(int anzahlRaeume) {
        behandlungsraeume = new Behandlungsraum4b[anzahlRaeume];
        for (int i = 0; i < anzahlRaeume; i++) {
            behandlungsraeume[i] = new Behandlungsraum4b(i+1);
        }
    }

    public void patientBehandeln(Patient p) {
        Behandlungsraum4b raum = behandlungsraeume[p.getBehandlungsraum() - 1];
        raum.vormerkenPatient(p);
        raum.startBehandlung(p);
    }
}