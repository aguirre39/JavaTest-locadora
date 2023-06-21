package br.ce.wcaquino.exceptions;

// Classe FilmeSemEstoqueException representa uma exceção que ocorre quando um filme não está em estoque
public class FilmeSemEstoqueException extends Exception {

    // Atributos
    private static final long serialVersionUID = -4970527916966267734L;

    // Construtor vazio
    public FilmeSemEstoqueException() {}

    // Construtor com mensagem
    public FilmeSemEstoqueException(String message) {
        super(message);
    }

    // Construtor com mensagem e causa
    public FilmeSemEstoqueException(String message, Throwable cause) {
        super(message, cause);
    }

    // Construtor com causa
    public FilmeSemEstoqueException(Throwable cause) {
        super(cause);
    }

    // Construtor com mensagem, causa e habilitação de propagação
    public FilmeSemEstoqueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}