package uebung2.teilaufgabe4c;

import uebung2.Patient;

public class Main4c {
    public static void main(String[] args) {
        Praxis4c praxis = new Praxis4c(2);
        Patient patient1 = new Patient("Mueller", 1, 4000);
        Patient patient2 = new Patient("Mayer", 2, 3000);
        Patient patient3 = new Patient("Holger", 1, 5000);
        Patient patient4 = new Patient("Horst", 1, 7000);
        Patient patient5 = new Patient("Schulze", 2, 5000);
        Patient patient6 = new Patient("Hans", 2, 2000);

        PatientThread4c t1 = new PatientThread4c(praxis, patient1);
        PatientThread4c t2 = new PatientThread4c(praxis, patient2);
        PatientThread4c t3 = new PatientThread4c(praxis, patient3);
        PatientThread4c t4 = new PatientThread4c(praxis, patient4);
        PatientThread4c t5 = new PatientThread4c(praxis, patient5);
        PatientThread4c t6 = new PatientThread4c(praxis, patient6);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}