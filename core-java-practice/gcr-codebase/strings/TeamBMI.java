import java.util.*;

public class TeamBMI {
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5){
            return "Underweight";
        }
        else if (bmi < 25){
            return "Normal";
        }
        else if (bmi < 30){
            return "Overweight";
        }
        else{
            return "Obese";
        }
    }
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightInMeter = data[i][1] / 100;

            double bmi = weight / (heightInMeter * heightInMeter);
            String status = getBMIStatus(bmi);

            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }
    public static void display(String[][] report) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println(report[i][0] + "\t\t" + report[i][1] + "\t\t" + report[i][2] + "\t" + report[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight of person " + (i + 1));
            data[i][0] = sc.nextDouble();
            System.out.println("Enter height(cm) of person " + (i + 1));
            data[i][1] = sc.nextDouble();
        }
        String[][] report = calculateBMI(data);
        display(report);
        sc.close();
    }
}
