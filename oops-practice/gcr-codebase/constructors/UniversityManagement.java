import java.util.*;

class Student {
    public int rollNumber; // public: accessible everywhere
    protected String name; // protected: accessible in subclass
    private double CGPA; // private: accessible only within this class

    // constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

// subclass to demonstrate protected access
class PostgraduateStudent extends Student {

    PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    void displayPGStudent() {
        System.out.println("Roll Number: " + rollNumber); // public access
        System.out.println("Name: " + name); // protected access
        System.out.println("CGPA: " + getCGPA()); // private via method
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Amit", 8.5);

        pg.displayPGStudent();

        pg.setCGPA(9.0); // modifying CGPA using public method
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}
