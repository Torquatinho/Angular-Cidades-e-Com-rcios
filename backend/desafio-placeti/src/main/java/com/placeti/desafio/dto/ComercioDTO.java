package com.placeti.desafio.dto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ComercioDTO {
    private Long id;
    private String nome;
    private String tipo;
    private String cidadeNome; //aqui mostra a cidade da qual o comercio pertence
}