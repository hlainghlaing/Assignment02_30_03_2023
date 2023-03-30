package scm.com.ojt.classobject;

public class Main {

    public static void main(String[] args) {
        // Declare & Instantiate Myanmar Class Obj
        Myanmar mynObj = new Myanmar();
        mynObj.showPopulation();
        mynObj.showCountryInfo();

        // Declare & Instantiate Japan Class Object
        Japan jpnObj = new Japan();
        jpnObj.showPopulation();
        jpnObj.showCountryInfo();

        // output using get method from Myanmar object
        System.out.println("\nMyanmar country size : " + aboutMyn().getCountrySize());
        System.out.println("Myanmar country Flag Colors : " + aboutMyn().getCountryFlag());

        // testing overloading method
        Myanmar mynObj2 = aboutMyn("676,578 km²", "Yellow / Green / Red / White");
        System.out.println("\n Output using method overloading");
        System.out.println("Myanmar country size : " + mynObj2.getCountrySize());
        System.out.println("Myanmar country Flag Colors : " + mynObj2.getCountryFlag());

    }

    // Encapsulation
    public static Myanmar aboutMyn() {
        Myanmar about = new Myanmar();

        // insert object data using set method
        about.setCountrySize("676,578 km²");
        about.setCountryFlag("Yellow / Green / Red / White");
        return about;
    }

    // Polymorphism method overloading
    public static Myanmar aboutMyn(String size, String flag) {
        Myanmar about = new Myanmar();

        // insert object data using set method
        about.setCountrySize(size);
        about.setCountryFlag(flag);
        return about;
    }

}
