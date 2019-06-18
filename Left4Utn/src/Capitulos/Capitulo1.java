package Capitulos;

import Clases.Menu;
import Interfaces.DescripcionNivel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Capitulo1 extends Mapa implements DescripcionNivel {

    public Capitulo1(String clima, String localizacion) {
        super(clima, localizacion);
    }


    @Override
    public void describirNivel() {

        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println("-----------------------");
        System.out.println("Todo comienza en la ciudad de "+ getLocalizacion()+ " en la azotea de la Universidad" +
                " UTN. El" + " superviviente observa como un helicóptero de la prefectura se aleja sin " + "verlo,"+"La hora era:"+dateFormat.format(date)+" y el clima estaba "+getClima());
        System.out.println("-----------------------");

    }


    public void opcionesPrincipales()//Opciones principales cuando te encontras con un Zombie
    {
        System.out.println("1.Atacar");
        System.out.println("2.Correr");
        System.out.println("3.Consultar vida y Equipamiento");

    }

    public int parte1()
    {
        System.out.println("Te encontras en la terraza,a la vista tenes una puerta,que decision tomas?");
        System.out.println("1.Caminar hacia la puerta");
        System.out.println("2.Asomarte por la corniza para ver hacia abajo");
        Scanner scanf= new Scanner(System.in);
        int opcion=0;
        Menu menu= new Menu();
        menu.ingreseOpcion();

        opcion=scanf.nextInt();



        if (opcion==1)
        {
            System.out.println("De camino a la puerta te encontras una tuberia rota y la agarras como arma para " +
                    "defenderte");



        }
        else
        {
            System.out.println("Te asomas por la corniza al ver miles de zombies te asustas,resbalandote por el suelo" +
                    "  humedo a causa de la lluvia" +
                    " asi cayendote " +
                    "hacia adelante,perdiendo tu vida");
        }

        return opcion;
    }

    public void parte2(int opcion)
    {

        int flag=0;

        Menu menu= new Menu();


      while (flag==0)
      {


        if (opcion>0 && opcion<4)
      {
          if (opcion==1)
          {
              System.out.println("Decidiste ir por el pasillo de la izquierda te encontras con un zombie en el medio " +
                      "del pasillo" +
                      ",detecta tu " +
                      "presencia y se acerca hacia vos,que decision elegis?");

              flag=1;
          }
          else if (opcion==2)
          {
              System.out.println("Decidiste ir por el pasillo del medio,te encuentras con unos de tus compañeros de " +
                      "la universidad,le preguntas que esta pasando pero el tampoco sabe nada.Tiene demasiado miedo " +
                      "para continuar asi que vuelves hacia atras.");

              flag=1;
          }
          else if(opcion==3)
          {
              System.out.println("Decidiste ir por el pasillo de la derecha,el cual da a los baños,Con valentia " +
                      "entras para ver " +
                      "si hay" +
                      " alguien vivo,esta vacio pero antes de darte la vuelta en el piso encontras un pistola y la " +
                      "agarras.");

              System.out.println("Conseguiste una nueva arma---> 'Glock 18' ");

              flag=1;

          }

      }
      else
      {
          System.out.println("Esa opcion no existe!!!,ingrese nuevamente");

      }
      }



    }

    public String  correrMuerte()
    {
        return "Decidiste correr,llamando la atencion de mas zombies llevando a tu muerte";

    }

}
