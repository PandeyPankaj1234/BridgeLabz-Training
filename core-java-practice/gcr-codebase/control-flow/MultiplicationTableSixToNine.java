import java.util.*;

class MultiplicationTableSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        for (int multiplier = 6; multiplier <= 9; multiplier++)
            System.out.println(number + " * " + multiplier + " = " + (number * multiplier));
        sc.close();
    }
}
