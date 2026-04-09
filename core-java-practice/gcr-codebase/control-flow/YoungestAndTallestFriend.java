import java.util.*;

class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of Amar:");
        int amarAge = sc.nextInt();
        System.out.println("Enter age of Akbar:");
        int akbarAge = sc.nextInt();
        System.out.println("Enter age of Anthony:");
        int anthonyAge = sc.nextInt();
        System.out.println("Enter height of Amar:");
        int amarHeight = sc.nextInt();
        System.out.println("Enter height of Akbar:");
        int akbarHeight = sc.nextInt();
        System.out.println("Enter height of Anthony:");
        int anthonyHeight = sc.nextInt();
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        System.out.println("Youngest Age = " + youngestAge);
        System.out.println("Tallest Height = " + tallestHeight);
        sc.close();
    }
}
