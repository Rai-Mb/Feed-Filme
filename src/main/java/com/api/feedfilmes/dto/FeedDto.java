package com.api.feedfilmes.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class FeedDto {

    @NotBlank
    private String nomeDoFilme;
    @NotBlank
    private String genero;
    @NotBlank
    @Size(max = 2)
    private int classeDeIdade;
    @NotBlank
    @Size(max = 10)
    private String lancamento;
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

    public int getClasseDeIdade() {
        return classeDeIdade;
    }

    public void setClasseDeIdade(int classeDeIdade) {
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
