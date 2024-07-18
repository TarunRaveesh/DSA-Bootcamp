package RailwayReservationSystem;
import java.util.*;

class Chart {
    private Booking booking;

    public Chart(Booking booking) {
        this.booking = booking;
    }

    public void printChart() {
        System.out.println("Passenger List:");
        for (Map.Entry<Integer, Ticket> entry : booking.bookings.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}

