import java.util.*;

class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            int factorial = 1;
            for (int counter = 1; counter <= number; counter++)
                factorial *= counter;
            System.out.println(factorial);
        }
        sc.close();
    }
}
