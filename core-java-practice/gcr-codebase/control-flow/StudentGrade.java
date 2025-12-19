import java.util.*;

class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int physicsMarks = sc.nextInt();
        int chemistryMarks = sc.nextInt();
        int mathsMarks = sc.nextInt();
        double average = (physicsMarks + chemistryMarks + mathsMarks) / 3.0;
        System.out.println("Average = " + average);
        if (average >= 90)
            System.out.println("Grade A : Excellent");
        else if (average >= 75)
            System.out.println("Grade B : Very Good");
        else if (average >= 60)
            System.out.println("Grade C : Good");
        else if (average >= 40)
            System.out.println("Grade D : Pass");
        else
            System.out.println("Grade F : Fail");
        sc.close();
    }
}
