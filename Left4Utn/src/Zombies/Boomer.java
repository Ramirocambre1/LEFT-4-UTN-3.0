package Zombies;


import Interfaces.Atacar;

import Interfaces.DescripcionZombie;

public class Boomer extends Zombie implements DescripcionZombie, Atacar {
    public Boomer(String nombre, int salud, String sexo, String especialidad) {
        super(nombre,salud,sexo,especialidad);
    }


    @Override
    public void describirZombie() {

        System.out.println("Infectado obeso que puede lanzar su bilis sobre los supervivientes. Esta sustancia actúa como feromona que atrae una gran cantidad de infectados hacia el superviviente impactado. Cuando muere, el Boomer explota impregnando de bilis todo lo que hay a su alrededor, pudiendo afectar a los supervivientes.");

    }

    @Override
    public int atacar() {

        int minimo=4;
        int maximo=7;

        int daño= (int) (Math.random()*(maximo-minimo)+minimo);

        System.out.println("El Boomer te vomita encima tuyo haciendote "+daño+ "de daño ");

        return daño;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
