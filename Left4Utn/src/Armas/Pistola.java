package Armas;

public class Pistola extends Arma {
    public Pistola(String nombreArma, int daño, String tipo) {//Constructor de la clase
        super(nombreArma, daño, tipo);
    }

    public Pistola()
    {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }//Retorna un String con los atributos de la clase
}
