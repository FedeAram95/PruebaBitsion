package com.example.pruebaBision.repository;

import com.example.pruebaBision.model.entity.Persons;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonsRepository extends CrudRepository<Persons, Long> {
}
