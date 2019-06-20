package Capitulos;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mapa { //Clase padre de las cuales extienden los diferentes capitulos que tiene la historia
    private String nombre;
    private String clima;

    private String localizacion;

    public Mapa(String nombre,String clima, String localizacion) {
        this.nombre=nombre;
        this.clima = clima;
        this.localizacion = localizacion;
    }

    public Mapa()
    {

    }

    public String getClima() {
        return clima;
    }


    public String getLocalizacion() {
        return localizacion;
    }

    public void opcionesPrincipales()//Opciones principales cuando te encontras con un Zombie y debes pelear
    {
        System.out.println("1.Atacar");
        System.out.println("2.Correr");
        System.out.println("3.Consultar vida y Equipamiento");

    }
/*
    public void describir(String mapa) {

        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();


        if (mapa.equals("mapa1"))
            {
            System.out.println(" Todo comienza en la ciudad de "+ getLocalizacion()+ " en la azotea de la Universidad" +
                    " UTN. El" +
                    "supervivientes observa impotentes como un helicóptero de la prefectura se aleja sin " +
                    "verlo,"+"La hora era:"+dateFormat.format(date)+" y el clima estaba "+getClima());

        }


    }
    */

    public String getNombre() {
        return nombre;
    } // Metodo que te devuelve el nombre del capitulo

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Metodo que setea el nombre del capitulo

    public void setClima(String clima) {
        this.clima = clima;
    }//Metodo que setea el clima del capitulo.

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }//Metodo que sea la localizacion del capitulo

    public JSONObject getFormatoJson() throws JSONException// Permite poner en formate json a los objetos de la
    // clase,retornando un objeto json para poder guardalo luego en un array
    {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("nombre",getNombre());
        jsonObject.put("clima",getClima());
        jsonObject.put("localizacion",getLocalizacion());


        return jsonObject;

    }

    @Override
    public String toString() { // Metodo to string que imprime los atributos de un objeto de la clase
        return "" +
                "Nombre:'" + nombre + '\'' +
                ", Clima:'" + clima + '\'' +
                ", Localizacion:'" + localizacion + '\'';
    }
}
