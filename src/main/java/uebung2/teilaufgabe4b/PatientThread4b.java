package uebung2.teilaufgabe4b;

import uebung2.Patient;

public class PatientThread4b extends Thread {
    Praxis4b praxis;
    Patient patient;

    public PatientThread4b(Praxis4b praxis, Patient patient) {
        this.praxis = praxis;
        this.patient = patient;
    }

    @Override
    public void run() {
        praxis.patientBehandeln(patient);
    }
}
