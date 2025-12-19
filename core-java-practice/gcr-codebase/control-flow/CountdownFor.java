import java.util.*;

class CountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countdownValue = sc.nextInt();
        for (int counter = countdownValue; counter >= 1; counter--)
            System.out.println(counter);
        sc.close();
    }
}
