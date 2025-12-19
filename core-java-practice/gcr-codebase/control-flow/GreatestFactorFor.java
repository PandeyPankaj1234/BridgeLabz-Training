import java.util.*;

class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int greatestFactor = 1;
        for (int counter = number - 1; counter >= 1; counter--) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
        }
        System.out.println(greatestFactor);
        sc.close();
    }
}
