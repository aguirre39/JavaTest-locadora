package br.ce.wcaquino.exceptions;

// Classe NaoPodeDividirPorZeroException representa uma exceção que ocorre quando uma operação de divisão é tentada por zero
public class NaoPodeDividirPorZeroException extends Exception {

    // Atributos
    private static final long serialVersionUID = 7199045573572505549L;

    // Construtor vazio
    public NaoPodeDividirPorZeroException() {}

    // Construtor com mensagem
    public NaoPodeDividirPorZeroException(String message) {
        super(message);
    }

    // Construtor com mensagem e causa
    public NaoPodeDividirPorZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    // Construtor com causa
    public NaoPodeDividirPorZeroException(Throwable cause) {
        super(cause);
    }

    // Construtor com mensagem, causa e habilitação de propagação
    public NaoPodeDividirPorZeroException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
