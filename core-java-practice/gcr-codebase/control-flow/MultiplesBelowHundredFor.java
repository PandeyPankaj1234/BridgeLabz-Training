import java.util.*;

class MultiplesBelowHundredFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number > 0 && number < 100) {
            for (int value = 100; value >= 1; value--)
                if (value % number == 0)
                    System.out.println(value);
        }
        sc.close();
    }
}
