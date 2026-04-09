import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to generate its multiplication table:");
        int number = sc.nextInt();
        int size = 10;
        int[] table = new int[size];

        for (int i = 0; i < size; i++) {
            table[i] = number * (i + 1);
        }

        for (int i = 0; i < size; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
        sc.close();
    }
}
