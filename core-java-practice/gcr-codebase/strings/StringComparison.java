import java.util.*;

public class StringComparison {
    public static boolean compareUsingCharAt(String firstText, String secondText) {
        if (firstText.length() != secondText.length()){
            return false;
        }
        for (int i = 0; i < firstText.length(); i++) {
            if (firstText.charAt(i) != secondText.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First string:");
        String firstText = sc.next();
        System.out.println("Enter Second string:");
        String secondText = sc.next();

        boolean charAtResult = compareUsingCharAt(firstText, secondText);
        boolean equalsResult = firstText.equals(secondText);

        System.out.println("charAt Comparison Result = " + charAtResult);
        System.out.println("equals() Result = " + equalsResult);
        sc.close();
    }
}
