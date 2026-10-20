package uebung2;

public class Patient {
    private String name;
    private int behandlungsraum;
    private long behandlungsdauer; // in Millisekunden
    private long aufnahmezeitpunkt;
    private long behandlungsstart;

    public Patient(String name, int behandlungsraum, long behandlungsdauer) {
        this.name = name;
        this.behandlungsraum = behandlungsraum;
        this.behandlungsdauer = behandlungsdauer;
    }

    public int getBehandlungsraum() {
        return behandlungsraum;
    }

    public String getName() {
        return name;
    }

    public long getBehandlungsdauer() {
        return behandlungsdauer;
    }

    public void setAufnahmezeitpunkt(long aufnahmezeitpunkt) {
        this.aufnahmezeitpunkt = aufnahmezeitpunkt;
    }

    public void setBehandlungsstart(long behandlungsstart) {
        this.behandlungsstart = behandlungsstart;
    }

    public long getWartezeit() {
        return (behandlungsstart - aufnahmezeitpunkt) / 1000; // in Sekunden
    }
}
