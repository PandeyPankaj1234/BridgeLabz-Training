import java.util.*; 

class Student {
    String name;
    int rollNumber;
    int marks;

    // method to calculate grade based on marks
    char calculateGrade() {
        if (marks >= 90){
            return 'A';
        }
        else if (marks >= 75){
            return 'B';
        }
        else if (marks >= 60){
            return 'C';
        }
        else if (marks >= 40){
            return 'D';
        }
        else{
            return 'F';
        }
    }

    // method to display student details and grade
    void displayReport() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter student name: ");
        s.name = sc.nextLine();

        System.out.print("Enter roll number: ");
        s.rollNumber = sc.nextInt();

        System.out.print("Enter marks: ");
        s.marks = sc.nextInt();

        s.displayReport();

        sc.close();
    }
}
