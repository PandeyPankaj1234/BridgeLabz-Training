import java.util.*;

class Flight {
    private String flightNumber;
    private String sourceCity;
    private String destinationCity;
    private int availableSeats;
    private double pricePerSeat;
    Flight(String flightNumber,String sourceCity,String destinationCity,int availableSeats,double pricePerSeat){
        this.flightNumber=flightNumber;
        this.sourceCity=sourceCity;
        this.destinationCity=destinationCity;
        this.availableSeats=availableSeats;
        this.pricePerSeat=pricePerSeat;
    }
    public String getFlightNumber(){
        return flightNumber;
    }
    public String getSourceCity(){
        return sourceCity;
    }
    public String getDestinationCity(){
        return destinationCity;
    }
    public int getAvailableSeats(){
        return availableSeats;
    }
    public double getPricePerSeat(){
        return pricePerSeat;
    }
    public void reduceSeats(int seats){
        availableSeats-=seats;
    }
    public void  displayDetails(){
        System.out.println("FlightNumber :" + flightNumber);
        System.out.println("SourceCity :" + sourceCity);
        System.out.println("DestinationCity :" + destinationCity);
        System.out.println("AvailableSeats :" + availableSeats);
        System.out.println("PricePerSeat :" + pricePerSeat);
    }

    
}
class Booking{
    private String userName;
    private String flightNumber;
    private String sourceCity;
    private String destinationCity;
    private int numberOfSeatsBooked;
    private double totalPrice;
    
    Booking(String userName,String flightNumber,String sourceCity,String destinationCity,int numberOfSeatsBooked,double totalPrice){
        this.userName=userName;
        this.flightNumber=flightNumber;
        this.sourceCity=sourceCity;
        this.destinationCity=destinationCity;
        this.numberOfSeatsBooked= numberOfSeatsBooked;
        this.totalPrice= totalPrice;
    }
    public String getUserName(){
        return userName;
    }
    
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSourceCity() {
        return sourceCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public int getNumberOfSeatsBooked() {
        return numberOfSeatsBooked;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
    
    public void displayDetails() {
        System.out.println("UserName :" + userName);
        System.out.println("FlightNumber :" + flightNumber);
        System.out.println("SourceCity :" + sourceCity);
        System.out.println("DestinationCity :" + destinationCity);
        System.out.println("NumberOfSeatsBooked :" + numberOfSeatsBooked);
        System.out.println("TotalPrice :" + totalPrice);
    }

}
class FlightService{
    private Flight[] flights;
    private List<Booking> bookings=new ArrayList<>();
   
    FlightService() {
        initializeFlights();
    }
    
    private void initializeFlights() {
        flights = new Flight[] {
                new Flight("AI101", "Delhi", "Mumbai", 50, 5000),
                new Flight("AI102", "Delhi", "Bangalore", 40, 6000),
                new Flight("AI103", "Mumbai", "Chennai", 30, 5500),
                new Flight("AI104", "Pune", "Delhi", 20, 4500)
        };
    }
    void searchFlights(
        String sourceCity,String destinationCity 
    ){
        boolean found=false;
        for(Flight f:flights){
            if(f.getSourceCity().equalsIgnoreCase(sourceCity)&& f.getDestinationCity().equalsIgnoreCase(destinationCity)){
                f.displayDetails();
                found=true;
            }
        }
        if(!found){
            System.out.println("No Flights found");
        }
    }
    private Flight findFlightByNumber(String flightNumber){
        for(Flight f:flights){
            if(f.getFlightNumber().equalsIgnoreCase(flightNumber)){
                return f;
            }
        }
        return null;
    }
    void bookFlight(String userName,String flightNumber,int seats){
        Flight flight=findFlightByNumber(flightNumber);
        if(flight==null){
            System.out.println("Invalid Flight Number");
            return;
        }
        if(seats>flight.getAvailableSeats()){
            System.out.println("Insufficient Seats");
        }
        double total=seats*flight.getPricePerSeat();
        flight.reduceSeats(seats);
        bookings.add(new Booking(userName, flight.getFlightNumber(), flight.getSourceCity(), flight.getDestinationCity(), 
                seats,
                total));
        System.out.println("Booking successful");
    }
    
    void displayBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available");
            return;
        }
        for (Booking b : bookings) {
            b.displayDetails();
        }
    }

}
public class FlightBookingSystem {
    static void showMenu() {
        System.out.println("\n1.Search Flight");
        System.out.println("2.Book Flight");
        System.out.println("3.View Bookings");
        System.out.println("4.Exit");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlightService service = new FlightService();
        int choice;
        do {
            showMenu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter source:");
                    String src = sc.nextLine();
                    System.out.print("Enter destination:");
                    String dest = sc.nextLine();
                    service.searchFlights(src, dest);
                    break;
                case 2:
                    System.out.print("Enter name:");
                    String name = sc.nextLine();
                    System.out.print("Enter flight number:");
                    String fn = sc.nextLine();
                    System.out.print("Enter seats:");
                    int seats = sc.nextInt();
                    service.bookFlight(name, fn, seats);
                    break;
                case 3:
                    service.displayBookings();
                    break;
                case 4:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
        sc.close();
    }
    
}
