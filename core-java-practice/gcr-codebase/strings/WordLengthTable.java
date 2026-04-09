import java.util.*;

public class WordLengthTable {
    public static int findLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } 
            catch (Exception e) {
                break;
            }
        }
        return count;
    }

    public static String[] splitWords(String text) {
        int length = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' '){
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        String currentWord = "";

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' '){
                currentWord += text.charAt(i);
            }
            else {
                words[index++] = currentWord;
                currentWord = "";
            }
        }
        words[index] = currentWord;
        return words;
    }

    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = wordWithLength(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }
        sc.close();
    }
}
