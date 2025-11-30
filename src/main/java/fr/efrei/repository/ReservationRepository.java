package fr.efrei.repository;

import fr.efrei.domain.Reservation;

import java.util.ArrayList;
import java.util.List;

public class ReservationRepository implements IReservationRepository {

    // Singleton
    private static IReservationRepository repository = null;
    private List<Reservation> reservationList;

    private ReservationRepository() {
        reservationList = new ArrayList<>();
    }

    public static IReservationRepository getRepository() {
        if (repository == null) {
            repository = new ReservationRepository();
        }
        return repository;
    }

    @Override
    public Reservation create(Reservation reservation) {
        if (reservation == null)
            return null;

        boolean success = reservationList.add(reservation);
        return success ? reservation : null;
    }

    @Override
    public Reservation read(Integer integer) {
        return null;
    }

    @Override
    public Reservation read(int id) {
        for (Reservation r : reservationList) {
            if (r.getReservationId() == id) {
                return r;
            }
        }
        return null;
    }


    @Override
    public Reservation update(Reservation reservation) {
        if (reservation == null)
            return null;

        Reservation old = read(reservation.getReservationId());
        if (old == null)
            return null;

        int index = reservationList.indexOf(old);
        reservationList.set(index, reservation);
        return reservation;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        Reservation toDelete = read(id);
        if (toDelete == null)
            return false;
        return reservationList.remove(toDelete);
    }

    @Override
    public List<Reservation> getAll() {
        return reservationList;
    }
}
