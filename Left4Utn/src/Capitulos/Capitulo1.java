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
        System.out.println(" Todo comienza en la ciudad de "+ getLocalizacion()+ " en la azotea de la Universidad" +
                " UTN. El" + " superviviente observa como un helicóptero de la prefectura se aleja sin " + "verlo,"+"La hora era:"+dateFormat.format(date)+" y el clima estaba "+getClima());

    }


    public void opcionesPrincipales()//Opciones principales cuando te encontras con un Zombie
    {
        System.out.println("1.Atacar");
        System.out.println("2.Correr");
        System.out.println("3.Consultar vida");
        System.out.println("4.Volver hacia atras");
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

    public int parte2()
    {
        Scanner scanf= new Scanner(System.in);
        int opcion=0;
        int flag=0;

        Menu menu= new Menu();
        System.out.println("Abris la puerta,bajas las escaleras al piso inferior,al llegar tenes 3 pasillos distintos" +
                "izquierda,medio,derecha.Te pones a pensar por que camino ir");
        menu.ingreseOpcion();

      while (flag==0)
      {
          System.out.println("1.Pasillo izquierdo");
          System.out.println("2.Seguir de frente");
          System.out.println("3.Pasillo derecho");
          opcion=scanf.nextInt();

        if (opcion>0 && opcion<4)
      {
          if (opcion==1)
          {
              System.out.println("Decidis ir por el pasillo de la izquierda te encontras con un zombie,detecta tu " +
                      "presencia y se acerca hacia,que decision tomar");
              opcionesPrincipales();
              flag=1;
          }
          else if (opcion==2)
          {
              flag=1;
          }
          else if(opcion==3)
          {
              flag=1;

          }

      }
      else
      {
          System.out.println("Esa opcion no existe!!!,ingrese nuevamente");

      }
      }


        return opcion;

    }

}
