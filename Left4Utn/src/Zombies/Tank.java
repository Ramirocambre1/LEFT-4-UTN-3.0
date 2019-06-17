package Zombies;

import Armas.Arma;
import Interfaces.Atacar;
import Interfaces.Descripcion;

public class Tank extends Zombie implements Descripcion, Atacar {
    public Tank(String nombre, int salud, Arma arma, String sexo, String especialidad) {
        super(nombre, salud, arma, sexo, especialidad);
    }

    public void describir()
    {
        System.out.println("Infectado monstruoso con una gran masa muscular y resistencia. Puede agarrar cosas " +
                "pesadas (como rocas, vehículos livianos, contenedores de basuras e incluso árboles enteros) y tirarlos a los supervivientes. También puede lanzar tanto a infectados como a los supervivientes por los aires, haciéndoles mucho daño..");

    }

    @Override
    public void atacar() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
