package Zombies;

import Armas.Arma;
import Interfaces.Atacar;
import Interfaces.Descripcion;

public class Hunter extends Zombie implements Descripcion,Atacar {
    public Hunter(String nombre, int salud, Arma arma, String sexo, String especialidad) {
        super(nombre, salud, arma, sexo, especialidad);
    }

    @Override
    public void describir() {

        System.out.println("Infectado muy rápido y ágil que puede atacar y dañar severamente a un superviviente, ya " +
                "que al embestirlo lo deja indefenso y sólo puede liberarse con la ayuda de uno de sus compañeros. Es capaz de saltar desde un edificio sin hacerse daño.");
    }

    @Override
    public void atacar() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
