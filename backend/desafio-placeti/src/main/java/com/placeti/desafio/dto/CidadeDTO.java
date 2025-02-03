package com.placeti.desafio.dto; // Conecção com o frontend
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class CidadeDTO {
    private Long id;
    private String nome;
    private String estado;
    private List<String> comercios; //esse aqui vai ditar os nomes dos comercios da cidade 
}