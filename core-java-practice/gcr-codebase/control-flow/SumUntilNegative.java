import java.util.*;

class SumUntilNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalSum = 0;
        while (true) {
            double inputValue = sc.nextDouble();
            if (inputValue <= 0)
                break;
            totalSum += inputValue;
        }
        System.out.println(totalSum);
        sc.close();
    }
}
