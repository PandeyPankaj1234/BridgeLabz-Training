import java.util.*;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int originalNumber = number;
        int sumOfCubes = 0;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sumOfCubes += digit * digit * digit;
            originalNumber /= 10;
        }
        System.out.println(sumOfCubes == number ? "Armstrong Number" : "Not an Armstrong Number");
        sc.close();
    }
}
