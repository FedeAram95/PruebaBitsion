package com.example.pruebaBision.model.DTO;

import com.example.pruebaBision.model.entity.AdditionalAttributes;
import com.example.pruebaBision.model.entity.Persons;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.OneToOne;

public class AdditionalAttributesDTO {

    @Getter@Setter
    private Long idAtrributes;
    @Getter@Setter
    private Boolean drive;
    @Getter@Setter
    private Boolean wearGlasses;
    @Getter@Setter
    private Boolean diabetic;
    @Getter@Setter
    private String suffer;
    @Getter@Setter
    private Persons persons;

    public AdditionalAttributesDTO(){}

    public AdditionalAttributesDTO(AdditionalAttributes additionalAttributes){
        this.idAtrributes= additionalAttributes.getIdAtrributes();
        this.drive=additionalAttributes.getDrive();
        this.wearGlasses=additionalAttributes.getWearGlasses();
        this.diabetic=additionalAttributes.getDiabetic();
        this.suffer=additionalAttributes.getSuffer();
        this.persons=additionalAttributes.getPersons();

    }
}
