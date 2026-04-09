import java.util.*;

public class FibonacciSequence {

    // method to generate and print fibonacci sequence
    public static void generateFibonacci(int terms) {
        int first = 0, second = 1, next;
        if (terms <= 0){
            return;
        }
        System.out.print(first + " ");
        if (terms == 1){
            return;
        }
        System.out.print(second + " ");
        for (int i = 3; i <= terms; i++) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of terms:");
        int n = sc.nextInt();

        generateFibonacci(n);

        sc.close();
    }
}
