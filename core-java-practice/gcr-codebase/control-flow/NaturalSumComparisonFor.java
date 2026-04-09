import java.util.*;

class NaturalSumComparisonFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number > 0) {
            int loopSum = 0;
            for (int counter = 1; counter <= number; counter++)
                loopSum += counter;
            int formulaSum = number * (number + 1) / 2;
            System.out.println(loopSum + " " + formulaSum);
        }
        sc.close();
    }
}
