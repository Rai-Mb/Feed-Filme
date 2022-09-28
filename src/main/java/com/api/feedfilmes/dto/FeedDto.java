package com.api.feedfilmes.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class FeedDto {

    @NotBlank
    private String nome_Do_Filme;
    @NotBlank
    private String genero;

    private String classe_De_Idade;
    @NotBlank
    @Size(max = 10)
    private String lancamento;
    @NotBlank
    private String feed_Back;

    public String getNome_Do_Filme() {
        return nome_Do_Filme;
    }

    public void setNome_Do_Filme(String nome_Do_Filme) {
        this.nome_Do_Filme = nome_Do_Filme;
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

    public String getFeedBack() {
        return feed_Back;
    }

    public void setFeed_Back(String feedBack) {
        this.feed_Back = feed_Back;
    }
}
