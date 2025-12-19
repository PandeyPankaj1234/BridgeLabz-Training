import java.util.*;

class FirstNumberSmallestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        boolean isFirstSmallest = firstNumber < secondNumber && firstNumber < thirdNumber;
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
        sc.close();
    }
}
