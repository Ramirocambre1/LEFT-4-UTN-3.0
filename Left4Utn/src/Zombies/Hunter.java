package Zombies;

import Interfaces.Atacar;

import Interfaces.DescripcionZombie;

public class Hunter extends Zombie implements DescripcionZombie,Atacar {
    public Hunter(String nombre, int salud, String sexo, String especialidad) {
        super(nombre, salud,sexo, especialidad);
    }

    @Override
    public void describirZombie() {

        System.out.println("Infectado muy rápido y ágil que puede atacar y dañar severamente a un superviviente, ya " +
                "que al embestirlo lo deja indefenso y sólo puede liberarse con la ayuda de uno de sus compañeros. Es capaz de saltar desde un edificio sin hacerse daño.");
    }

    @Override
    public int atacar() {
        int minimo=10;
        int maximo=10;

        int daño= (int) (Math.random()*(maximo-minimo)+minimo);

        System.out.println("Hunter salta sobre ti rajuñandote entero "+daño+ "de daño ");

        return daño;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
