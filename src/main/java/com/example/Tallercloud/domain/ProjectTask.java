package com.example.Tallercloud.domain;

import lombok.Data;
import org.w3c.dom.ranges.Range;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import java.util.Date;


@Entity
@Table(name="Tablaprojecttask")
@Data
public class ProjectTask {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private Long id;

    @NotEmpty(message = "El campo name no puede estar vacio")
    private String name ;

    @NotEmpty(message = "El campo summary no puede estar vacio")
    private String summary ;

    private String acceptanceCriteria ;


    private String status ;

    @Min(value=1, message = "El campo priority inicia en 1")
    @Max(value=5, message = "El campo priority termina en 5")
    private Integer priority;

    @Min(value=1, message = "El campo priority inicia en 1")
    @Max(value=8, message = "El campo priority termina en 8")
    @Positive
    private Double hours;


    private Date startDate;
    private Date endDate;

    @Column(updatable = false)
    private String projectIdentifier ;

    @ManyToOne(fetch = FetchType.LAZY)
    private Backlog backlog;

}
