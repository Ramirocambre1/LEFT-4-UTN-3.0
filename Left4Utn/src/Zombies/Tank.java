package Zombies;


import Interfaces.Atacar;
import Interfaces.Describir;

public class Tank extends Zombie implements Describir, Atacar {//Clase del zombi tipo Tank
    public Tank(String nombre, int salud, String sexo, String especialidad) {//Constructor de la clase
        super(nombre, salud, sexo, especialidad);
    }

    public Tank()
    {
        super();
    }

    public void describir()//implementacion de la interfaz para describir al zombi
    {
        System.out.println("Infectado monstruoso con una gran masa muscular y resistencia. Puede agarrar cosas " +
                "pesadas (como rocas, vehículos livianos, contenedores de basuras e incluso árboles enteros) y tirarlos a los supervivientes. También puede lanzar tanto a infectados como a los supervivientes por los aires, haciéndoles mucho daño..");

    }

    @Override
    public int atacar() {//implementacion de la interfaz que realiza la opcion de atacar cada zombi con difrentes
        // mensajes y daño causado.

        int minimo=20;
        int maximo=25;

        int daño= (int) (Math.random()*(maximo-minimo)+minimo);

        System.out.println("Te tira piedas gigantes haciendote  "+daño+ " de daño ");
        System.out.println("-----------------------");

        return daño;
    }

    @Override
    public String toString() {
        return super.toString();
    }//Metodo que te devuelve la info del zombi
}
