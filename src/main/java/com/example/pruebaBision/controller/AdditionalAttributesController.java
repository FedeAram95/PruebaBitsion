package com.example.pruebaBision.controller;

import com.example.pruebaBision.model.DTO.AdditionalAttributesDTO;
import com.example.pruebaBision.model.DTO.PersonsDTO;
import com.example.pruebaBision.model.entity.AdditionalAttributes;
import com.example.pruebaBision.model.entity.Persons;
import com.example.pruebaBision.service.abstracts.AdditionalAttributesService;
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
@RequestMapping("/attribute")
public class AdditionalAttributesController {
    @Autowired
    AdditionalAttributesService additionalAttributesService;

    @PutMapping(path = "/{idAttribute}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity upgrade(@PathVariable Long idAttribute, @RequestBody AdditionalAttributesDTO additionalAttributesDTO) {
        additionalAttributesService.upgrade(additionalAttributesDTO,idAttribute);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping(path = "/{idAttribute}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity delete(@PathVariable Long idAttribute) {
        additionalAttributesService.delete(idAttribute);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping(path = "/{idAttribute}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AdditionalAttributesDTO> listById(@PathVariable Long idAttribute) {
        AdditionalAttributes additionalAttributes = additionalAttributesService.ListById(idAttribute);
        AdditionalAttributesDTO additionalAttributesDTO = new AdditionalAttributesDTO(additionalAttributes);
        return ResponseEntity.ok(additionalAttributesDTO);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity create( @Validated @RequestBody AdditionalAttributesDTO additionalAttributesDTO) {
        additionalAttributesService.create(additionalAttributesDTO);
        return new ResponseEntity(additionalAttributesDTO,HttpStatus.CREATED);
    }
}
