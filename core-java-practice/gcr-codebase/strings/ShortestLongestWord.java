import java.util.*;

public class ShortestLongestWord {
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

    public static int[] findShortestLongest(String[] words) {
        int shortest = findLength(words[0]);
        int longest = findLength(words[0]);

        for (int i = 1; i < words.length; i++) {
            int currentLength = findLength(words[i]);
            if (currentLength < shortest){
                shortest = currentLength;
            }
            if (currentLength > longest){
                longest = currentLength;
            }
        }
        return new int[] { shortest, longest };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        int[] result = findShortestLongest(words);

        System.out.println("Shortest Word Length = " + result[0]);
        System.out.println("Longest Word Length = " + result[1]);
        sc.close();
    }
}
