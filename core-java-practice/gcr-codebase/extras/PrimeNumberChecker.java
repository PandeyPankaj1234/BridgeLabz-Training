import java.util.*;

public class PrimeNumberChecker {

    // method to check prime number
    public static boolean isPrime(int number) {
        if (number <= 1){
            return false;
        }
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int inputNumber = sc.nextInt();

        boolean result = isPrime(inputNumber);

        if (result){
            System.out.println(inputNumber + " is a Prime Number");
        }
        else{
            System.out.println(inputNumber + " is not a Prime Number");
        }

        sc.close();
    }
}
