import java.util.*;

public class CharacterArrayCheck {
    public static char[] getCharacters(String text) {
        char[] characters = new char[text.length()];
        for (int i = 0; i < text.length(); i++){
            characters[i] = text.charAt(i);
        }
        return characters;
    }

    public static boolean compareArrays(char[] first, char[] second) {
        if (first.length != second.length){
            return false;
        }
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.next();

        char[] customArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        boolean result = compareArrays(customArray, builtInArray);
        System.out.println("Character Arrays Match = " + result);
        sc.close();
    }
}
