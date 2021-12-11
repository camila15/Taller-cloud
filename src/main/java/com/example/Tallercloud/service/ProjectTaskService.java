package com.example.Tallercloud.service;

import com.example.Tallercloud.domain.Backlog;
import com.example.Tallercloud.domain.Project;
import com.example.Tallercloud.domain.ProjectTask;
import com.example.Tallercloud.repository.BacklogRepository;
import com.example.Tallercloud.repository.ProjectTaskRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ProjectTaskService {

    private final ProjectTaskRepository projectTaskRepository;

    public ProjectTaskService(ProjectTaskRepository projectTaskRepository) {
        this.projectTaskRepository= projectTaskRepository;
    }

    public ProjectTask adicionarprojectTask(ProjectTask projectTask)
    {
        return projectTaskRepository.save(projectTask);
    }

    public List<ProjectTask> obtenertareasproject(String projectIdentifier) {
        List<ProjectTask> obtener=projectTaskRepository.findAll();
        List<ProjectTask> guardarfiltro= new ArrayList<>();
        for (int i=0; i< obtener.size();i++)
        {
            if(obtener.get(i).getProjectIdentifier().equals(projectIdentifier))
            {
                guardarfiltro.add(obtener.get(i));
            }
        }

        return guardarfiltro;

    }


    public Double obtenerhoras(String projectIdentifier){
        Double Acumulador=0.0;
        List<ProjectTask> projectTask = projectTaskRepository.findAll();

        for (int i=0; i<projectTask.size(); i++)
        {
            if(!projectTask.get(i).getStatus().equals("Deleted") && projectTask.get(i).getProjectIdentifier().equals(projectIdentifier))
            {
                Acumulador+=projectTask.get(i).getHours();
            }
        }
        return Acumulador;
    }
}
