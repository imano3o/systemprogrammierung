package uebung2;

public class Praxis {
    private Behandlungsraum[] behandlungsraeume;

    public Praxis(int anzahlRaeume) {
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
