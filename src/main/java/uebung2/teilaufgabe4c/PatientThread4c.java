package uebung2.teilaufgabe4c;

import uebung2.Patient;

public class PatientThread4c extends Thread {
    Praxis4c praxis;
    Patient patient;

    public PatientThread4c(Praxis4c praxis, Patient patient) {
        this.praxis = praxis;
        this.patient = patient;
    }

    @Override
    public void run() {
        praxis.patientBehandeln(patient);
    }
}