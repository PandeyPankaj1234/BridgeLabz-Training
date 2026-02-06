package fooddelivery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class DeliveryService {

	 Queue<Order> orders = new LinkedList<>();
     List<Agent> agents = new ArrayList<>();
     Map<String,Agent> assignedOrder = new HashMap<>();
		
	public void addOrder(Order order) {
		orders.offer(order);	
	}
	public void addAgents(Agent agent){
		agents.add(agent);
	}
	public void assignedDelivery() throws NoAgentAvailableException{
		Order order = orders.poll();
		if(order==null) {
			System.out.println("No Order to assign");
			return ;
		}
		Agent nearestAgent = null;
		for(Agent agent:agents){
			if(agent.isAvailable) {
				nearestAgent=agent;
				break;
			}
		}
		if(nearestAgent==null){
			orders.offer(order);
			throw new NoAgentAvailableException("No Agent is free");
		}
		nearestAgent.setAvailable(false);
		assignedOrder.put(order.getOrderId(),nearestAgent);
		System.out.println("Order" + order.getOrderId() + "assigned to Agent" + nearestAgent.getAgentName());
	}
	public void cancelOrder(String orderId) {
	      Agent agent = assignedOrder.remove(orderId);
          if (agent != null) {
               agent.setAvailable(true);
               System.out.println("Assigned order " + orderId + " cancelled and agent freed");
               return;
          }
          else {
        	  System.out.println("Order not found in assignedOrder");
          }
    }
}
