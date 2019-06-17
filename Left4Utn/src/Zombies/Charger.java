package Zombies;

import Armas.Arma;
import Interfaces.Atacar;
import Interfaces.Descripcion;

public class Charger extends Zombie implements Descripcion , Atacar {
    public Charger(String nombre, int salud, Arma arma, String sexo, String especialidad) {
        super(nombre, salud, arma, sexo, especialidad);
    }

    @Override
    public void describir() {

        System.out.println(" Infectado deforme que posee un robusto y gigantesco brazo, cuyo tamaño es inversamente " +
                "proporcional al otro, que es muy pequeño. Es capaz de correr a gran velocidad hacia uno de los " +
                "supervivientes y arrastrarlo hasta topar con un lugar con el que parar, para, acto seguido, comenzar a aplastarle contra el suelo. Tiene una gran cantidad de salud y si se encuentra en terreno abierto se hace muy difícil seguirle una vez ha arrastrado a alguno de los supervivientes. El ruido que hace es similar al bramido de un toro.");

    }

    @Override
    public void atacar() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
