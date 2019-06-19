package Zombies;


import Interfaces.Atacar;

import Interfaces.DescripcionZombie;

public class ZombieNormal extends Zombie implements DescripcionZombie, Atacar {
    public ZombieNormal(String nombre, int salud, String sexo, String especialidad) {
        super(nombre, salud, sexo, especialidad);
    }

    @Override
    public void describirZombie() {
        System.out.println("También conocidos como Zombis, Caminantes, Muertos Vivientes son infectados que no " +
                "mutaron y solamente perdieron la razón, tienen todavía la forma humana.");

    }

    @Override
    public int atacar() {
        int minimo=1;
        int maximo=6;

        int daño= (int) (Math.random()*(maximo-minimo)+minimo);

        System.out.println("El zombie te golpea haciendote "+daño);
        System.out.println("-----------------------");

        return daño;

    }

    @Override
    public String toString() {
        return super.toString();
    }


}
