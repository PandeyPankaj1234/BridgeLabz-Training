import java.util.*;

public class StringIndexExceptionDemo {
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length() + 1));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length() + 1));
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException Handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.next();

        generateException(text); // will crash
        handleException(text); // safe execution
        sc.close();
    }
}
