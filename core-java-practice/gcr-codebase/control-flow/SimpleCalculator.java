import java.util.*;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double firstNumber = sc.nextDouble();
        System.out.print("Enter second number: ");
        double secondNumber = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
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
