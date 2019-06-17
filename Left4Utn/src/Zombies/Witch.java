package Zombies;


import Interfaces.Atacar;

import Interfaces.DescripcionZombie;

public class Witch extends Zombie implements DescripcionZombie, Atacar {
    public Witch(String nombre, int salud, String sexo, String especialidad) {
        super(nombre, salud, sexo, especialidad);
    }

    @Override
    public void describirZombie() {
        System.out.println("Infectado femenino reconocible por su forma de llorar. A diferencia de los demás " +
                "infectados, ésta no ataca a los supervivientes a menos que se acerquen a ella, la ataquen, o la alumbren con la linterna. Tan solo uno de sus golpes incapacita al superviviente, si está en modo experto lo mata instantaneamente. Es un infectada no jugable: no podemos manejarlo en el modo enfrentamiento. No se recomienda asustarla a menos que se esté preaparado, su forma de llorar y su tamaño podrían engañar ya que es la más fuerte y rápida de los infectados.");
    }

    @Override
    public int atacar() {
        int minimo=99;
        int maximo=100;

        int daño= (int) (Math.random()*(maximo-minimo)+minimo);

        System.out.println("La witch se abalanza sobre vos con sus garras haciendote  "+daño+ "de daño ");

        return daño;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
