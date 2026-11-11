package uebung2;

public class Praxis {
    private Behandlungsraum[] behandlungsraeume;

    public Praxis(int anzahlRaeume) {
        behandlungsraeume = new Behandlungsraum[anzahlRaeume];
        for (int i = 0; i < anzahlRaeume; i++) {
            behandlungsraeume[i] = new Behandlungsraum(i+1);
        }
    }

    public void patientBehandeln(Patient p) {
        Behandlungsraum raum = behandlungsraeume[p.getBehandlungsraum()-1];
        raum.vormerkenPatient(p);
        raum.starteBehandlung(p);
    }
}
