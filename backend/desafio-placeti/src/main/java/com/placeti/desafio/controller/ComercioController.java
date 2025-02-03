package com.placeti.desafio.controller;
import com.placeti.desafio.dto.ComercioDTO;
import com.placeti.desafio.model.Comercio;
import com.placeti.desafio.service.ComercioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comercios")
public class ComercioController {

    @Autowired
    private ComercioService comercioService;

    @GetMapping
    public List<ComercioDTO> getAll() {
        return comercioService.findAll();
    }
}
