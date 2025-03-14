package br.com.milosz.biblioteca.livro.models.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "livro")
public class LivroEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "data_publicacao", nullable = false)
    private LocalDate dataPublicacao;

    public LivroEntity() {
    }

    public LivroEntity(LocalDate dataPublicacao, String nome) {
        this.nome = nome;
        this.dataPublicacao = dataPublicacao;
    }
}
