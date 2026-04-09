package oceanfleet;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		VesselUtil util = new VesselUtil();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vessels to be added");
		int n =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter vessel details");
		for(int i=0;i<n;i++) {
			String str = sc.nextLine();
			String[] values = str.split(":");
			String vesselId = values[0];
			String vesselName = values[1];
			double averageSpeed = Double.parseDouble(values[2]);
			String vesselType = values[3];
			
			util.addVeselPerformance(new Vessel(vesselId,vesselName,averageSpeed,vesselType));
			
			
		}
		System.out.println("Enter the Vessel Id to check speed");
		String id = sc.nextLine();
		Vessel found = util.getVesselById(id);
		if(found!=null) {
				System.out.println(found.vesselId +"|" + found.vesselName + "|" + found.vesselType  + found.averageSpeed + "knots");
				
		}else {
			System.out.println("Vessel Id " + id + " not found.");
		}
		System.out.println("High performance vessels are");
		List<Vessel> high = util.getHighPerformanceVessels();
		for(Vessel v:high) {
			System.out.println(v.vesselId+ "|" + v.vesselName + "|" + v.vesselType + "|" + v.averageSpeed + "knots");
		}
		sc.close();
		
			
	}

}
