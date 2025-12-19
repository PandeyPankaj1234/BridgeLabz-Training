import java.util.*;

class PowerUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();
        int result = 1;
        for (int counter = 1; counter <= power; counter++)
            result *= number;
        System.out.println(result);
        sc.close();
    }
}
