package Capitulos;

import Clases.Menu;
import Interfaces.DescripcionNivel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Capitulo3 extends Mapa implements DescripcionNivel {
    public Capitulo3(String clima, String localizacion) {
        super(clima, localizacion);
    }
    public void describirNivel(){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println("Te despertas por un rayo de luz que entra por una de las ventanas del edificio,ya es de " +
                "dia,miras un reloj que se encuentra" +
                " " +
                "colgado en la pared,marca las " +
                "12:45 pm,decidis salir del edificio para ver la situacion en que te encontras, la horda ya no estaba" +
                " " +
                "mas." +
                "\nHoy" +
                " tenes que llegar a la base naval antes de la" +
                " " +
                "1:30 pm. cueste" +
                " lo que cueste." +
                " Estas a contrareloj ya que estas a pie. Recordas que hay una estacion de servicios a la vuelta de " +
                "la universidad, tal vez pueda haber un vehiculo que todavia funcione" +
                ".\nUnos minutos despues, al llegar a dicha estacion, encontras una moto intacta, en " +
                "el suelo, la levantas y la encendes,era tu dia de suerte,enciendo perfectamente..");


        System.out.println("-------CAPITULO 3--------");
        System.out.println("Encendiste la moto en la estacion de servicios a lo que  con el ruido que provocaste, " +
                "muchos" +
                " zombies empezaron a seguirte, formando una horda gigante siguiendote,\npero no pueden alcanzarte" +
                "ya que vas mucho mas rapido que ellos. El camino esta dificil, esquivando zombies desde la moto, " +
                "logras llegar a la entrada de la " +getLocalizacion()+" ");
        System.out.println("-----------------------");

    }

    public int parte1(){
        System.out.println("-----------------------");
        System.out.println("Al llegar, todavia estando en la moto, te encontras con un porton enorme y una barricada  para que los zombies no pasen. " +
                "\nCon el ruido de la moto, atrajiste la atencion de varios infectados que se encontraban en la zona," +
                " empiezan a acercarse a vos lentamente, casi rodeandote. Que haces?" );
        System.out.println("-----------------------");
        System.out.println("1.Bajar de la moto y golpear la puerta para ver si te abren.");
        System.out.println("2.Acelerar con la moto e intentar escapar.");

        Scanner scanf= new Scanner(System.in);
        int opcion=0;
        Menu menu= new Menu();
        int flag=0;

        while (flag==0 || flag==2)
        {
            menu.ingreseOpcion();
            opcion=scanf.nextInt();

            if(opcion>0 && opcion<3)
            {
                if (opcion==1)
                {
                    System.out.println("-----------------------");
                    System.out.println("Al bajar de la moto, empezas a gritar y golpear fuertemente el porton,Te " +
                            "defendes con tu arma hasta que " +
                            "un soldado te escucha, entonces abre el porton y te deja pasar.");
                    flag=1;
                }
                else
                {    System.out.println("-----------------------");
                    System.out.println("Aceleras con la moto y te escapas, pero hay un problema,te fijas el medidor " +
                            "de combustible y quedaba menos de 1/4 de tanque" +
                            ". Por lo tanto decidis ir en busca de un nuevo vehiculo, " +
                            "llegando al McDonalds de playa grande, te encontras con una horda de zombies yendo hacia tu lado, decidis ir para atras y resulta que los infectados que escucharon la moto" +
                            " vienen por ese camino. Te encontras rodeado completamente, te quedaste justo sin gasolina, bajas de la moto a defenderte con lo que tengas y moris de pie.");
                    System.out.println("-----------------------");
                    flag=1;
                }
            }
            else
            {
                System.out.println("Esa opcion no existe!!!. Ingrese nuevamente");
                flag=2;
            }
        }
        return opcion;
    }
    public int parte2(){ //
        System.out.println("-----------------------");
        System.out.println(" El militar esta cerrando el porton pesado lo mas rapido que puede, pero un zombie salta sobre su cabeza. Que haces? ");
        System.out.println("-----------------------");
        System.out.println("1.La situacion te supera y decidis quedarte sin hacer nada");
        System.out.println("2.Ayudas al militar a liberarse del zombie.");
        System.out.println("3.Corres en busca de los submarinos");

        Scanner scanf= new Scanner(System.in);
        int opcion=0;
        Menu menu= new Menu();
        int flag=0;

        while (flag==0 || flag==2)
        {
            menu.ingreseOpcion();
            opcion=scanf.nextInt();

            if(opcion>0 && opcion<4)
            {
                if (opcion==1)
                {
                    System.out.println("-----------------------");
                    System.out.println("Abrumado por lo que estaba pasando adelante tuyo te diste por vencido," +
                            "sabiendo que tu muerte se avecinaba en segundos" +
                            ".");
                    //MUERTE
                    flag=1;

                }
                else if (opcion==2)
                {    System.out.println("-----------------------");
                    System.out.println("Empujas al zombie que esta por encima de el y lo matas con tu arma, le das una mano al militar para levantarse y terminan de cerrar" +
                            " el porton entre los dos.\nMientras te agradece, el porton comienza a tambalearse, los " +
                            "zombies se estan atropellando para poder pasar." +
                            " El militar,te alcanza un rifle francotirador como agradecimiento por haberlo salvado," +
                            "\nLuego rapidamente" +
                            "por el walkie talkie" +
                            " da la orden de que vayan " +
                            "todos" +
                            " a los submarinos" +
                            " que" +
                            " ya es hora de partir. ");
                    flag=1;
                }
                else if (opcion==3)
                {

                    System.out.println("-----------------------");
                    System.out.println("Decidiste no arriesgarte,y dejaste al soldado a su suerte,corres por la base " +
                            "guiandote por los carteles que te indican hacia donde esta el refugio de submarinos");

                }
            }
            else
            {
                System.out.println("Esa opcion no existe!!!. Ingrese nuevamente");
                flag=2;
            }
        }
        return opcion;
    }

    public int parte3(){ //escape en submarino?

        


    }


}