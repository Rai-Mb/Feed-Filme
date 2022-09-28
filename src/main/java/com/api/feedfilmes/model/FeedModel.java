package com.api.feedfilmes.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Table(name = "TB_FILME")
public class FeedModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private LocalDateTime data_De_Registro;
    @Column(nullable = false, length = 100)
    private String nome_Do_Filme;
    @Column(nullable = false, length = 50)
    private String genero;
    @Column(length = 30)
    private String classe_De_Idade;
    @Column(nullable = false, length = 10)
    private String lancamento;
    @Column(nullable = false, length = 1000)
    private String feed_Back;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getRegistrationDate() {
        return data_De_Registro;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.data_De_Registro = registrationDate;
    }
    public String getNomeDoFilme() {
        return nome_Do_Filme;
    }

    public void setNome_Do_Filme(String nomeDoFilme) {
        this.nome_Do_Filme = nomeDoFilme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasse_De_Idade() {
        return classe_De_Idade;
    }

    public void setClasse_De_Idade(String classe_De_Idade) {
        this.classe_De_Idade = classe_De_Idade;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    public String getFeed_Back() {
        return feed_Back;
    }

    public void setFeed_Back(String feed_Back) {
        this.feed_Back = feed_Back;
    }
}
