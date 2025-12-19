import java.util.*;

class LargestNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        System.out.println(
                "Is the first number the largest? " + (firstNumber > secondNumber && firstNumber > thirdNumber));
        System.out.println(
                "Is the second number the largest? " + (secondNumber > firstNumber && secondNumber > thirdNumber));
        System.out.println(
                "Is the third number the largest? " + (thirdNumber > firstNumber && thirdNumber > secondNumber));
        sc.close();
    }
}
