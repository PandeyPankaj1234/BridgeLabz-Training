import java.util.*;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum size of the array:");
        int maxSize = sc.nextInt();
        double[] values = new double[maxSize];
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.println("Enter a positive number (or non-positive to stop):");
            double input = sc.nextDouble();
            if (input <= 0 || index == maxSize){
                break;
            }
            values[index] = input;
            index++;
        }
        for (int i = 0; i < index; i++) {
            System.out.println(values[i]);
            total += values[i];
        }
        System.out.println("Sum is " + total);
        sc.close();
    }
}
