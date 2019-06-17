package Zombies;


import Interfaces.Atacar;

import Interfaces.DescripcionZombie;

public class Spitter extends Zombie implements DescripcionZombie, Atacar {
    public Spitter(String nombre, int salud, String sexo, String especialidad) {
        super(nombre, salud, sexo, especialidad);
    }

    @Override
    public void describirZombie() {
        System.out.println("Infectado femenino que,su estómago está lleno de un " +
                "ácido muy corrosivo y puede escupirlo a una gran distancia. Al llegar al suelo se expande y daña a los supervivientes situados en dicho charco, provocando más daño cuanto más tiempo estén sobre él. En ocasiones es muy silenciosa, pero de vez en cuando emite unos chillidos muy agudos y característicos. Al morir, deja a su alrededor un charco de ácido, más pequeño que el que emite, pero igual de corrosivo. Lleva ropa interior de color rosa.");
    }

    @Override
    public int atacar() {
        int minimo=5;
        int maximo=9;

        int daño= (int) (Math.random()*(maximo-minimo)+minimo);

        System.out.println("Te escupe un charco de acido abajo tuyo haciendote   "+daño+ "de daño ");

        return daño;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
