package Zombies;


import Interfaces.Atacar;
import Interfaces.Describir;
import Interfaces.Json;
import org.json.JSONException;
import org.json.JSONObject;

public class Charger extends Zombie implements Describir, Atacar {//Clase del zombi tipo charger
    public Charger(String nombre, int salud, String sexo, String especialidad) { //Constructor de la clase
        super(nombre, salud,sexo, especialidad);
    }

    public Charger()
    {

        super();

    }

    @Override
    public void describir() { //implementacion de la interfaz para describir al zombi

        System.out.println(" Infectado deforme que posee un robusto y gigantesco brazo, cuyo tamaño es inversamente " +
                "proporcional al otro, que es muy pequeño. Es capaz de correr a gran velocidad hacia uno de los " +
                "supervivientes y arrastrarlo hasta topar con un lugar con el que parar, para, acto seguido, comenzar a aplastarle contra el suelo. Tiene una gran cantidad de salud y si se encuentra en terreno abierto se hace muy difícil seguirle una vez ha arrastrado a alguno de los supervivientes. El ruido que hace es similar al bramido de un toro.");

    }

    @Override
    public int atacar() {//implementacion de la interfaz que realiza la opcion de atacar cada zombi con difrentes
        // mensajes y daño causado.
        int minimo=10;
        int maximo=15;

        int daño= (int) (Math.random()*(maximo-minimo)+minimo);

        System.out.println("El Charger carga hacia vos con fuerza,espujandote y  haciendote "+daño+ " de daño ");
        System.out.println("-----------------------");

        return daño;
    }

    @Override
    public String toString() {
        return super.toString();
    }//Metodo que te devuelve la info del zombi


}
