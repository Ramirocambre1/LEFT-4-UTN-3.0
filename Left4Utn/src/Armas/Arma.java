package Armas;

import Interfaces.Json;
import org.json.JSONException;
import org.json.JSONObject;

public class Arma implements Json  {
    private String nombreArma;
    private int daño;
    private String tipo;

    public Arma(String nombreArma, int daño, String tipo) { //Constructor de la clase Arma
        this.nombreArma = nombreArma;
        this.daño = daño;
        this.tipo = tipo;
    }

    public Arma()
    {

    }

    @Override
    public String toString() { // Metodo to String,que muestra los atributos de la clase
        return
                "Arma:'" + nombreArma + '\'' +
                ", daño:" + daño +
                ", tipo:'" + tipo + '\'';
    }

    public int getDaño() {
        return daño;
    }//Retorna el atributo de daño

    public String getNombreArma() {
        return nombreArma;
    }//Retorna  el atributo de nombreArma

    public String getTipo() {
        return tipo;
    }//Retorna el atributo de tipo

    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }//Setea el atributo de las armas

    @Override
    public JSONObject getFormatoJson() throws JSONException { // Permite poner en formate json a los objetos de la
        // clase,retornando un objeto json para poder guardalo luego en un array

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("nombrearma",getNombreArma());
        jsonObject.put("daño",getDaño());
        jsonObject.put("tipo",getTipo());

        return jsonObject;



    }

    public void setDaño(int daño) {
        this.daño = daño;
    }//Setea el atributo de daño

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }//Setea el atributo de tipo
}
