package fr.efrei.repository;

import fr.efrei.domain.Double;
import java.util.List;

public interface IDoubleRepository extends IRepository<Double, Integer> {
    List<Double> getAll();
}