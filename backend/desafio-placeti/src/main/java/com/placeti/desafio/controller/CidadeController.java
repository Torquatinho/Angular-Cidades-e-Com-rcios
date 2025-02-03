package com.placeti.desafio.controller;
import com.placeti.desafio.dto.CidadeDTO;
import com.placeti.desafio.model.Cidade;
import com.placeti.desafio.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping
    public List<CidadeDTO> getAll() {
        return cidadeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CidadeDTO> getById(@PathVariable Long id) {
        Optional<CidadeDTO> cidade = cidadeService.findById(id);
        return cidade.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Cidade create(@RequestBody Cidade cidade) {
        return cidadeService.save(cidade);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        cidadeService.delete(id);
    }
}
//Segundo Fellas os endpoints ficam nessa parte
