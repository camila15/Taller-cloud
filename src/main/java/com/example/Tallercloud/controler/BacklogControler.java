package com.example.Tallercloud.controler;

import com.example.Tallercloud.domain.Backlog;
import com.example.Tallercloud.service.BacklogService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.URI;

import javax.validation.Valid;

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
