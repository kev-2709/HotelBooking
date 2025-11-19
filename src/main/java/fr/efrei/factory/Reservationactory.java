package fr.efrei.factory;

import fr.efrei.domain.Reservation;

import java.util.Date;

public class Reservationactory {
    public static Reservation createReservetion(Date arrival, Date departure){
        if(arrival == null || departure == null)
            return null;

        return new Reservation.Builder()
                .setArrival(arrival)
                .setDeparture(departure)
                .build();
    }
}
