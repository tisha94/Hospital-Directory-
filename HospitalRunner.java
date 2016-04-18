package tiy.day15; 

import javafx.stage.DirectoryChooser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HospitalRunner {

    static ArrayList<Doctor> hospitalDoctors;
    static ArrayList<Nurse> hospitalNurses;
    static ArrayList<Patient> hospitalPatient;

    static Hospital myHospital = new Hospital(); // GLOBAL Hospital; cre8ing a hospital object, while calling
    // Hospital class.
    //static Directory myDirectory = new Directory();

    public static void main(String[] arg) {
        hospitalDoctors = new ArrayList<Doctor>();

        Doctor doctor1 = new Doctor();
        doctor1.fName = "Billy";
        doctor1.lName = "Bob";
        doctor1.isCertified = true;
//            hospitalDoctors.add(doctor1); // add doc's to the Array Loop
        myHospital.doctorsByLastName.put(doctor1.lName, doctor1); // storing doc's last name in myHospital.doctorsByLastName

        Doctor doctor2 = new Doctor();
        doctor2.fName = "Jimmy";
        doctor2.lName = "Dean";
        doctor2.isCertified = true;
        myHospital.doctorsByLastName.put(doctor2.lName, doctor2); // storing doc's last name

        Doctor doctor3 = new Doctor();
        doctor3.fName = "Casper";
        doctor3.lName = "Ghost";
        doctor3.isCertified = false;
        myHospital.doctorsByLastName.put(doctor3.lName, doctor3); // storing doc's last name

        hospitalNurses = new ArrayList<Nurse>();

        Nurse nurse1 = new Nurse();
        nurse1.fName = "Tugg";
        nurse1.lName = "Tuggy";
        nurse1.isLiscensed = true;
        myHospital.nursesByLastName.put(nurse1.lName, nurse1); // storing nurse's last name

        Nurse nurse2 = new Nurse();
        nurse2.fName = "Speed";
        nurse2.lName = "Speedy";
        nurse2.isLiscensed = false;
        myHospital.nursesByLastName.put(nurse2.lName, nurse2);

        Nurse nurse3 = new Nurse();
        nurse3.fName = "Barf";
        nurse3.lName = "Barfy";
        nurse3.isLiscensed = false;
        myHospital.nursesByLastName.put(nurse3.lName, nurse3);

        Nurse nurse4 = new Nurse();
        nurse4.fName = "Fogell";
        nurse4.lName = "Mogell";
        nurse4.isLiscensed = true;
        myHospital.nursesByLastName.put(nurse4.lName, nurse4);

        Nurse nurse5 = new Nurse();
        nurse5.fName = "Yogli";
        nurse5.lName = "Mogli";
        nurse5.isLiscensed = false;
        myHospital.nursesByLastName.put(nurse5.lName, nurse5);

        Nurse nurse6 = new Nurse();
        nurse6.fName = "Greg";
        nurse6.lName = "Greggy";
        nurse6.isLiscensed = true;
        myHospital.nursesByLastName.put(nurse6.lName, nurse6);


        hospitalPatient = new ArrayList<Patient>();

        Patient patient1 = new Patient();
        patient1.fName = "John";
        patient1.lName = "Shaft";
        patient1.isInsured = true;
        myHospital.patientsByLastName.put(patient1.lName, patient1);

        Patient patient2 = new Patient();
        patient2.fName = "Pimps";
        patient2.lName = "Pippi";
        patient2.isInsured = true;
        myHospital.patientsByLastName.put(patient2.lName, patient2);

        Patient patient3 = new Patient();
        patient3.fName = "Pippi";
        patient3.lName = "Arizona";
        patient3.isInsured = true;
        myHospital.patientsByLastName.put(patient3.lName, patient3);

        Patient patient4 = new Patient();
        patient4.fName = "Apple";
        patient4.lName = "Pimps";
        patient4.isInsured = true;
        myHospital.patientsByLastName.put(patient4.lName, patient4);

        Patient patient5 = new Patient();
        patient5.fName = "Lili";
        patient5.lName = "Von";
        patient5.isInsured = true;
        myHospital.patientsByLastName.put(patient5.lName, patient5);

        Patient patient6 = new Patient();
        patient6.fName = "Sugar";
        patient6.lName = "Kane";
        patient6.isInsured = true;
        myHospital.patientsByLastName.put(patient6.lName, patient6);

        Patient patient7 = new Patient();
        patient7.fName = "Mango";
        patient7.lName = "Stein";
        patient7.isInsured = true;
        myHospital.patientsByLastName.put(patient7.lName, patient7);

        Patient patient8 = new Patient();
        patient8.fName = "Straw";
        patient8.lName = "Berry";
        patient8.isInsured = true;
        myHospital.patientsByLastName.put(patient8.lName, patient8);

        Patient patient9 = new Patient();
        patient9.fName = "Kiwi";
        patient9.lName = "Herman";
        patient9.isInsured = true;
        myHospital.patientsByLastName.put(patient9.lName, patient9);

        Patient patient10 = new Patient();
        patient10.fName = "Canty";
        patient10.lName = "Loope";
        patient10.isInsured = true;
        myHospital.patientsByLastName.put(patient10.lName, patient10);

        // myHospital.printInfo(); // called printInfo(); Method from Hospital class to Print info!!
        hospitalDirectory();

    }

    public static void hospitalDirectory() {

        System.out.println("Hospital Directory, select options 1-5 ");

        while (true) {
            System.out.println("1. Hospital Information");
            System.out.println("2. Doctor Information");
            System.out.println("3. Nurse Information");
            System.out.println("4. Patient Information");
            System.out.println("5. Exit");

            Scanner questionScanner = new Scanner(System.in); // creating new scanner
            String userAnswer = questionScanner.nextLine(); //starting answer scanner for userAnswer/ storing scanner
            // operation in userAnswer


            System.out.println("userAnswer = " + userAnswer);

            if (userAnswer.equals("1")) {
                myHospital.printInfo();
            } else if (userAnswer.equals("2")) { //if statment has 2 have a boolean vale.
                while (true) {
                    for (String currentLastName : myHospital.doctorsByLastName.keySet()) {
                        System.out.println("Dr." + currentLastName);
                    }
                    System.out.println("Please Enter Doctor's Last Name of your choosing");
                    System.out.println("Type 'Back' to Return to Hospital Directory.");
                    Scanner docScanner = new Scanner(System.in); //bout to make a Scanner named docScanner,
                    String docInfo = docScanner.nextLine();

                    if (docInfo.equals("Bob")) {
                        Doctor myDoctor1 = myHospital.doctorsByLastName.get(docInfo);
                        System.out.println("Dr." + myDoctor1.fName + " " + myDoctor1.lName);
                        System.out.println("12 Years of Practice ");
                        System.out.println("Dr." + myDoctor1.lName + " Is Board Certified ");
                        System.out.println("--------------------------------------------------");
                    } else if (docInfo.equals("Dean")) {
                        Doctor myDoctor2 = myHospital.doctorsByLastName.get(docInfo);
                        System.out.println("Dr." + myDoctor2.fName + " " + myDoctor2.lName);
                        System.out.println("29 Years of Practice ");
                        System.out.println("Dr." + myDoctor2.lName + " Is Board Certified ");
                        System.out.println("--------------------------------------------------");
                    } else if (docInfo.equals("Ghost")) {
                        Doctor myDoctor3 = myHospital.doctorsByLastName.get(docInfo);
                        System.out.println("Dr." + myDoctor3.fName + " " + myDoctor3.lName);
                        System.out.println("2 Years of Practice ");
                        System.out.println("Dr." + myDoctor3.lName + " Certification Pending.... ");
                        System.out.println("--------------------------------------------------");
                    } else if (docInfo.equals("Back")) {
                        HospitalRunner.hospitalDirectory();
                    }
                }

            } else if (userAnswer.equals("3")) {
                while (true) {
                    for (String currentLastName : myHospital.nursesByLastName.keySet()) {
                        System.out.println("RN." + currentLastName);
                    }
                    System.out.println("Please Enter Nurse's Last Name of your choosing");
                    System.out.println("Type 'Back' to Return to Hospital Directory.");
                    Scanner nuScanner = new Scanner(System.in); //bout to make a Scanner named docScanner,
                    String nurseInfo = nuScanner.nextLine();

                    if (nurseInfo.equals("Tuggy")) {
                        Nurse myNurse1 = myHospital.nursesByLastName.get(nurseInfo);
                        System.out.println("RN." + myNurse1.fName + " " + myNurse1.lName);
                        System.out.println("Graduated from an approved nursing program. ");
                        System.out.println("RN." + myNurse1.lName + " Is Licenced ");
                        System.out.println("--------------------------------------------------");
                    } else if (nurseInfo.equals("Speedy")) {
                        Nurse myNurse2 = myHospital.nursesByLastName.get(nurseInfo);
                        System.out.println("RN." + myNurse2.fName + " " + myNurse2.lName);
                        System.out.println("Graduated from an approved nursing program. ");
                        System.out.println("RN." + myNurse2.lName + " Is Licenced ");
                        System.out.println("--------------------------------------------------");
                    } else if (nurseInfo.equals("Barfy")) {
                        Nurse myNurse3 = myHospital.nursesByLastName.get(nurseInfo);
                        System.out.println("RN." + myNurse3.fName + " " + myNurse3.lName);
                        System.out.println("N/A ");
                        System.out.println("RN." + myNurse3.lName + " Licence Pending.... ");
                        System.out.println("--------------------------------------------------");
                    } else if (nurseInfo.equals("Mogell")) {
                        Nurse myNurse4 = myHospital.nursesByLastName.get(nurseInfo);
                        System.out.println("RN." + myNurse4.fName + " " + myNurse4.lName);
                        System.out.println("Graduated from an approved nursing program. ");
                        System.out.println("RN." + myNurse4.lName + " Is Licenced ");
                        System.out.println("--------------------------------------------------");
                    } else if (nurseInfo.equals("Mogli")) {
                        Nurse myNurse5 = myHospital.nursesByLastName.get(nurseInfo);
                        System.out.println("RN." + myNurse5.fName + " " + myNurse5.lName);
                        System.out.println("N/A ");
                        System.out.println("RN." + myNurse5.lName + " Licence Pending.... ");
                        System.out.println("--------------------------------------------------");
                    } else if (nurseInfo.equals("Greggy")) {
                        Nurse myNurse6 = myHospital.nursesByLastName.get(nurseInfo);
                        System.out.println("RN." + myNurse6.fName + " " + myNurse6.lName);
                        System.out.println("N/A ");
                        System.out.println("RN." + myNurse6.lName + " Licence Pending.... ");
                        System.out.println("--------------------------------------------------");
                    } else if (nurseInfo.equals("Back")) {
                        HospitalRunner.hospitalDirectory();
                    }
                }
            } else if (userAnswer.equals("4")) {
                while (true) {
                    for (String currentLastName : myHospital.patientsByLastName.keySet()) {
                        System.out.println("Patient: " + currentLastName);
                    }
                    System.out.println("Please Enter Patients Last Name of your choosing");
                    System.out.println("Type 'Back' to Return to Hospital Directory.");
                    Scanner patScanner = new Scanner(System.in); //bout to make a Scanner named docScanner,
                    String patientInfo = patScanner.nextLine();

                    if (patientInfo.equals("Shaft")) {
                        Patient myPatient1 = myHospital.patientsByLastName.get(patientInfo);
                        System.out.println("Patient: " + myPatient1.fName + " " + myPatient1.lName);
                        System.out.println("Age: 65 ");
                        System.out.println("Has EBOLA o.O ");
                        System.out.println("Patient: " + myPatient1.lName + " Is Insured ");
                        System.out.println("--------------------------------------------------");
                    } else if (patientInfo.equals("Pippi")) {
                        Patient myPatient2 = myHospital.patientsByLastName.get(patientInfo);
                        System.out.println("Patient: " + myPatient2.fName + " " + myPatient2.lName);
                        System.out.println("Age: 32 ");
                        System.out.println("Broken Wrist");
                        System.out.println("Patient: " + myPatient2.lName + " Is Insured ");
                        System.out.println("--------------------------------------------------");
                    } else if (patientInfo.equals("Arizona")) {
                        Patient myPatient3 = myHospital.patientsByLastName.get(patientInfo);
                        System.out.println("Patient: " + myPatient3.fName + " " + myPatient3.lName);
                        System.out.println("Age: 21 ");
                        System.out.println("Suicide");
                        System.out.println("Patient: " + myPatient3.lName + " D.O.A_______________");
                        System.out.println("--------------------------------------------------");
                    } else if (patientInfo.equals("Pimps")) {
                        Patient myPatient4 = myHospital.patientsByLastName.get(patientInfo);
                        System.out.println("Patient: " + myPatient4.fName + " " + myPatient4.lName);
                        System.out.println("Age: 98 ");
                        System.out.println("Broken Toe");
                        System.out.println("Patient: " + myPatient4.lName + " Is Insured ");
                        System.out.println("--------------------------------------------------");
                    } else if (patientInfo.equals("Von")) {
                        Patient myPatient5 = myHospital.patientsByLastName.get(patientInfo);
                        System.out.println("Patient: " + myPatient5.fName + " " + myPatient5.lName);
                        System.out.println("Age: 6 ");
                        System.out.println("Fell of bed ");
                        System.out.println("Patient: " + myPatient5.lName + " Is Insured ");
                        System.out.println("--------------------------------------------------");
                    } else if (patientInfo.equals("Kane")) {
                        Patient myPatient6 = myHospital.patientsByLastName.get(patientInfo);
                        System.out.println("Patient: " + myPatient6.fName + " " + myPatient6.lName);
                        System.out.println("Age: 89 ");
                        System.out.println("Broken Spine ");
                        System.out.println("Patient: " + myPatient6.lName + " D.O.A________________ ");
                        System.out.println("--------------------------------------------------");
                    } else if (patientInfo.equals("Stein")) {
                        Patient myPatient7 = myHospital.patientsByLastName.get(patientInfo);
                        System.out.println("Patient: " + myPatient7.fName + " " + myPatient7.lName);
                        System.out.println("Age: 45 ");
                        System.out.println("Shot in the Heart ");
                        System.out.println("Patient: " + myPatient7.lName + " D.O.A________________ ");
                        System.out.println("--------------------------------------------------");
                    } else if (patientInfo.equals("Berry")) {
                        Patient myPatient8 = myHospital.patientsByLastName.get(patientInfo);
                        System.out.println("Patient: " + myPatient8.fName + " " + myPatient8.lName);
                        System.out.println("Age: 16 ");
                        System.out.println("Contracted A.I.D.S..");
                        System.out.println("Patient: " + myPatient8.lName + " Is Insured ");
                        System.out.println("--------------------------------------------------");
                    } else if (patientInfo.equals("Herman")) {
                        Patient myPatient9 = myHospital.patientsByLastName.get(patientInfo);
                        System.out.println("Patient: " + myPatient9.fName + " " + myPatient9.lName);
                        System.out.println("Age: 35 ");
                        System.out.println("Knife Wounds ");
                        System.out.println("Patient: " + myPatient9.lName + " Is Insured ");
                        System.out.println("--------------------------------------------------");
                    } else if (patientInfo.equals("Loope")) {
                        Patient myPatient10 = myHospital.patientsByLastName.get(patientInfo);
                        System.out.println("Patient: " + myPatient10.fName + " " + myPatient10.lName);
                        System.out.println("Age: 18 ");

                        System.out.println("Arrived With Bullet wounds in head");
                        System.out.println("Patient: " + myPatient10.lName + " D.O.A______________ ");
                        System.out.println("--------------------------------------------------");
                    } else if (patientInfo.equals("Back")) {
                        HospitalRunner.hospitalDirectory();
                    }
                }
            } else if (userAnswer.equals("5")) {
                System.exit(1); // exit
            }
        }
    }
}
