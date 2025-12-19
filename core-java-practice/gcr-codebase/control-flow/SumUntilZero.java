import java.util.*;

class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalSum = 0;
        while (true) {
            System.out.print("Enter a number (zero to stop): ");
            double inputValue = sc.nextDouble();
            if (inputValue == 0)
                break;
            totalSum += inputValue;
        }
        System.out.println(totalSum);
        sc.close();
    }
}
