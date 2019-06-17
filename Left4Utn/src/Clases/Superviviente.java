package Clases;

import Armas.Arma;
import Interfaces.Atacar;

public class Superviviente extends Personaje implements Atacar {
    private int edad;
    private int cantidadBotiquines;

    public Superviviente(String nombre, int salud, Arma arma, String sexo, int edad, int cantidadBotiquines) {
        super(nombre, salud, arma, sexo);
        this.edad = edad;
        this.cantidadBotiquines = cantidadBotiquines;
    }

    @Override
    public String toString() {
        return super.toString()+"Superviviente{" +
                "edad=" + edad +
                ", cantidadBotiquines=" + cantidadBotiquines +
                '}';
    }

    @Override
    public void atacar() {

    }
}
