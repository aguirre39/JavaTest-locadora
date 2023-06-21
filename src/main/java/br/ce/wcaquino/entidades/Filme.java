package br.ce.wcaquino.entidades;

// Classe Filme representa um filme que pode ser locado
public class Filme {

    // Atributos
    private String nome; // Nome do filme
    private Integer estoque; // Número de exemplares disponíveis
    private Double precoLocacao; // Preço de locação de um único exemplar

    // Construtor vazio
    public Filme() {}

    // Construtor com parâmetros
    public Filme(String nome, Integer estoque, Double precoLocacao) {
        this.nome = nome;
        this.estoque = estoque;
        this.precoLocacao = precoLocacao;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getEstoque() {
        return estoque;
    }
    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
    public Double getPrecoLocacao() {
        return precoLocacao;
    }
    public void setPrecoLocacao(Double precoLocacao) {
        this.precoLocacao = precoLocacao;
    }
}
