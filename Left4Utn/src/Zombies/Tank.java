package Zombies;


import Interfaces.Atacar;
import Interfaces.Describir;

public class Tank extends Zombie implements Describir, Atacar {
    public Tank(String nombre, int salud, String sexo, String especialidad) {
        super(nombre, salud, sexo, especialidad);
    }

    public void describir()
    {
        System.out.println("Infectado monstruoso con una gran masa muscular y resistencia. Puede agarrar cosas " +
                "pesadas (como rocas, vehículos livianos, contenedores de basuras e incluso árboles enteros) y tirarlos a los supervivientes. También puede lanzar tanto a infectados como a los supervivientes por los aires, haciéndoles mucho daño..");

    }

    @Override
    public int atacar() {

        int minimo=20;
        int maximo=25;

        int daño= (int) (Math.random()*(maximo-minimo)+minimo);

        System.out.println("Te tira lo primero que encuentra a mano haciendote "+daño+ " de daño ");
        System.out.println("-----------------------");

        return daño;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
