package com.example.Tallercloud.controler;

import com.example.Tallercloud.domain.ProjectTask;
import com.example.Tallercloud.service.ProjectTaskService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")

@Validated
@RestController
@RequestMapping(value = "projectTask")

public class ProjectTaskControler {

    private final ProjectTaskService projectTaskService;

    public ProjectTaskControler(ProjectTaskService projecttaskService) {
        this.projectTaskService = projecttaskService;
    }
    @PostMapping
    public ProjectTask adicionarprojectTask(@RequestBody ProjectTask projectTask) {

        return projectTaskService.adicionarprojectTask(projectTask);

    }

    @GetMapping("/task/project/{projectIdentifier}")
    public List<ProjectTask> obtenertareasproject(@PathVariable String projectIdentifier) {

        return projectTaskService.obtenertareasproject(projectIdentifier);

    }

    @GetMapping(value = "/task/hours/project/{projectIdentifier}")
    public Double getProjectHours(@PathVariable("projectIdentifier") String projectIdentifier){


        return projectTaskService.obtenerhoras(projectIdentifier);
    }




}
