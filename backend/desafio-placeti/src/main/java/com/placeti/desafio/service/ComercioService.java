package com.placeti.desafio.service;
import com.placeti.desafio.dto.ComercioDTO;
import com.placeti.desafio.model.Comercio;
import com.placeti.desafio.repository.ComercioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ComercioService {

    @Autowired
    private ComercioRepository comercioRepository;

    public List<ComercioDTO> findAll() {
        return comercioRepository.findAll().stream()
            .map(comercio -> new ComercioDTO(
                comercio.getId(),
                comercio.getNome(),
                comercio.getTipo(),
                comercio.getCidade().getNome()
            ))
            .collect(Collectors.toList());
    }

    public Optional<ComercioDTO> findById(Long id) {
        return comercioRepository.findById(id)
            .map(comercio -> new ComercioDTO(
                comercio.getId(),
                comercio.getNome(),
                comercio.getTipo(),
                comercio.getCidade().getNome()
            ));
    }

    public Comercio save(Comercio comercio) {
        return comercioRepository.save(comercio);
    }

    public void delete(Long id) {
        comercioRepository.deleteById(id);
    }
}
