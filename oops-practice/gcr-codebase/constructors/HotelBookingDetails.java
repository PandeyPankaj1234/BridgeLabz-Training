import java.util.*;

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // default constructor
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // copy constructor
    HotelBooking(HotelBooking hb) {
        guestName = hb.guestName;
        roomType = hb.roomType;
        nights = hb.nights;
    }

    // method to display booking details
    void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}

public class HotelBookingDetails {
    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking(); // default booking
        HotelBooking b2 = new HotelBooking("Rahul", "Deluxe", 3); // parameterized booking
        HotelBooking b3 = new HotelBooking(b2); // copied booking

        b1.displayBooking();
        System.out.println();
        b2.displayBooking();
        System.out.println();
        b3.displayBooking();
    }
}
