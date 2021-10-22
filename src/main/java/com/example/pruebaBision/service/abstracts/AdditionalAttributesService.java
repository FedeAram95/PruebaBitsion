package com.example.pruebaBision.service.abstracts;

import com.example.pruebaBision.model.DTO.AdditionalAttributesDTO;
import com.example.pruebaBision.model.entity.AdditionalAttributes;

public interface AdditionalAttributesService {
    void delete(Long idAtrribute);
    void upgrade(AdditionalAttributesDTO additionalAttributesDTO, Long idAtrribute);
    void create(AdditionalAttributesDTO additionalAttributesDTO);
    AdditionalAttributes ListById(Long idAtrribute);
}
