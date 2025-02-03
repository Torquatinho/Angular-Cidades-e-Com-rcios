package com.placeti.desafio.model;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cidade {
    //id tem que ser chave primaria né filho
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String estado;

    @OneToMany(mappedBy = "cidade", cascade = CascadeType.ALL, orphanRemoval = true)//uma cidade pode ter variow comercios
    @JsonManagedReference
    private List<Comercio> comercios;  
    //tem que listar tbm então
}
