import java.util.*;

public class StringLengthWithoutBuiltIn {
    public static int findLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } 
            catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.next();

        int customLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Custom Length = " + customLength);
        System.out.println("Built-in Length = " + builtInLength);
        sc.close();
    }
}
