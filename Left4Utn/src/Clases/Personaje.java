package Clases;

import Armas.Arma;
import Exceptions.NoVidaException;

public class Personaje { //Clase personaje de las cuales extienden Superviviente y los diferentes Zombies
    private String nombre;
    private int salud;
    private String sexo;

    public Personaje(String nombre, int salud,String sexo) { //Consturctor de la clase
        this.nombre = nombre;
        this.salud = salud;
        this.sexo = sexo;
    }

    public Personaje()
    {

    }

    @Override
    public String toString() { //Metodo to string que imprime los atributos de la clase
        return
                "Nombre:" + nombre + '\'' +
                ", Salud:" + salud +
                ", Sexo:" + sexo + '\'';
    }

    public String getNombre() {
        return nombre;
    }//Te deuvelve el nombre del personaje

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Setea el nombre del atributo nombre

    public int getSalud()
    {
        return salud;
    }//Te retorna la salud del personaje

    public void setSexo(String sexo) {//Re retorna el sexo del personaje
        this.sexo = sexo;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }//Setea la salud del personaje

    public String consultarVida()//Se utiliza para consultar la vida del superviviente en el juego
    {
        int salud= 0;

            salud = this.getSalud();



        return "Tu salud actualmente es: "+salud;


    }

    public void restarVida(int vida)//Resta la vida de los personajes
    {


        this.salud=this.salud-vida;


    }

    public void resetearVida(int salud)//Resetea por completo la vida de un personaje
    {
        this.salud=salud;

    }

    public String getSexo() {
        return sexo;
    }//Te devuelve el sexo del personaje


}
