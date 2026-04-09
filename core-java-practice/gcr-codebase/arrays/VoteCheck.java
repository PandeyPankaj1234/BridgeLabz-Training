import java.util.*;

public class VoteCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int numberOfStudents = sc.nextInt();
        int[] studentAges = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter age of student " + (i + 1) + ":");
            studentAges[i] = sc.nextInt();
        }
        for (int i = 0; i < numberOfStudents; i++) {
            if (studentAges[i] < 0){
                System.out.println("Invalid age");
            }
            else if (studentAges[i] >= 18){
                System.out.println("The student with the age " + studentAges[i] + " can vote");
            }
            else{
                System.out.println("The student with the age " + studentAges[i] + " cannot vote");
            }
        }
        sc.close();
    }
}
