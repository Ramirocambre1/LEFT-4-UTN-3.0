package Zombies;

import Armas.Arma;
import Interfaces.Atacar;
import Interfaces.Descripcion;

public class Boomer extends Zombie implements Descripcion, Atacar {
    public Boomer(String nombre, int salud, Arma arma, String sexo, String especialidad) {
        super(nombre, salud, arma, sexo, especialidad);
    }


    @Override
    public void describir() {

        System.out.println("Infectado obeso que puede lanzar su bilis sobre los supervivientes. Esta sustancia actúa como feromona que atrae una gran cantidad de infectados hacia el superviviente impactado. Cuando muere, el Boomer explota impregnando de bilis todo lo que hay a su alrededor, pudiendo afectar a los supervivientes.");

    }

    @Override
    public void atacar() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
