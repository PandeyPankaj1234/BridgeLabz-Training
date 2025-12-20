import java.util.*;

public class ZaraBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int employeeCount = 10;
        double[] salaries = new double[employeeCount];
        double[] yearsOfService = new double[employeeCount];
        double[] bonusAmount = new double[employeeCount];
        double[] newSalary = new double[employeeCount];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < employeeCount; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ":");
            double salary = sc.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1) + ":");
            double service = sc.nextDouble();
            if (salary <= 0 || service < 0) {
                i--;
                continue;
            }
            salaries[i] = salary;
            yearsOfService[i] = service;
        }
        for (int i = 0; i < employeeCount; i++) {
            if (yearsOfService[i] > 5)
                bonusAmount[i] = salaries[i] * 0.05;
            else
                bonusAmount[i] = salaries[i] * 0.02;

            newSalary[i] = salaries[i] + bonusAmount[i];
            totalBonus += bonusAmount[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);
        sc.close();
    }
}
