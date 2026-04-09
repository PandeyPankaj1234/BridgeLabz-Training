import java.util.*;

class CountdownWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int countdownValue = sc.nextInt();
        while (countdownValue >= 1) {
            System.out.println(countdownValue);
            countdownValue--;
        }
        sc.close();
    }
}
