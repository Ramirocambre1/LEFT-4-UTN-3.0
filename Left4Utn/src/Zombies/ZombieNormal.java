package Zombies;

import Armas.Arma;
import Interfaces.Atacar;
import Interfaces.Descripcion;

public class ZombieNormal extends Zombie implements Descripcion , Atacar {
    public ZombieNormal(String nombre, int salud, Arma arma, String sexo, String especialidad) {
        super(nombre, salud, arma, sexo, especialidad);
    }

    @Override
    public void describir() {
        System.out.println("También conocidos como Zombis, Caminantes, Muertos Vivientes son infectados que no " +
                "mutaron y solamente perdieron la razón, tienen todavía la forma humana.");

    }

    @Override
    public void atacar() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
