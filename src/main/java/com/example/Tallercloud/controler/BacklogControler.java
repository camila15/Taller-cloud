package com.example.Tallercloud.controler;

import com.example.Tallercloud.domain.Backlog;
import com.example.Tallercloud.service.BacklogService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "*")

@Validated
@RestController
@RequestMapping(value = "backlog")
public class BacklogControler {

    private final BacklogService backlogService;

    public BacklogControler(BacklogService backlogService) {
        this.backlogService = backlogService;
    }
    @PostMapping
    public Backlog adicionarBacklog(@RequestBody Backlog backlog) {

         return backlogService.adicionarBacklog(backlog);
    }



}
