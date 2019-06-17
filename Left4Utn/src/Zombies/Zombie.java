package Zombies;

import Clases.Personaje;

public class Zombie extends Personaje  {
    private String especialidad;

    public Zombie(String nombre, int salud ,String sexo, String especialidad) {
        super(nombre, salud,sexo);
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
