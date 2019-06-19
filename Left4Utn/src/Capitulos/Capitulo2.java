package Capitulos;

import Clases.Menu;
import Interfaces.DescripcionNivel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Capitulo2 extends Mapa implements DescripcionNivel {
    public Capitulo2(String clima, String localizacion) {
        super(clima, localizacion);
    }

    public void describirNivel(){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println("-----------------------");
        System.out.println("-------Lograste escapar de la UTN-------");
        System.out.println("-------CAPITULO 2--------");
        System.out.println("No entendes lo que esta pasando, llegas al edificio "+getLocalizacion() +" principal de " +
                "la prefectura a" +
                " " +
                "las "+dateFormat.format(date)+". Al parecer, no quedo " +
                "nadie vivo, recordas que viste como se fue el helicoptero y te das cuenta que tal vez ese fue el " +
                "ultimo rescate.\nDesesperado, por la avenida de los Pescadores, " +
                "empezas a escuchar mucho ruido, miras y es una horda de zombies acercandose.\nLo primero que se te " +
                "ocurre es intentar esconderse dentro del edificio, " +
                "esquivas una fortaleza de palos y alambres para entrar al edificio, la puerta estaba abierta.");
        System.out.println("-----------------------");

    }

    public int parte1(){
        System.out.println("-----------------------");
        System.out.println("Al entrar al edificio de la prefectura,lo unico que ves son cuerpos sin vida,gritas para " +
                "ver si queda alguien vivo,empezas a escuchar a alguien corriendo hacia vos,levantas tu " +
                "mirada y ves un infectado deforme con  brazo gigante ,que decidis hacer");
        System.out.println("-----------------------");
        System.out.println("1.Intentar esquivarlo");
        System.out.println("2.Atacarlo");

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
                    System.out.println("Al intentar esquivarlo,te tropesas con los cuerpos desparramados por el " +
                            "suelo," +
                            "el infectado te golpea tan fuerte que te deja knock out");

                    flag=1;


                }
                else
                {    System.out.println("-----------------------");
                    System.out.println("Atacaste al infectado dañandole su pierna,eso parece que lo hizo enojar mas," +
                            "preparate para pelear");
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

    public int parte2(){ //radio en armeria
        System.out.println("-----------------------");
        System.out.println("Luego de matar al infectado, miras por la ventana y la horda sigue estando en la avenida," +
                " decidis esperar hasta que pasen todos.\nVes una silla para descanzar,te acomodas y al instante " +
                "te quedas dormido por un buen rato.\nTe despertas porque escuchaste una voz emitida desde un walkie " +
                "talkie, vas corriendo hacia esa habitacion y resulta ser que " +
                "es una armeria. Que arma te gustaria elegir?");
        System.out.println("-----------------------");
        System.out.println("1. Fusil de asalto.");
        System.out.println("2. Escopeta.");
        System.out.println("3. Hacha.");
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
                    System.out.println("Agarraste el fusil de asalto.");
                    flag=1;

                }
                else if (opcion==2)
                {    System.out.println("-----------------------");
                    System.out.println("Agarraste la escopeta.");
                    flag=1;
                }
                else if(opcion==3)
                {
                    System.out.println("------------------------");
                    System.out.println("Agarraste el hacha");
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

    public int parte3(){ //escape
        System.out.println("-----------------------");
        System.out.println("Logras comunicarte con la persona del walkie talkie, y te avisan que en unas horas, desde" +
                " la base naval, zarpan submarinos en busca de nuevas tierras no infectadas." +
                "\nTambien te dicen que no pueden pasarte a buscar, que solo te ayudaran si llegas hasta alli. Te " +
                "enojas, pateas una mesa y se desarma.\nPor el ruido provocado, entra a tu habitacion" +
                "un infectado con capucha, corriendo y saltando velozmente. Que haces?");
        System.out.println("-----------------------");
        System.out.println("1. Usas tu arma para defenderte");
        System.out.println("2. Lo esquivas y salis corriendo"); //muerte

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
             {      System.out.println("-----------------------");
                    System.out.println("Decidis enfrentarte al zombie, el salta sobre tu cuerpo, te rasguña pero no lo suficiente ya que utilizas tu arma para empujarlo. Preparate para luchar.");
                 System.out.println("-----------------------");
                     flag=1;
             }
               else if (opcion==2)
                {
                    System.out.println("-----------------------");
                    System.out.println("Logras salir por la puerta corriendo, pero este zombie salta desde lejos, te " +
                            "impacta en la espalda tirandote al suelo y con sus garras,no tenes escapatoria");
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
}