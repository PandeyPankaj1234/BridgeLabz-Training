import java.util.*;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstNumber = sc.nextDouble();
        double secondNumber = sc.nextDouble();
        String operator = sc.next();
        switch (operator) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                System.out.println(secondNumber != 0 ? firstNumber / secondNumber : "Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid Operator");
        }
        sc.close();
    }
}
