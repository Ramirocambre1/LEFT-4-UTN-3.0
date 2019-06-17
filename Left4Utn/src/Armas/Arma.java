package Armas;

public class Arma {
    private String nombreArma;
    private int daño;
    private String tipo;

    public Arma(String nombreArma, int daño, String tipo) {
        this.nombreArma = nombreArma;
        this.daño = daño;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return
                "Arma:'" + nombreArma + '\'' +
                ", daño:" + daño +
                ", tipo:'" + tipo + '\'';
    }
}
