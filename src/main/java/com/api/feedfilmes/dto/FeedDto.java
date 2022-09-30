package com.api.feedfilmes.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;


public class FeedDto {
    @JsonProperty("nome_do_filme")
    @NotBlank
    private String nomeDoFilme;
    @NotBlank
    private String genero;
    @JsonProperty("classe_de_idade")
    @Size(max = 10)
    private String classeDeIdade;
    @NotBlank
    @Size(max = 10)
    private String lancamento;
    @JsonProperty("feed_back")
    @NotBlank
    private String feedBack;

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
