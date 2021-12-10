package com.example.Tallercloud.domain;

import lombok.Data;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name="Tablabacklog")
@Data
public class Backlog
{
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private Long id;

    @NotNull(message = "El campo PorjectIdentifier no puede estar vacio")
    @NotEmpty
    private String projectIdentifier;

    @OneToOne (cascade = CascadeType.ALL)
    private Project project;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "backlog")
    private List<ProjectTask> projectTask;
}
