import java.util.*;

public class VowelConsonantCount {
    public static int checkCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z'){
            ch = (char) (ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                return 1;
            } // vowel
            else{
                return 2;
            } // consonant
        }
        return 0; // not a letter
    }
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            int result = checkCharacter(text.charAt(i));
            if (result == 1){
                vowels++;
            }
            else if (result == 2){
                consonants++;
            }
        }
        return new int[] { vowels, consonants };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        int[] count = countVowelsConsonants(text);
        System.out.println("Vowels = " + count[0]);
        System.out.println("Consonants = " + count[1]);
        sc.close();
    }
}
