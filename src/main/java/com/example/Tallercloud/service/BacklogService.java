package com.example.Tallercloud.service;

import com.example.Tallercloud.domain.Backlog;
import com.example.Tallercloud.repository.BacklogRepository;
import org.springframework.stereotype.Service;

@Service
public class BacklogService {

    private final BacklogRepository backlogRepository;

    public BacklogService(BacklogRepository backlogRepository) {
        this.backlogRepository = backlogRepository;
    }

    public Backlog adicionarBacklog(Backlog backlog)
        {
            return backlogRepository.save(backlog);
        }
}
