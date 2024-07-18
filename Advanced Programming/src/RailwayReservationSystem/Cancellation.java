package RailwayReservationSystem;

class Cancellation {
    private final Booking booking;
    private final Availability availability;

    public Cancellation(Booking booking, Availability availability) {
        this.booking = booking;
        this.availability = availability;
    }

    public boolean cancelTicket(int bookingId) {
        Ticket ticket = booking.getTicket(bookingId);
        if (ticket != null) {
            availability.cancelSeat(ticket.getTrainNumber(), ticket.getSeatNumber());
            return booking.cancelTicket(bookingId);
        }
        return false;
    }
}

