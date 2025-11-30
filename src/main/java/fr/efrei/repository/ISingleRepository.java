package fr.efrei.repository;

import fr.efrei.domain.Single;
import java.util.List;

public interface ISingleRepository extends IRepository<Single, Integer> {
    List<Single> getAll();
}