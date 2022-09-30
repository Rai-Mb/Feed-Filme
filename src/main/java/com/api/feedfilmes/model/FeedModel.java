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
    private LocalDateTime dataDeRegistro;
    @Column(nullable = false, length = 100)
    private String nomeDoFilme;
    @Column(nullable = false, length = 50)
    private String genero;
    @Column(length = 30)
    private String classeDeIdade;
    @Column(nullable = false, length = 10)
    private String lancamento;
    @Column(nullable = false, length = 1000)
    private String feedBack;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getRegistrationDate() {
        return dataDeRegistro;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.dataDeRegistro = registrationDate;
    }
    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasseDeIdade() {
        return classeDeIdade;
    }

    public void setClasseDeIdade(String classeDeIdade) {
        this.classeDeIdade = classeDeIdade;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }
}
