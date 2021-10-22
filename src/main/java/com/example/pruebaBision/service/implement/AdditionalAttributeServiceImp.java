package com.example.pruebaBision.service.implement;

import com.example.pruebaBision.model.DTO.AdditionalAttributesDTO;
import com.example.pruebaBision.model.entity.AdditionalAttributes;
import com.example.pruebaBision.model.entity.Persons;
import com.example.pruebaBision.repository.AdditionalAttributesRepository;
import com.example.pruebaBision.service.abstracts.AdditionalAttributesService;
import org.springframework.beans.factory.annotation.Autowired;

public class AdditionalAttributeServiceImp implements AdditionalAttributesService {
    @Autowired
    AdditionalAttributesRepository additionalAttributesRepository;
    @Override
    public void delete(Long idAtrribute) {
        additionalAttributesRepository.deleteById(idAtrribute);
    }

    @Override
    public void upgrade(AdditionalAttributesDTO additionalAttributesDTO, Long idAtrribute) {
        AdditionalAttributes additionalAttributes= new AdditionalAttributes();
        additionalAttributes.setIdAtrributes(additionalAttributesDTO.getIdAtrributes());
        additionalAttributes.setDrive(additionalAttributesDTO.getDrive());
        additionalAttributes.setDiabetic(additionalAttributesDTO.getDiabetic());
        additionalAttributes.setWearGlasses(additionalAttributesDTO.getWearGlasses());
        additionalAttributes.setSuffer(additionalAttributesDTO.getSuffer());
        additionalAttributes.setPersons(additionalAttributesDTO.getPersons());

        additionalAttributesRepository.save(additionalAttributes);

    }

    @Override
    public void create(AdditionalAttributesDTO additionalAttributesDTO) {
        AdditionalAttributes additionalAttributes= new AdditionalAttributes();
        additionalAttributes.setIdAtrributes(additionalAttributesDTO.getIdAtrributes());
        additionalAttributes.setDrive(additionalAttributesDTO.getDrive());
        additionalAttributes.setDiabetic(additionalAttributesDTO.getDiabetic());
        additionalAttributes.setWearGlasses(additionalAttributesDTO.getWearGlasses());
        additionalAttributes.setSuffer(additionalAttributesDTO.getSuffer());
        additionalAttributes.setPersons(additionalAttributesDTO.getPersons());

        additionalAttributesRepository.save(additionalAttributes);
    }

    @Override
    public AdditionalAttributes ListById(Long idAtrribute) {
        return additionalAttributesRepository.findById(idAtrribute).get();
    }
}
