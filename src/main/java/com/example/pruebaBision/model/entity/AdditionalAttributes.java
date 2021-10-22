package com.example.pruebaBision.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Attributes Additional")
public class AdditionalAttributes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
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
    @OneToOne
    private Persons persons;
}
