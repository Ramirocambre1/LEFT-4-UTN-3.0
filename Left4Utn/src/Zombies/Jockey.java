package Zombies;


import Interfaces.Atacar;

import Interfaces.DescripcionZombie;

public class Jockey extends Zombie implements DescripcionZombie, Atacar {
    public Jockey(String nombre, int salud, String sexo, String especialidad) {
        super(nombre, salud, sexo, especialidad);
    }

    @Override
    public void describirZombie() {
        System.out.println(" Infectado pequeño y jorobado ,que se desplaza " +
                "como un mono, emite ruidos y risas de hiena. Su poder radica en que puede saltar encima de los supervivientes y controlarlos.");
    }

    @Override
    public int atacar() {
        int minimo=6;
        int maximo=9;

        int daño= (int) (Math.random()*(maximo-minimo)+minimo);

        System.out.println("Jockey salta sobre tu cabeza haciendote  "+daño+ "de daño ");

        return daño;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
