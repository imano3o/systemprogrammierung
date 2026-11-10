package uebung2.teilaufgabe4a;

import uebung2.Patient;

public class Main4a {
    public static void main(String[] args) {
        Praxis4a praxis = new Praxis4a(2);
        Patient patient1 = new Patient("Mueller", 1, 4000);
        Patient patient2 = new Patient("Mayer", 2, 3000);
        Patient patient3 = new Patient("Holger", 1, 5000);
        Patient patient4 = new Patient("Horst", 1, 7000);
        Patient patient5 = new Patient("Schulze", 2, 5000);
        Patient patient6 = new Patient("Hans", 2, 2000);

        PatientThread4a t1 = new PatientThread4a(praxis, patient1);
        PatientThread4a t2 = new PatientThread4a(praxis, patient2);
        PatientThread4a t3 = new PatientThread4a(praxis, patient3);
        PatientThread4a t4 = new PatientThread4a(praxis, patient4);
        PatientThread4a t5 = new PatientThread4a(praxis, patient5);
        PatientThread4a t6 = new PatientThread4a(praxis, patient6);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
