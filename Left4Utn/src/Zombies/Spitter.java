package Zombies;

import Armas.Arma;
import Interfaces.Atacar;
import Interfaces.Descripcion;

public class Spitter extends Zombie implements Descripcion , Atacar {
    public Spitter(String nombre, int salud, Arma arma, String sexo, String especialidad) {
        super(nombre, salud, arma, sexo, especialidad);
    }

    @Override
    public void describir() {
        System.out.println("Infectado femenino que segun Valve es la esposa del Jockey, su estómago está lleno de un " +
                "ácido muy corrosivo y puede escupirlo a una gran distancia. Al llegar al suelo se expande y daña a los supervivientes situados en dicho charco, provocando más daño cuanto más tiempo estén sobre él. En ocasiones es muy silenciosa, pero de vez en cuando emite unos chillidos muy agudos y característicos. Al morir, deja a su alrededor un charco de ácido, más pequeño que el que emite, pero igual de corrosivo. Lleva ropa interior de color rosa.");
    }

    @Override
    public void atacar() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
