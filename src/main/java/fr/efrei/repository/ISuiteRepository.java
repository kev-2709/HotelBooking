package fr.efrei.repository;

import fr.efrei.domain.Suite;
import java.util.List;

public interface ISuiteRepository extends IRepository<Suite, Integer> {
    List<Suite> getAll();
}