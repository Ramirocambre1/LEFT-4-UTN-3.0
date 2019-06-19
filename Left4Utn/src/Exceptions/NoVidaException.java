package Exceptions;

public class NoVidaException extends Exception {

    private String clave; // Mensaje de error

    public NoVidaException(String msg) {
        super(msg);
        clave = msg;
    }
}
