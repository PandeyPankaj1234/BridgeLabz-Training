package aerovigil;

import java.util.*;

public class UserInterface{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FlightUtil util=new FlightUtil();

        System.out.println("Enter flight details");

        try{
            String input=sc.nextLine();
            String[] arr=input.split(":");

            String flightNumber=arr[0];
            String flightName=arr[1];
            int passengerCount=Integer.parseInt(arr[2]);
            double fuelLevel=Double.parseDouble(arr[3]);

            util.validateFlightNumber(flightNumber);
            util.validateFlightName(flightName);
            util.validatePassengerCount(passengerCount,flightName);

            double fuelRequired=
                util.calculateFuelToFillTank(flightName,fuelLevel);

            System.out.println(
                "Fuel required to fill the tank: "+
                fuelRequired+" liters");

        }catch(InvalidFlightException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Invalid input format");
        }

        sc.close();
    }
}

