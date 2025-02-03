package com.placeti.desafio.model;
import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comercio {
//Id do comercio tbm tem que ser chave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tipo;
    private Cidade cidade2;

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getTipo() { return tipo; }
    public Cidade getCidade() { return cidade; }

    @ManyToOne //agora um comercio n pode pertencer a duas cidades
    @JoinColumn(name = "cidade_id", nullable = false)  // todo comercio tem uma cidade looooogo temos chave estrangeira 
    @JsonBackReference
    private Cidade cidade;  // A cidade à qual o comércio pertence
}
// mo fome filho