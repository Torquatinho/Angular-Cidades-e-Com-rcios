package com.placeti.desafio.repository;
import com.placeti.desafio.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    
}