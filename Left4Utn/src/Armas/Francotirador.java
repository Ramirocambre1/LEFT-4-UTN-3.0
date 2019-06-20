package Armas;

public class Francotirador extends Arma {


    public Francotirador(String nombreArma, int daño, String tipo) {//Constructor de la clase
        super(nombreArma, daño, tipo);
    }

    public Francotirador()
    {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }//Retorna un String con los atributos de la clase
}
