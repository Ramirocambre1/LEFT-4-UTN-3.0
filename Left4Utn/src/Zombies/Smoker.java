package Zombies;

import Armas.Arma;
import Interfaces.Atacar;
import Interfaces.Descripcion;

public class Smoker extends Zombie implements Descripcion, Atacar {
    public Smoker(String nombre, int salud, Arma arma, String sexo, String especialidad) {
        super(nombre, salud, arma, sexo, especialidad);
    }

    @Override
    public void describir() {

        System.out.println(" Infectado alto y delgado que atrapa con su lengua (muchos dicen que son sus intestinos) " +
                "a los supervivientes, provocando que la víctima se aleje del grupo y pudiendo llegar a asfixiarla. Cuando muere, deja una espesa cortina de humo que distorsiona la visión y que provoque que los supervivientes se pongan a toser, surgiendo así su nombre.");

    }

    @Override
    public void atacar() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
