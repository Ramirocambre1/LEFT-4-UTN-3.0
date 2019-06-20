package Armas;

public class Melee extends Arma {
    public Melee(String nombreArma, int daño, String tipo) {//Constructor de la clase
        super(nombreArma, daño, tipo);
    }

    public Melee()
    {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }//Retorna un String con los atributos de la clase
}
