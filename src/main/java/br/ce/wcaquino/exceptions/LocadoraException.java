package br.ce.wcaquino.exceptions;

// Classe LocadoraException representa uma exceção específica da aplicação
public class LocadoraException extends Exception {

    // Atributos
    private static final long serialVersionUID = 3837982804180390821L;

    // Construtor com mensagem
    public LocadoraException(String message) {
        super(message);
    }

    // Construtor com mensagem e causa
    public LocadoraException(String message, Throwable cause) {
        super(message, cause);
    }

    // Construtor com causa
    public LocadoraException(Throwable cause) {
        super(cause);
    }

    // Construtor com mensagem, causa e habilitação de propagação
    public LocadoraException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
