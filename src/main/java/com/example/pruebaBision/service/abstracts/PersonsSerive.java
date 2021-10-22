package com.example.pruebaBision.service.abstracts;

import com.example.pruebaBision.model.DTO.PersonsDTO;
import com.example.pruebaBision.model.entity.Persons;

public interface PersonsSerive {

    void delete(Long idPersons);
    void upgrade(PersonsDTO personsDTO, Long idPersons);
    void create(PersonsDTO personsDTO);
    Persons ListById(Long idPersons);

}
