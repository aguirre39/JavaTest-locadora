package br.ce.wcaquino.entidades;

// Classe Usuario representa um usuário do sistema
public class Usuario {

    // Atributos
    private String nome; // Nome do usuário

    // Construtor vazio
    public Usuario() {}

    // Construtor com parâmetros
    public Usuario(String nome) {
        this.nome = nome;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos herdados de Object
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null)? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass()!= obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (nome == null) {
            if (other.nome!= null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Usuario [nome=" + nome + "]";
    }
}