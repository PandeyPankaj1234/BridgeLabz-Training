import java.util.*;

public class UniqueCharacters {
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

    public static char[] findUnique(String text) {
        int length = findLength(text);
        char[] temp = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique){
                temp[index++] = current;
            }
        }
        char[] unique = new char[index];
        for (int i = 0; i < index; i++){
            unique[i] = temp[i];
        }
        return unique;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.next();

        char[] uniqueChars = findUnique(text);
        System.out.print("Unique Characters: ");
        for (char ch : uniqueChars){
            System.out.print(ch + " ");
        }
        sc.close();
    }
}
