package com.example.pruebaBision.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "persons")
public class Persons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter@Setter
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
    @OneToOne
    private AdditionalAttributes additionalAttributes;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persons)) return false;
        Persons persons = (Persons) o;
        return Objects.equals(getIdPersons(), persons.getIdPersons());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdPersons());
    }
}
