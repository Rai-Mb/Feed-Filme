package com.api.feedfilmes.Dto;


import org.springframework.lang.Nullable;

public class feedDto {


    private String nomeDoFilme;
    private String genero;
    private int classeDeIdade;
    @Nullable
    private String feedbackDoFilme;

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

    @Nullable
    public String getFeedbackDoFilme() {
        return feedbackDoFilme;
    }

    public void setFeedbackDoFilme(@Nullable String feedbackDoFilme) {
        this.feedbackDoFilme = feedbackDoFilme;
    }
}
