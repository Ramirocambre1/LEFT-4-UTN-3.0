package Zombies;


import Interfaces.Atacar;

import Interfaces.DescripcionZombie;

public class Smoker extends Zombie implements DescripcionZombie, Atacar {
    public Smoker(String nombre, int salud, String sexo, String especialidad) {
        super(nombre, salud, sexo, especialidad);
    }

    @Override
    public void describirZombie() {

        System.out.println(" Infectado alto y delgado que atrapa con su lengua (muchos dicen que son sus intestinos) " +
                "a los supervivientes, provocando que la víctima se aleje del grupo y pudiendo llegar a asfixiarla. Cuando muere, deja una espesa cortina de humo que distorsiona la visión y que provoque que los supervivientes se pongan a toser, surgiendo así su nombre.");

    }

    @Override
    public int atacar() {
        int minimo=4;
        int maximo=10;

        int daño= (int) (Math.random()*(maximo-minimo)+minimo);

        System.out.println("El smoker te atrapa con su lengua haciendote  "+daño+ "de daño ");
        System.out.println("-----------------------");

        return daño;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
