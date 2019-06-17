package Ejecutable;

import Armas.Arma;
import Clases.Juego;
import Zombies.Witch;
import Zombies.ZombieNormal;

public class Main {

    public static void main(String[] args) {

        Juego juego = new Juego("LEFT4UTN","Felipe Cilia - Ramiro Cambre");
        Arma garrasWitch = new Arma("Garras Witch",10,"No se por que tiene tipo");
        Arma golpeZombie = new Arma("GolpeZombie",2,"No se por que tiene tipo");
        Witch witch1 = new Witch("Witch",10,garrasWitch,"F","llora como una hdp");
        ZombieNormal zombie1 = new ZombieNormal("Zombie generic 1",2,golpeZombie,"M","Ninguna es inutil");

        juego.agregarZombie(witch1);
        juego.agregarZombie(zombie1);


        juego.listarZombie();




    }
}
