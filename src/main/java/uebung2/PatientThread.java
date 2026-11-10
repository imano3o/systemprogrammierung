package uebung2;

public class PatientThread extends Thread {
    Praxis praxis;
    Patient patient;

    public PatientThread(Praxis praxis, Patient patient) {
        this.praxis = praxis;
        this.patient = patient;
    }

    @Override
    public void run() {
        praxis.patientBehandeln(patient);
    }
}
