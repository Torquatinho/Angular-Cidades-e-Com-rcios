package com.placeti.desafio.service;
//conecta com os DTO´s
import com.placeti.desafio.dto.CidadeDTO;
import com.placeti.desafio.model.Cidade;
import com.placeti.desafio.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<CidadeDTO> findAll() {
        return cidadeRepository.findAll().stream()
            .map(cidade -> new CidadeDTO(
                cidade.getId(),
                cidade.getNome(),
                cidade.getEstado(),
                cidade.getComercios().stream().map(comercio -> comercio.getNome()).collect(Collectors.toList())
            ))
            .collect(Collectors.toList());
    }

    public Optional<CidadeDTO> findById(Long id) {
        return cidadeRepository.findById(id)
            .map(cidade -> new CidadeDTO(
                cidade.getId(),
                cidade.getNome(),
                cidade.getEstado(),
                cidade.getComercios().stream().map(comercio -> comercio.getNome()).collect(Collectors.toList())
            ));
    }

    public Cidade save(Cidade cidade) {
        return cidadeRepository.save(cidade);
    }

    public void delete(Long id) {
        cidadeRepository.deleteById(id);
    }
}
