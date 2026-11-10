package uebung2.teilaufgabe4b;

import uebung2.Patient;

public class Main4b {
    public static void main(String[] args) {
        Praxis4b praxis = new Praxis4b(2);
        Patient patient1 = new Patient("Mueller", 1, 4000);
        Patient patient2 = new Patient("Mayer", 2, 3000);
        Patient patient3 = new Patient("Holger", 1, 5000);
        Patient patient4 = new Patient("Horst", 1, 7000);
        Patient patient5 = new Patient("Schulze", 2, 5000);
        Patient patient6 = new Patient("Hans", 2, 2000);

        PatientThread4b t1 = new PatientThread4b(praxis, patient1);
        PatientThread4b t2 = new PatientThread4b(praxis, patient2);
        PatientThread4b t3 = new PatientThread4b(praxis, patient3);
        PatientThread4b t4 = new PatientThread4b(praxis, patient4);
        PatientThread4b t5 = new PatientThread4b(praxis, patient5);
        PatientThread4b t6 = new PatientThread4b(praxis, patient6);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
