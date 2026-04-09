import java.util.*;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            numbers[i] = sc.nextInt();
        }

        for (int value : numbers) {
            if (value > 0) {
                if (value % 2 == 0){
                    System.out.println(value + " is Positive and Even");
                }
                else{
                    System.out.println(value + " is Positive and Odd");
                }
            } 
            else if (value < 0){
                System.out.println(value + " is Negative");
            }
            else{
                System.out.println(value + " is Zero");
            }
        }
        if (numbers[0] == numbers[n - 1]){
            System.out.println("First and Last elements are Equal");
        }
        else if (numbers[0] > numbers[n - 1]){
            System.out.println("First element is Greater than Last");
        }
        else{
            System.out.println("First element is Less than Last");
        }

        sc.close();
    }
}
