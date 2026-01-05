package review;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Division by Zero Exception");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
