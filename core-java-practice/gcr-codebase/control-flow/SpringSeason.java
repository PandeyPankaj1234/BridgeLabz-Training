import java.util.*;
class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        boolean isSpringSeason = (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
        System.out.println(isSpringSeason ? "Its a Spring Season" : "Not a Spring Season");
        sc.close();
    }
}
