import java.util.*;

public class StudentScores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        // taking number of students with validation
        while (true) {
            try {
                System.out.print("Enter number of students: ");
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("Number of students must be greater than 0.");
                    continue;
                }
                break;
            } 
            catch (Exception e) {
                System.out.println("Invalid input. Enter a valid number.");
                sc.nextLine();
            }
        }

        double[] scores = new double[n];
        double sum = 0;

        // taking scores with validation
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("Enter score of student " + (i + 1) + ": ");
                    scores[i] = sc.nextDouble();
                    if (scores[i] < 0) {
                        System.out.println("Score cannot be negative.");
                        continue;
                    }
                    sum += scores[i];
                    break;
                } 
                catch (Exception e) {
                    System.out.println("Invalid input. Enter numeric score.");
                    sc.nextLine();
                }
            }
        }

        double average = sum / n;

        double highest = scores[0];
        double lowest = scores[0];

        // finding highest and lowest scores
        for (int i = 1; i < n; i++) {
            if (scores[i] > highest)
                highest = scores[i];
            if (scores[i] < lowest)
                lowest = scores[i];
        }

        System.out.println("\nAverage Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        // displaying scores above average
        System.out.println("\nScores above average:");
        for (int i = 0; i < n; i++) {
            if (scores[i] > average) {
                System.out.println(scores[i]);
            }
        }

        sc.close();
    }
}
