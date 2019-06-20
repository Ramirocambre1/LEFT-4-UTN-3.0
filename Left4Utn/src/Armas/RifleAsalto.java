package Armas;

public class RifleAsalto extends Arma {
    public RifleAsalto(String nombreArma, int daño, String tipo) {//Constructor de la clase
        super(nombreArma, daño, tipo);
    }

    public RifleAsalto()
    {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }//Retorna un String con los atributos de la clase
}
