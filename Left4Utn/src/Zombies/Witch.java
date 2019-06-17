package Zombies;

import Armas.Arma;
import Interfaces.Atacar;
import Interfaces.Descripcion;

public class Witch extends Zombie implements Descripcion, Atacar {
    public Witch(String nombre, int salud, Arma arma, String sexo, String especialidad) {
        super(nombre, salud, arma, sexo, especialidad);
    }

    @Override
    public void describir() {
        System.out.println("Infectado femenino reconocible por su forma de llorar. A diferencia de los demás " +
                "infectados, ésta no ataca a los supervivientes a menos que se acerquen a ella, la ataquen, o la alumbren con la linterna. Tan solo uno de sus golpes incapacita al superviviente, si está en modo experto lo mata instantaneamente. Es un infectada no jugable: no podemos manejarlo en el modo enfrentamiento. No se recomienda asustarla a menos que se esté preaparado, su forma de llorar y su tamaño podrían engañar ya que es la más fuerte y rápida de los infectados.");
    }

    @Override
    public void atacar() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
