import java.util.*;

class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double GST_RATE = 0.18;
        System.out.println("Welcome to the Coffee Counter!");
        System.out.println("Available Coffee Types: Espresso (INR 120), Latte (INR 150), Cappuccino (INR 180)");
        
        while (true) {
            System.out.println("Enter validcoffee type or exit:");
            String coffeeType = sc.nextLine().trim();

            if (coffeeType.equalsIgnoreCase("exit")){
                System.out.println("Thank you for visiting! Goodbye!");
                break;
                
            }
            double pricePerCup;

            // validate coffee type first
            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    pricePerCup = 120;
                    break;
                case "latte":
                    pricePerCup = 150;
                    break;
                case "cappuccino":
                    pricePerCup = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type !! Please enter the available coffetype.");
                    continue;
            }

            // quantity only for valid coffee
            System.out.println("Enter quantity:");
            int quantity = sc.nextInt();
            sc.nextLine(); // clear buffer

            double billAmount = pricePerCup * quantity;
            double GST_Amount = billAmount * GST_RATE;
            double totalAmount = billAmount + GST_Amount;

            System.out.println("Bill Amount: INR " + billAmount);
            System.out.println("GST: INR " + GST_Amount);
            System.out.println("Total Payable: INR " + totalAmount);
            System.out.println("------------------------------");
        }

        sc.close();
    }
}
