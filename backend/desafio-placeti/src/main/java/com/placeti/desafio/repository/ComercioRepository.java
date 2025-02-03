package com.placeti.desafio.repository;

import com.placeti.desafio.model.Comercio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComercioRepository extends JpaRepository<Comercio, Long> {
}
