import java.util.*;

class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        for (int currentNumber = 1; currentNumber <= limit; currentNumber++)
            System.out.println(currentNumber + " is " + (currentNumber % 2 == 0 ? "Even" : "Odd"));
        sc.close();
    }
}
