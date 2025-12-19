import java.util.*;

class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sumOfDivisors = 0;
        for (int divisor = 1; divisor < number; divisor++) {
            if (number % divisor == 0)
                sumOfDivisors += divisor;
        }
        System.out.println(sumOfDivisors > number ? "Abundant Number" : "Not an Abundant Number");
        sc.close();
    }
}
