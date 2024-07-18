package RailwayReservationSystem;

import java.util.HashMap;
import java.util.Map;

class Booking {
    private static int bookingIdCounter = 1;
    public Map<Integer, Ticket> bookings;

    public Booking() {
        bookings = new HashMap<>();
    }

    public Ticket bookTicket(String passengerName, String trainNumber, String seatNumber) {
        Ticket ticket = new Ticket(bookingIdCounter++, passengerName, trainNumber, seatNumber);
        bookings.put(ticket.getBookingId(), ticket);
        return ticket;
    }

    public Ticket getTicket(int bookingId) {
        return bookings.get(bookingId);
    }

    public boolean cancelTicket(int bookingId) {
        if (bookings.containsKey(bookingId)) {
            bookings.remove(bookingId);
            return true;
        }
        return false;
    }
}

class Ticket {
    private int bookingId;
    private String passengerName;
    private String trainNumber;
    private String seatNumber;

    public Ticket(int bookingId, String passengerName, String trainNumber, String seatNumber) {
        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.trainNumber = trainNumber;
        this.seatNumber = seatNumber;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {
        return "Ticket [bookingId=" + bookingId + ", passengerName=" + passengerName + ", trainNumber=" + trainNumber
                + ", seatNumber=" + seatNumber + "]";
    }
}


