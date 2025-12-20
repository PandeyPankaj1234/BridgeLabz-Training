import java.util.*;

public class WordSplitComparison {
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

    public static boolean compareArrays(String[] first, String[] second) {
        if (first.length != second.length){
            return false;
        }
        for (int i = 0; i < first.length; i++) {
            if (!first[i].equals(second[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        String[] customWords = splitWords(text);
        String[] builtInWords = text.split(" ");

        boolean result = compareArrays(customWords, builtInWords);
        System.out.println("Split Result Match = " + result);
        sc.close();
    }
}
