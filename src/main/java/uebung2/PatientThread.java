package uebung2;

public class PatientThread extends Thread {
    Praxis praxis;

    public PatientThread(Praxis praxis, String name) {
        super(name);
        this.praxis = praxis;
    }

    @Override
    public void run() {}
}
