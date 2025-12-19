import java.util.*;

class FirstNumberSmallestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = sc.nextInt();
        boolean isFirstSmallest = firstNumber < secondNumber && firstNumber < thirdNumber;
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
        sc.close();
    }
}
