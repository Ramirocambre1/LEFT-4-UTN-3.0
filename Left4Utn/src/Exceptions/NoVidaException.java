package Exceptions;

public class NoVidaException extends Exception { //Excepcion que salta cuando te quedas sin vida o perdiste el juego
    // por la toma de una decision

    private String clave; // Mensaje de error

    public NoVidaException(String msg) {
        super(msg);
        clave = msg;
    }
}
