package RailwayReservationSystem;

import java.util.*;

class Availability {
    private Map<String, List<String>> trainSeats;

    public Availability() {
        trainSeats = new HashMap<>();
        initializeSeats();
    }

    private void initializeSeats() {
        List<String> seats = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            seats.add("S" + i);
        }
        trainSeats.put("Train1", new ArrayList<>(seats));
        trainSeats.put("Train2", new ArrayList<>(seats));
    }

    public boolean isSeatAvailable(String trainNumber, String seatNumber) {
        List<String> seats = trainSeats.get(trainNumber);
        return seats != null && seats.contains(seatNumber);
    }

    public void bookSeat(String trainNumber, String seatNumber) {
        List<String> seats = trainSeats.get(trainNumber);
        if (seats != null) {
            seats.remove(seatNumber);
        }
    }

    public void cancelSeat(String trainNumber, String seatNumber) {
        List<String> seats = trainSeats.get(trainNumber);
        if (seats != null && !seats.contains(seatNumber)) {
            seats.add(seatNumber);
        }
    }
}
