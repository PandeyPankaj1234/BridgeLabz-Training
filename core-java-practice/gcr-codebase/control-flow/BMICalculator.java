import java.util.*;

class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weightKg = sc.nextDouble();
        double heightCm = sc.nextDouble();
        double heightMeter = heightCm / 100;
        double bmi = weightKg / (heightMeter * heightMeter);
        System.out.println("BMI = " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
        sc.close();
    }
}
