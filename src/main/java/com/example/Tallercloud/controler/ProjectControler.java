package com.example.Tallercloud.controler;

import com.example.Tallercloud.domain.Project;
import com.example.Tallercloud.service.ProjectService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin(origins = "*")


@Validated
@RestController
@RequestMapping(value = "project")
public class ProjectControler {

    private final ProjectService projectService;

    public ProjectControler(ProjectService projectService) {
        this.projectService = projectService;
    }
    @PostMapping
    public Project adicionarproject(@RequestBody Project project) {

        return projectService.adicionarproject(project);

    }

    @GetMapping
    public List<Project> obtenerproject() {

        return projectService.obtenerproject();

    }





}
