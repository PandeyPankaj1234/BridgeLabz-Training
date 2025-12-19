import java.util.*;

class MultiplesBelowHundredWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0 && number < 100) {
            int counter = 99;
            while (counter > 1) {
                if (counter % number == 0)
                    System.out.println(counter);
                counter--;
            }
        }
        sc.close();
    }
}
