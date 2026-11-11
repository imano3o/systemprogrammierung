package uebung2.teilaufgabe4a;

import uebung2.Behandlungsraum;
import uebung2.Patient;

public class Praxis4a {
    private Behandlungsraum[] behandlungsraeume;

    public Praxis4a(int anzahlRaeume) {
        behandlungsraeume = new Behandlungsraum[anzahlRaeume];
        for (int i = 0; i < anzahlRaeume; i++) {
            behandlungsraeume[i] = new Behandlungsraum(i + 1);
        }
    }

    public void patientBehandeln(Patient p) {
        Behandlungsraum raum = behandlungsraeume[p.getBehandlungsraum() - 1];
        raum.vormerkenPatient(p);
        synchronized (raum) {
            raum.starteBehandlung(p);
        }
    }
}
