import java.util.*;

class BMIFitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input height in meters
        System.out.println("Enter height in meters:");
        double heightInMeters = sc.nextDouble();

        // input weight in kilograms
        System.out.println("Enter weight in kilograms:");
        double weightInKg = sc.nextDouble();

        // BMI Formula
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        System.out.println("BMI is: " + bmi);

        // BMI category check
        if (bmi < 18.5)
            System.out.println("Category: Underweight");
        else if (bmi >= 18.5 && bmi < 25)
            System.out.println("Category: Normal");
        else
            System.out.println("Category: Overweight");

        sc.close();
    }
}
