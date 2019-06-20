package Zombies;

import Interfaces.Atacar;
import Interfaces.Describir;

public class Hunter extends Zombie implements Describir,Atacar {//Clase del zombi tipo hunter
    public Hunter(String nombre, int salud, String sexo, String especialidad) {//Constructor de la clase
        super(nombre, salud,sexo, especialidad);
    }

    public Hunter()
    {
        super();
    }

    @Override
    public void describir() {//implementacion de la interfaz para describir al zombi

        System.out.println("Infectado muy rápido y ágil que puede atacar y dañar severamente a un superviviente, ya " +
                "que al embestirlo lo deja indefenso y sólo puede liberarse con la ayuda de uno de sus compañeros. Es capaz de saltar desde un edificio sin hacerse daño.");
    }

    @Override
    public int atacar() {//implementacion de la interfaz que realiza la opcion de atacar cada zombi con difrentes
        // mensajes y daño causado.
        int minimo=10;
        int maximo=15;

        int daño= (int) (Math.random()*(maximo-minimo)+minimo);

        System.out.println("Hunter salta sobre vos rajuñandote provocandote "+daño+ " de daño ");
        System.out.println("-----------------------");

        return daño;
    }

    @Override
    public String toString() {
        return super.toString();
    }//Metodo que te devuelve la info del zombi
}
