import java.util.*;

class NaturalSumComparisonWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            int loopSum = 0;
            int counter = 1;
            while (counter <= number) {
                loopSum += counter;
                counter++;
            }
            int formulaSum = number * (number + 1) / 2;
            System.out.println(loopSum + " " + formulaSum);
        }
        sc.close();
    }
}
