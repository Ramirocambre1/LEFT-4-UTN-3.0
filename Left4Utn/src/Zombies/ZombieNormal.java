package Zombies;


import Interfaces.Atacar;
import Interfaces.Describir;

public class ZombieNormal extends Zombie implements Describir, Atacar { //Clase del zombi tipo normal
    public ZombieNormal(String nombre, int salud, String sexo, String especialidad) {//Constructor de la clase
        super(nombre, salud, sexo, especialidad);
    }

    public  ZombieNormal()
    {

    }

    @Override
    public void describir() { //implementacion de la interfaz para describir al zombi
        System.out.println("También conocidos como Zombis, Caminantes, Muertos Vivientes son infectados que no " +
                "mutaron y solamente perdieron la razón, tienen todavía la forma humana.");

    }

    @Override
    public int atacar() {//implementacion de la interfaz que realiza la opcion de atacar cada zombi con difrentes
        // mensajes y daño causado.
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
    }//Metodo que te devuelve la info del zombi


}
