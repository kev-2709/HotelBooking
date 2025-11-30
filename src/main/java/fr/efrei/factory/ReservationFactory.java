package fr.efrei.factory;

import fr.efrei.domain.Reservation;
import java.util.Date;

public class ReservationFactory {

    private static int nextId = 1;

    public static Reservation createReservation(Date arrival, Date departure) {

        if (arrival == null || departure == null) {
            return null;
        }

        int reservationId = nextId++;

        return new Reservation.Builder()
                .setReservationId(reservationId)
                .setArrival(arrival)
                .setDeparture(departure)
                .build();
    }
}
