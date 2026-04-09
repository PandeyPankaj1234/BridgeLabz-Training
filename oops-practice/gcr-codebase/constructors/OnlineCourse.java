import java.util.*;

class Course {
    // instance variables
    String courseName;
    int duration; // duration in months
    double fee;

    // class variable (common for all courses)
    static String instituteName = "ABC Institute";

    // parameterized constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // instance method to display course details
    void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
    }

    // class method to update institute name
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

public class OnlineCourse {
    public static void main(String[] args) {
        Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("Data Structures", 4, 30000);

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
        System.out.println();

        Course.updateInstituteName("XYZ Technologies");

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}
