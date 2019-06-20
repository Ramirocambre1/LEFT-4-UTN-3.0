package Clases;

import Armas.Arma;
import Exceptions.NoVidaException;
import Interfaces.Atacar;
import Interfaces.Json;
import org.json.JSONException;
import org.json.JSONObject;

public class Superviviente extends Personaje implements Atacar, Json { //Extiende de personaje,el superviviente es la
    // clase del jugador principal
    private int edad;
    private Arma arma;

    public Superviviente(String nombre, int salud, Arma arma, String sexo, int edad) {//Constructor de la clase
        super(nombre, salud,sexo);
        this.edad = edad;
        this.arma=arma;
    }

    @Override
    public String toString() { //Metodo to string uqe imprime los atributos del personaje
        return super.toString()+"Superviviente{" +
                "edad=" + edad;
    }

    @Override
    public int atacar() {//Implimentacion de la interfaz atacar,este metodo se utiliza para cuando se pelea con los
        // diferentes infectados que te enfrentas durante la historia

        int daño=arma.getDaño();
        System.out.println("-----------------------");
        System.out.println("Atacaste al infectado con "+ arma.getNombreArma() +" haciendole "+ daño +" de daño ");
        System.out.println("-----------------------");
        return daño;
    }


    public Arma getArma() {
        return arma;
    }//Devuelve el arma de tu superviviente

    public void setArma(Arma arma) {
        this.arma = arma;
    }//Setea el arma de tu superviviente

    public  void encontrarArma(Arma arma)//Se utiliza cuando se encuentra un arma nueva en la historia y equipartela
    {
        setArma(arma);

    }

    public String consultarArma()//Te devuelve que arma tenes equipada
    {
        String nombreArma;

        nombreArma=this.arma.getNombreArma();

        return "Tu arma equipada es: "+nombreArma;


    }

    public void  vidaCero() throws NoVidaException//Metodo que se ejecuta cuando perdiste,te quedaste sin vida y tira
    // la vida NoVidaException
    {
        this.setSalud(0);

        if (getSalud()==0)
        {
            throw  new NoVidaException("GAME OVER TE QUEDASTE SIN VIDA");

        }
    }

    public int getEdad() {//Te duelve la edad de tu superviviente
        return edad;
    }

    public void setEdad(int edad) {//Setea la edad del superviviente
        this.edad = edad;
    }

    @Override
    public JSONObject getFormatoJson() throws JSONException {// Permite poner en formate json a los objetos de la
        // clase,retornando un objeto json para poder guardalo luego en un array

        JSONObject objetoJson = new JSONObject();
        objetoJson.put("nombre",super.getNombre());
        objetoJson.put("salud",super.getSalud());
        objetoJson.put("arma",getArma());
        objetoJson.put("sexo",super.getSexo());
        objetoJson.put("edad",getEdad());


        return  objetoJson;


    }
}
