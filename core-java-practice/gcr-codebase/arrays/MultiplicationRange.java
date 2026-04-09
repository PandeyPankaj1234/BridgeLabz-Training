import java.util.*;

public class MultiplicationRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to generate its multiplication table from 6 to 9:");
        int number = sc.nextInt();
        int start = 6, end = 9;
        int[] result = new int[end - start + 1];

        int index = 0;
        for (int i = start; i <= end; i++) {
            result[index] = number * i;
            index++;
        }

        index = 0;
        for (int i = start; i <= end; i++) {
            System.out.println(number + " * " + i + " = " + result[index]);
            index++;
        }
        sc.close();
    }
}
