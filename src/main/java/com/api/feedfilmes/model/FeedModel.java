package com.api.feedfilmes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;


@Entity
@Table(name = "TB_FILME")
public class FeedModel implements Serializable {
    private static final long serialVersionUID = 1L;

        @Id
        private UUID id;
        @Column(nullable = false, unique = true, length = 10)
        private String nomeDoFilme;
        @Column(nullable = false, length = 10)
        private String genero;
        @Column(nullable = false, length = 10)
        private int classeDeIdade;
        @Column(nullable = false, length = 2)
        private String feedbackDoFilme;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public int getClasseDeIdade() {
        return classeDeIdade;
    }

    public void setClasseDeIdade(int classeDeIdade) {
        this.classeDeIdade = classeDeIdade;
    }

    public String getFeedbackDoFilme() {
        return feedbackDoFilme;
    }

    public void setFeedbackDoFilme(String feedbackDoFilme) {
        this.feedbackDoFilme = feedbackDoFilme;
    }
}