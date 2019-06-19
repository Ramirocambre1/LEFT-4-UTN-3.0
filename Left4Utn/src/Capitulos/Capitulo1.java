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




    public int parte1()
    {
        System.out.println("-----------------------");
        System.out.println("Te encontras en la terraza,a la vista tenes una puerta,que decision tomas?");
        System.out.println("-----------------------");
        System.out.println("1.Caminar hacia la puerta");
        System.out.println("2.Asomarte por la corniza para ver hacia abajo");
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
                    System.out.println("De camino a la puerta te encontras una tuberia rota y la agarras como arma para " +
                            "defenderte");
                    System.out.println("-----------------------");
                    flag=1;


                }
                else
                {    System.out.println("-----------------------");
                    System.out.println("Te asomas por la corniza al ver miles de zombies te asustas,resbalandote por el suelo" +
                            "  humedo a causa de la lluvia" +
                            " asi cayendote " +
                            "hacia adelante,perdiendo tu vida");
                    System.out.println("-----------------------");
                    flag=1;
                }
            }
            else
            {

                System.out.println("Esa opcion no existe!!!,ingrese nuevamente");
                flag=2;

            }


    }
        return opcion;
    }

    public int parte2(int opcion)
    {
        int flag=0;
        int flag2=0;
        Menu menu= new Menu();
        Scanner scanf= new Scanner(System.in);


            if (opcion>0 && opcion<4)
            {
                if (opcion==1)
                {
                    System.out.println("-----------------------");
                    System.out.println("Decidiste ir por el pasillo de la izquierda te encontras con un zombie en el medio " +
                            "del pasillo" +
                            ",detecta tu " +
                            "presencia y se acerca hacia vos,que decision elegis?");
                    System.out.println("-----------------------");


                }


            }


        return flag;

    }


    public int parte3(){
        Menu menu= new Menu();
        System.out.println("-----------------------");
        System.out.println("Luego de matar al zombie, corres hacia las escaleras mas cercanas buscando la salida principal " +
                ". Ya estando en planta baja, escuchas a una mujer llorando.Que decidis hacer?");
        System.out.println("-----------------------");
        System.out.println("1. Te acercas para averiguar lo que esta pasando.");
        System.out.println("2. Sigilosamente, vas hacia la salida");

        Scanner scanf= new Scanner(System.in);
        int opcion=0;
        int flag=0;

        while(flag==0 || flag==2){

            menu.ingreseOpcion();
            opcion=scanf.nextInt();

            if(opcion>0 && opcion<3){


                if (opcion==1){
                    System.out.println("-----------------------");
                    System.out.println("Decidiste acercarte a la mujer que esta llorando, apoyas tu mano en su hombro y ella se da vuelta, es" +
                            "un infectado mas.");

                    flag=1;
                }else if(opcion==2){
                    System.out.println("-----------------------");
                    System.out.println("Elegiste salir sigilosamente por la puerta principal, saltas el monolito y no sabes para donde ir, " +
                            "ves un graffiti en la pared que dice AYUDAMOS A LA GENTE EN PREFECTURA.");
                    System.out.println("-----------------------");
                    System.out.println("");
                    System.out.println("-----------Fin del capitulo-----------");
                    System.out.println("");
                    flag=1;
                }

            }else{
                System.out.println("Esta opcion no existe!!!. Ingrese nuevamente");
                flag=2;
            }
        }
        return opcion;
    }


    public String  correrMuerte()
    {
        return "Decidiste correr,llamando la atencion de mas zombies llevando a tu muerte";

    }

}
