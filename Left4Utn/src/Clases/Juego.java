package Clases;

import Zombies.Zombie;

import java.util.HashMap;
import java.util.Iterator;

public class Juego {

    private HashMap<String, Zombie> hashZombies;
    private String nombreJuego;
    private String creadores;

    public Juego(String nombreJuego, String creadores) {
        this.nombreJuego = nombreJuego;
        this.creadores = creadores;
        hashZombies = new HashMap<String, Zombie>();
    }

    public void agregarZombie(Zombie a)
    {

        hashZombies.put(a.getEspecialidad(),a);


    }

    public void listarZombie()
    {
        Iterator iterator = this.hashZombies.values().iterator();

        while (iterator.hasNext())
        {
            Zombie zombie= (Zombie) iterator.next();

            System.out.println("----Zombies----");
            System.out.println(""+zombie.toString());

        }


    }

}
