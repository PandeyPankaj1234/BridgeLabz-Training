package fooddelivery;

import java.util.*;

public class DeliveryApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DeliveryService service = new DeliveryService();

		// Pre-added Agents
		service.addAgents(new Agent("101","Bharat","6989786444",true));
		service.addAgents(new Agent("102","Ankit","8761478532",true));

		while(true) {
			System.out.println("\n===== FOOD DELIVERY SYSTEM =====");
			System.out.println("1 Add Order");
			System.out.println("2 Assign Order");
			System.out.println("3 Cancel Order");
			System.out.println("4 Exit");
			System.out.print("Enter Choice: ");

			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch(choice) {

			// 1️⃣ ADD ORDER
			case 1:
				System.out.println("Enter orderId:");
                String id = sc.nextLine();

                System.out.println("Enter orderType:");
                String type = sc.nextLine();

                System.out.println("Enter orderQuantity:");
                int qty = Integer.parseInt(sc.nextLine());
                
                System.out.println("Enter OrderPrice:");
                double price = Double.parseDouble(sc.nextLine());
                
				Order order = new Order(id, type,qty,price);
				service.addOrder(order);

				System.out.println("Order Added Successfully");
				break;

			// 2️⃣ ASSIGN ORDER
			case 2:
				try {
					service.assignedDelivery();
				} catch (NoAgentAvailableException e) {
					System.out.println(e.getMessage());
				}
				break;

			// 3️⃣ CANCEL ORDER
			case 3:
				System.out.print("Enter Order Id to Cancel: ");
				String cancelId = sc.nextLine();
				service.cancelOrder(cancelId);
				break;

			// 4️⃣ EXIT
			case 4:
				System.out.println("Exiting App...");
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}
