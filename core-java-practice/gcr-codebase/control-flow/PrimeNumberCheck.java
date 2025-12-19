import java.util.*;

class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true;
        if (number <= 1)
            isPrime = false;
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime Number" : "Not a Prime Number");
        sc.close();
    }
}
