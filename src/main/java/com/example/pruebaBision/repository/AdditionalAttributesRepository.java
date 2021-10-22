package com.example.pruebaBision.repository;

import com.example.pruebaBision.model.entity.AdditionalAttributes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionalAttributesRepository extends CrudRepository<AdditionalAttributes,Long> {
}
