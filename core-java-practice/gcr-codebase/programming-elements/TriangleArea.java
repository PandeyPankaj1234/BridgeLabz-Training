import java.util.*;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in inches: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();
        double areaInch = 0.5 * base * height;
        double areaCm = areaInch * 6.4516; // 1 inch^2 = 6.4516 cm^2
        System.out.println("Area of triangle is " + areaInch + " square inches and " + areaCm + " square centimeters");
        sc.close();
    }
}
