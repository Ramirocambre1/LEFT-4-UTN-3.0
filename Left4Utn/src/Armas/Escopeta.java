package Armas;

public class Escopeta extends Arma {
    public Escopeta(String nombreArma, int daño, String tipo) { //Constructor de la clase
        super(nombreArma, daño, tipo);
    }

    public Escopeta()
    {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }//Retorna un String con los atributos de la clase
}
