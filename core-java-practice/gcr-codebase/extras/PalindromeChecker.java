import java.util.*;

public class PalindromeChecker {

    // method to take input string
    public static String takeInput(Scanner sc) {
        System.out.println("Enter a string:");
        return sc.nextLine();
    }

    // method to check palindrome
    public static boolean isPalindrome(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // method to display result
    public static void displayResult(String text, boolean result) {
        if (result){
            System.out.println(text + " is a Palindrome");
        }
        else{
            System.out.println(text + " is NOT a Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = takeInput(sc);
        boolean result = isPalindrome(input);
        displayResult(input, result);

        sc.close();
    }
}
