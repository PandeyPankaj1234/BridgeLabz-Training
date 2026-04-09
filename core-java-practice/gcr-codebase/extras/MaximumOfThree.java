import java.util.*;

public class MaximumOfThree {

    // method to take input from user
    public static int[] takeInput(Scanner sc) {
        int[] numbers = new int[3];
        System.out.println("Enter first number:");
        numbers[0] = sc.nextInt();
        System.out.println("Enter second number:");
        numbers[1] = sc.nextInt();
        System.out.println("Enter third number:");
        numbers[2] = sc.nextInt();
        return numbers;
    }

    // method to find maximum value
    public static int findMaximum(int[] numbers) {
        int maximumValue = numbers[0];
        if (numbers[1] > maximumValue)
            maximumValue = numbers[1];
        if (numbers[2] > maximumValue)
            maximumValue = numbers[2];
        return maximumValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] userNumbers = takeInput(sc);
        int maximum = findMaximum(userNumbers);

        System.out.println("Maximum number is: " + maximum);

        sc.close();
    }
}
