package uebung2.teilaufgabe4a;

import uebung2.Behandlungsraum;
import uebung2.Patient;

public class Praxis4a {
    private Behandlungsraum[] behandlungsraeume;

    public Praxis4a(int anzahlRaeume) {
        behandlungsraeume = new Behandlungsraum[anzahlRaeume];
        for (int i = 0; i < anzahlRaeume; i++) {
            behandlungsraeume[i] = new Behandlungsraum();
        }
    }

    public void patientBehandeln(Patient p) {
        // TODO p.getBehandlungsraum() oder p.getBehandlungsraum() - 1?
        Behandlungsraum raum = behandlungsraeume[p.getBehandlungsraum()];
        raum.vormerkenPatient(p);
        raum.startBehandlung(p);
    }
}
