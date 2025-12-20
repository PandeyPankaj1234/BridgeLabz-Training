import java.util.*;

public class SubstringComparison {
    public static String createSubstring(String text, int startIndex, int endIndex) {
        String result = "";
        for (int i = startIndex; i < endIndex; i++){
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String first, String second) {
        if (first.length() != second.length()){
            return false;
        }
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.next();
        System.out.println("Enter start indices for substring:");
        int startIndex = sc.nextInt();
        System.out.println("Enter end indices for substring:");
        int endIndex = sc.nextInt();

        String customSubstring = createSubstring(text, startIndex, endIndex);
        String builtInSubstring = text.substring(startIndex, endIndex);

        boolean result = compareStrings(customSubstring, builtInSubstring);
        System.out.println("Substring Match Result = " + result);
        sc.close();
    }
}
