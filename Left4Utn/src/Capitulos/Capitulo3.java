package Capitulos;

import Interfaces.DescripcionNivel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Capitulo3 extends Mapa implements DescripcionNivel {
    public Capitulo3(String clima, String localizacion) {
        super(clima, localizacion);
    }
    public void describirNivel(){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println("-----------------------");
        System.out.println("-------Venciste al zombie encapuchado-------");
        System.out.println("Ya es de dia y la horda se ha ido. Hoy tenes que llegar a la base naval antes de la 1pm. cueste lo que cueste." +
                " Estas a contrareloj ya que estas a pie. Recordas que hay una estacion de servicios a la vuelta de la universidad, tal vez puede haber un vehiculo alli y podes cargarle gasolina" +
                " si es necesario. Unos minutos despues, al llegar a dicha estacion, encontras una moto intacta, en el suelo, la levantas y logras irte en dicho vehiculo.");
        System.out.println("-------CAPITULO 3--------");
        System.out.println("Encendiste la moto en la estacion de servicios a las "+dateFormat.format(date)+", con el ruido que provocaste, muchos zombies empezaron a seguirte, pero no podran alcanzarte" +
                "ya que vas mucho mas rapido que ellos. El camino esta dificil, esquivando zombies desde la moto, logras llegar a la entrada de "+getLocalizacion()+" ");
        System.out.println("-----------------------");

    }


}