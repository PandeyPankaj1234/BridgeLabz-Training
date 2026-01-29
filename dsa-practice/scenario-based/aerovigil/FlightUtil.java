package aerovigil;

public class FlightUtil{

    public boolean validateFlightNumber(String flightNumber)
            throws InvalidFlightException{

        if(flightNumber==null || !flightNumber.matches("FL-[1-9][0-9]{3}")){
            throw new InvalidFlightException(
                "The flight number "+flightNumber+" is invalid");
        }
        return true;
    }

    public boolean validateFlightName(String flightName)
            throws InvalidFlightException{

        if(!(flightName.equals("SpiceJet")||
             flightName.equals("Vistara")||
             flightName.equals("IndiGo")||
             flightName.equals("Air Arabia"))){

            throw new InvalidFlightException(
                "The flight name "+flightName+" is invalid");
        }
        return true;
    }

    public boolean validatePassengerCount(int passengerCount,String flightName)
            throws InvalidFlightException{

        int maxCapacity=0;

        if(flightName.equals("SpiceJet")) maxCapacity=396;
        else if(flightName.equals("Vistara")) maxCapacity=615;
        else if(flightName.equals("IndiGo")) maxCapacity=230;
        else if(flightName.equals("Air Arabia")) maxCapacity=130;

        if(passengerCount<=0 || passengerCount>maxCapacity){
            throw new InvalidFlightException(
                "The passenger count "+passengerCount+
                " is invalid for "+flightName);
        }
        return true;
    }

    public double calculateFuelToFillTank(String flightName,double currentFuelLevel)
            throws InvalidFlightException{

        double maxFuelCapacity=0;

        if(flightName.equals("SpiceJet")) maxFuelCapacity=200000;
        else if(flightName.equals("Vistara")) maxFuelCapacity=300000;
        else if(flightName.equals("IndiGo")) maxFuelCapacity=250000;
        else if(flightName.equals("Air Arabia")) maxFuelCapacity=150000;

        if(currentFuelLevel<0 || currentFuelLevel>maxFuelCapacity){
            throw new InvalidFlightException(
                "Invalid fuel level for "+flightName);
        }
        return maxFuelCapacity-currentFuelLevel;
    }
}

