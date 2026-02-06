package fooddelivery;

public class Agent {
	String agentId;
	String agentName;
	String agentNumber;
	boolean isAvailable;
	public Agent(String agentId, String agentName, String agentNumber,boolean isAvailable) {
		this.agentId = agentId;
		this.agentName = agentName;
		this.agentNumber = agentNumber;
		this.isAvailable=isAvailable;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAgentNumber() {
		return agentNumber;
	}
	public void setAgentNumber(String agentNumber) {
		this.agentNumber = agentNumber;
	}
	
}
