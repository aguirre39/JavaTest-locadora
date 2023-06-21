package br.ce.wcaquino.entidades;

import java.util.Date;
import java.util.List;

// Classe Locacao representa uma locação de um filme para um usuário
public class Locacao {

    // Atributos
    private Usuario usuario; // Usuário que fez a locação
    private List<Filme> filmes; // Lista de filmes locados
    private Date dataLocacao; // Data da locação
    private Date dataRetorno; // Data de devolução
    private Double valor; // Valor da locação

    // Getters e setters
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getDataLocacao() {
        return dataLocacao;
    }
    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }
    public Date getDataRetorno() {
        return dataRetorno;
    }
    public void setDataRetorno(Date dataRetorno) {
        this.dataRetorno = dataRetorno;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public List<Filme> getFilmes() {
        return filmes;
    }
    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
}
