package Clases;

import Armas.Arma;

public class Personaje {
    private String nombre;
    private int salud;
    private String sexo;

    public Personaje(String nombre, int salud,String sexo) {
        this.nombre = nombre;
        this.salud = salud;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return
                "Nombre:" + nombre + '\'' +
                ", Salud:" + salud +
                ", Sexo:" + sexo + '\'';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String consultarVida()
    {
        int salud=this.getSalud();

        return "Tu salud actualmente es: "+salud;


    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void restarVida(int vida)
    {


        this.salud=this.salud-vida;


    }

    public void resetearVida(int salud)
    {
        this.salud=salud;

    }




    public void  vidaCero()
    {
        this.setSalud(0);
    }
}
