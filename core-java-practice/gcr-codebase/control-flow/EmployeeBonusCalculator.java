import java.util.*;

class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int yearsOfService = sc.nextInt();
        if (yearsOfService > 5)
            System.out.println("Bonus = " + (salary * 0.05));
        else
            System.out.println("Bonus = 0");
        sc.close();
    }
}
