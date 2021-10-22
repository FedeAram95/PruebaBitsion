package com.example.pruebaBision.controller;

import com.example.pruebaBision.model.DTO.PersonsDTO;
import com.example.pruebaBision.model.entity.Persons;
import com.example.pruebaBision.service.abstracts.PersonsSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/persons")
public class PersonsController {

    @Autowired
    PersonsSerive personsSerive;

    @PutMapping(path = "/{idPersons}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity upgrade(@PathVariable Long idPersons, @RequestBody PersonsDTO personsDTO) {
        personsSerive.upgrade(personsDTO,idPersons);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping(path = "/{idPersons}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity delete(@PathVariable Long idPersons) {
        personsSerive.delete(idPersons);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping(path = "/{idPersons}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PersonsDTO> listById(@PathVariable Long idPersons) {
        Persons persons = personsSerive.ListById(idPersons);
        PersonsDTO personsDTO = new PersonsDTO(persons);
        return ResponseEntity.ok(personsDTO);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity create( @Validated @RequestBody PersonsDTO personsDTO) {
        personsSerive.create(personsDTO);
        return new ResponseEntity(personsDTO,HttpStatus.CREATED);
    }

}
