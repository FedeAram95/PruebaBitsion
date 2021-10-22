package com.example.pruebaBision.model.DTO;

import com.example.pruebaBision.model.entity.AdditionalAttributes;
import com.example.pruebaBision.model.entity.Persons;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class PersonsDTO {

    @Id
    @Getter
    @Setter
    private Long idPersons;
    @Getter@Setter
    private String name;
    @Getter@Setter
    private Long age;
    @Getter@Setter
    private String gender;
    @Getter@Setter
    private Boolean state;

    @Getter@Setter
    private AdditionalAttributes additionalAttributes;

    @Autowired
    Persons persons;

    public PersonsDTO(){
    }

    public PersonsDTO(Persons persons){
        this.idPersons= persons.getIdPersons();
        this.name=persons.getName();
        this.age=persons.getAge();
        this.gender=persons.getGender();
        this.state=persons.getState();
        this.additionalAttributes=persons.getAdditionalAttributes();
    }
}
