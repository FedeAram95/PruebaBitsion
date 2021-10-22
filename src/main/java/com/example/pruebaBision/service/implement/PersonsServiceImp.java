package com.example.pruebaBision.service.implement;

import com.example.pruebaBision.model.DTO.AdditionalAttributesDTO;
import com.example.pruebaBision.model.DTO.PersonsDTO;
import com.example.pruebaBision.model.entity.Persons;
import com.example.pruebaBision.repository.PersonsRepository;
import com.example.pruebaBision.service.abstracts.PersonsSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PersonsServiceImp implements PersonsSerive {
    @Autowired
    PersonsRepository personsRepository;
    @Override
    public void delete(Long idPersons) {
        personsRepository.deleteById(idPersons);
    }

    @Override
    public void upgrade(PersonsDTO personsDTO, Long idPersons) {
        Persons persons= new Persons();
        persons.setIdPersons(personsDTO.getIdPersons());
        persons.setName(personsDTO.getName());
        persons.setAge(personsDTO.getAge());
        persons.setGender(personsDTO.getGender());
        persons.setState(personsDTO.getState());

        personsRepository.save(persons);
    }

    @Override
    public void create(PersonsDTO personsDTO) {
        Persons persons= new Persons();
        persons.setIdPersons(personsDTO.getIdPersons());
        persons.setName(personsDTO.getName());
        persons.setAge(personsDTO.getAge());
        persons.setGender(personsDTO.getGender());
        persons.setState(personsDTO.getState());

        personsRepository.save(persons);

    }

    @Override
    public Persons ListById(Long idPersons) {
      return personsRepository.findById(idPersons).get();
    }
}
