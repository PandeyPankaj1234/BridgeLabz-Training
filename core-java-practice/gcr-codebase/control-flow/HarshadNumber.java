import java.util.*;

class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int sumOfDigits = 0;
        while (temp != 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        System.out.println(number % sumOfDigits == 0 ? "Harshad Number" : "Not a Harshad Number");
        sc.close();
    }
}
