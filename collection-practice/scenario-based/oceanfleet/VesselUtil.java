package oceanfleet;

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {
	private List<Vessel> veselList;
	public VesselUtil(){
	        veselList = new ArrayList<>();
	 }

	public List<Vessel> getVeselList() {
		return veselList;
	}

	public void setVeselList(List<Vessel> veselList) {
		this.veselList = veselList;
	}
	public void addVeselPerformance(Vessel vessel) {
		veselList.add(vessel);
	}
	public Vessel getVesselById(String vesselId) {
		for(Vessel vessel:veselList) {
			if(vessel.getVesselId().equals(vesselId)) {
				return vessel;
			}
		}
		return null;
	}
	public List<Vessel> getHighPerformanceVessels(){
		List<Vessel> result = new ArrayList<>();
		double maxSpeed=0.0;
		for(Vessel vessel : veselList) {
			if(vessel.getAverageSpeed()>maxSpeed) {
				maxSpeed=vessel.getAverageSpeed();
			}
			
		}
		for(Vessel v:veselList) {
			if(v.getAverageSpeed()==maxSpeed) {
				result.add(v);
			}
			
		}
		return result;
	
	}
}
