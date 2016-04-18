package tiy.day15;

import java.util.HashMap;

public class Hospital {

    boolean isRegistered;

    HashMap<String, Doctor> doctorsByLastName =
            new HashMap<String, Doctor>();

    HashMap<String, Nurse> nursesByLastName =
            new HashMap<String, Nurse>();

    HashMap<String, Patient> patientsByLastName =
            new HashMap<String, Patient>();

    public Hospital() { // Created a default constructor
        this.isRegistered = false;
    }

    public void printInfo() { // added a method

        System.out.println("You're at Coconut Grove Hospital");
        System.out.println("Located at: 1794 Hospital Drive.  Tunapuna, Trinidad & Tobago || 868-370-7812");
        System.out.println("* Currently have 3 Doctors & 6 Nurses on Staff.");
        System.out.println("* A 488-bed, private, not-for-profit hospital – is a leader in patient care that’s helped" +
                " " + "the Trinidadian community. ");
        System.out.println("* Provides 24-hour emergency services plus all major medical, surgical and diagnostic " +
                "care.");
        System.out.println("* Founded in 1994");
/*    for(String currentLastName : doctorsByLastName.keySet()) { // <<-- for loop
        System.out.println("Dr." + currentLastName);
    }
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    for (String currentLastName : nursesByLastName.keySet()) { // <<-- for loop
        System.out.println("RN." + currentLastName);
    }
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    for (String currentLastName : patientsByLastName.keySet()) { // <<-- for loop
        System.out.println("Patient: " + currentLastName);
    }
*/
    }

    public void DocInfo() {
        /* for (String currentLastName : doctorsByLastName.keySet()) {
            System.out.println(currentLastName);
        } */
    }
}
