package com.example.Tallercloud.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="Tablaproject")
@Data
public class Project {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(unique = true)
    @NotEmpty(message = "El campo projectName no puede estar vacio")
    private String projectName ;

    @Size(min=5, max=7)
    @Column(unique = true, updatable = false)
    @NotEmpty(message = "El campo projectIdentifier no puede estar vacio")
    private String projectIdentifier ;

    @NotEmpty(message = "El campo description no puede estar vacio")
    private String description;

    private Date startDate;
    private Date endDate;

    @OneToOne(cascade = CascadeType.ALL)
    private Backlog backlog;

}

