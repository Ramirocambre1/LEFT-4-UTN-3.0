package Capitulos;

import Clases.Menu;
import Interfaces.Describir;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Capitulo1 extends Mapa implements Describir {//Capitulo 1  de la historia,que utilizas metodos
    //para desarrollar la historia

    public Capitulo1(String  nombre,String clima, String localizacion) {
        super(nombre,clima, localizacion);
    } //Constructor de la clase

    public Capitulo1()
    {
        super();
    }


    @Override
    public void describir() {//Implementacion de la interfaz que describe el comienzo del capitulo 1

        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println("-----------------------");
        System.out.println("Todo comienza en la ciudad de "+ getLocalizacion()+ " en la azotea de la Universidad" +
                " UTN. El" + " superviviente observa como un helicóptero de la prefectura se aleja sin " + "verlo,"+"La hora era:"+dateFormat.format(date)+" y el clima estaba "+getClima());
        System.out.println("-----------------------");

    }




    public int parte1()//Metodo que imprime las diferentes opciones de la parte1 del capitulo 1
    {
        System.out.println("-----------------------");
        System.out.println("Te encontras en la terraza,a la vista tenes una puerta,Que decision tomas?");
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

    public int parte2(int opcion)//Metodo que imprime las diferentes opciones de la parte2 del capitulo 1
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
                            "presencia y se acerca hacia vos,Que decision tomas?");
                    System.out.println("-----------------------");


                }


            }


        return flag;

    }


    public int parte3(){//Metodo que imprime las diferentes opciones de la parte3 del capitulo 1 y marca el final del
        // cap 1
        Menu menu= new Menu();
        System.out.println("-----------------------");
        System.out.println("Luego de matar al zombie, corres hacia las escaleras mas cercanas buscando la salida principal " +
                ". Ya estando en planta baja, escuchas a una mujer llorando.Que decision tomas?");
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
                    System.out.println("Decidiste acercarte a la mujer que esta llorando, apoyas tu mano en su hombro" +
                            " y ella se da vuelta, es " +
                            "un infectado mas.");

                    flag=1;
                }else if(opcion==2){
                    System.out.println("-----------------------");
                    System.out.println("Elegiste salir sigilosamente por la puerta principal, saltas el monolito y no sabes para donde ir, " +
                            "ves un graffiti en la pared que dice AYUDAMOS A LA GENTE EN PREFECTURA.");
                    System.out.println("");
                    System.out.println("|| Fin del capitulo ||");
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


    public String  correrMuerte()//Metodo que describe tu muerte en unas de las opcines del cap1
    {
        return "-----------------------\nDecidiste correr,Provando la atencion de mas zombies,no podes contra todos " +
                "vos solo," +
                " llevando a tu " +
                "muerte\n-----------------------";

    }

}
