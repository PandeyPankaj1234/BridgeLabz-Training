import java.util.*;

class FizzBuzzFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            for (int counter = 1; counter <= number; counter++) {
                if (counter % 3 == 0 && counter % 5 == 0)
                    System.out.println("FizzBuzz");
                else if (counter % 3 == 0)
                    System.out.println("Fizz");
                else if (counter % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(counter);
            }
        }
        sc.close();
    }
}
