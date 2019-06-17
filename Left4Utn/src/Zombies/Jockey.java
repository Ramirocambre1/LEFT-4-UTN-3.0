package Zombies;

import Armas.Arma;
import Interfaces.Atacar;
import Interfaces.Descripcion;

public class Jockey extends Zombie implements Descripcion, Atacar {
    public Jockey(String nombre, int salud, Arma arma, String sexo, String especialidad) {
        super(nombre, salud, arma, sexo, especialidad);
    }

    @Override
    public void describir() {
        System.out.println(" infectado pequeño y jorobado que segun Valve es el esposo de la Spitter,que se desplaza " +
                "como un mono, emite ruidos y risas de hiena. Su poder radica en que puede saltar encima de los supervivientes y controlarlos.");
    }

    @Override
    public void atacar() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
