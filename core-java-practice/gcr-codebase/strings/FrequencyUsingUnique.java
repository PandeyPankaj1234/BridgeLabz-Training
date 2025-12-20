import java.util.*;

public class FrequencyUsingUnique {
    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    unique = false;
                    break;
                }
            }

            if (unique){
                temp[index++] = current;
            }
        }

        char[] unique = new char[index];
        for (int i = 0; i < index; i++){
            unique[i] = temp[i];
        }
        return unique;
    }

    public static String[][] frequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++){
            freq[text.charAt(i)]++;
        }
        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.next();
        String[][] result = frequency(text);
        System.out.println("Character\tFrequency");
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
        sc.close();
    }
}
