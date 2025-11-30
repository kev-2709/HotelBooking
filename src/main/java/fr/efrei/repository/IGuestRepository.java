package fr.efrei.repository;
import fr.efrei.domain.Guest;
import java.util.List;


public interface IGuestRepository extends IRepository<Guest, Long> {
    List<Guest> getAll();
}