package tiy.day15; 

public class Doctor extends Person{     // doc is everything  person is & more

       boolean isCertified;
       String specialty;

    public Doctor() { // Created a default constructor
        // super();
        this.isCertified = false; // ???why is the constructor false ????
    }

    public void walk() {
//        super.walk();
        System.out.println("This is a **Doctor** walking!");
    }
}
