import java.util.*;

class FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            int factorial = 1;
            int counter = 1;
            while (counter <= number) {
                factorial *= counter;
                counter++;
            }
            System.out.println(factorial);
        }
        sc.close();
    }
}
