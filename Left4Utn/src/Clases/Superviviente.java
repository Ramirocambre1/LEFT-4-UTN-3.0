package Clases;

import Armas.Arma;
import Exceptions.NoVidaException;
import Interfaces.Atacar;

public class Superviviente extends Personaje implements Atacar {
    private int edad;
    private Arma arma;

    public Superviviente(String nombre, int salud, Arma arma, String sexo, int edad) {
        super(nombre, salud,sexo);
        this.edad = edad;
        this.arma=arma;
    }

    @Override
    public String toString() {
        return super.toString()+"Superviviente{" +
                "edad=" + edad;
    }

    @Override
    public int atacar() {

        int daño=arma.getDaño();
        System.out.println("-----------------------");
        System.out.println("Atacaste al infectado con "+ arma.getNombreArma() +" haciendole "+ daño +" de daño ");
        System.out.println("-----------------------");
        return daño;
    }

    public int getSaludJugador()throws NoVidaException
    {
      int vida= getSalud();

      if (vida<=0)
      {
          throw  new NoVidaException("GAME OVER TE QUEDASTE SIN VIDA");

      }

      return vida;

    }


    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public  void encontrarArma(Arma arma)
    {
        setArma(arma);

    }

    public String consultarArma()
    {
        String nombreArma;

        nombreArma=this.arma.getNombreArma();

        return "Tu arma equipada es: "+nombreArma;


    }

    public void  vidaCero() throws NoVidaException
    {
        this.setSalud(0);

        if (getSalud()==0)
        {
            throw  new NoVidaException("GAME OVER TE QUEDASTE SIN VIDA");

        }
    }
}
