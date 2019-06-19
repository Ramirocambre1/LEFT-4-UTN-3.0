package Capitulos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mapa {
    private String nombre;
    private String clima;

    private String localizacion;

    public Mapa(String clima, String localizacion) {
        this.clima = clima;
        this.localizacion = localizacion;
    }

    public String getClima() {
        return clima;
    }


    public String getLocalizacion() {
        return localizacion;
    }

    public void opcionesPrincipales()//Opciones principales cuando te encontras con un Zombie
    {
        System.out.println("1.Atacar");
        System.out.println("2.Correr");
        System.out.println("3.Consultar vida y Equipamiento");

    }

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
        else if(mapa.equals("mapa2"))
        {

        }
        else if(mapa.equals("mapa3"))
        {

        }
        else if( mapa.equals("mapa4"))
        {

        }

    }
}
