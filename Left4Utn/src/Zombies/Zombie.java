package Zombies;

import Armas.Arma;
import Clases.Personaje;
import Interfaces.Descripcion;

public class Zombie extends Personaje  {
    private String especialidad;

    public Zombie(String nombre, int salud, Arma arma, String sexo, String especialidad) {
        super(nombre, salud, arma, sexo);
        this.especialidad = especialidad;
    }

    private void mostrarInfo(Zombie z){
        System.out.println(z.toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Especialidad:" + especialidad + '\'';
    }

    public String getEspecialidad() {
        return especialidad;
    }


}
