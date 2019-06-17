package Clases;

import Armas.Arma;
import Interfaces.Atacar;

public class Superviviente extends Personaje implements Atacar {
    private int edad;
    private Arma arma;

    public Superviviente(String nombre, int salud, Arma arma, String sexo, int edad) {
        super(nombre, salud,sexo);
        this.edad = edad;
        this.arma=arma;
    }

    @Override
    public String toString() {
        return super.toString()+"Superviviente{" +
                "edad=" + edad;
    }

    @Override
    public void atacar() {

    }

    public void restarVida(int vida)
    {
        super.setSalud(5);

    }

    public void  vidaCero()
    {
        super.setSalud(0);
    }

}
