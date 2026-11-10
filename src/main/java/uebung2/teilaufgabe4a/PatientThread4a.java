package uebung2.teilaufgabe4a;

import uebung2.Patient;

public class PatientThread4a extends Thread {
    Praxis4a praxis;
    Patient patient;

    public PatientThread4a(Praxis4a praxis, Patient patient) {
        this.praxis = praxis;
        this.patient = patient;
    }

    @Override
    public void run() {
        praxis.patientBehandeln(patient);
    }
}
