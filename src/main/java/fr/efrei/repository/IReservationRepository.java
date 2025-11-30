package fr.efrei.repository;

import fr.efrei.domain.Reservation;

import java.util.List;

public interface IReservationRepository extends IRepository<Reservation, Integer> {
    Reservation read(int id);

    boolean delete(int id);

    List<Reservation> getAll();

}
