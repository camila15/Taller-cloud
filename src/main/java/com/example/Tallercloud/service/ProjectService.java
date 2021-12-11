package com.example.Tallercloud.service;

import com.example.Tallercloud.domain.Project;
import com.example.Tallercloud.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project adicionarproject(Project project) {
        return projectRepository.save(project);
    }

    public List<Project> obtenerproject() {
        return projectRepository.findAll();

    }
}
