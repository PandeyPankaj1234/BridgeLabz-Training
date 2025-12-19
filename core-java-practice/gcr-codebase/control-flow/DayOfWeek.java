import java.util.*;
class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int dayOfWeek = (day + x + (31 * m) / 12) % 7;
        System.out.println(dayOfWeek);
        sc.close();
    }
}
