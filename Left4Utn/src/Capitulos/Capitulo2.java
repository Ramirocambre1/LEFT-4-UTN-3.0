package Capitulos;

import Clases.Menu;
import Interfaces.Describir;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Capitulo2 extends Mapa implements Describir {//Capitulo 2  de la historia,que utiliza metodos para
    // desarrollar la historia
    public Capitulo2(String nombre,String clima, String localizacion) {
        super(nombre,clima, localizacion);
    }// Constructor de la clase

    public Capitulo2()
    {
        super();
    }

    public void describir(){//Implementacion de la interfaz en la clase que describe el comienzo del capitulo 2
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println("-----------------------");
        System.out.println("-------Lograste escapar de la UTN-------");
        System.out.println("-------CAPITULO 2--------");
        System.out.println("No entendes lo que esta pasando, llegas al  "+getLocalizacion() +" a" +
                " " +
                "las "+dateFormat.format(date)+". Al parecer, no quedo " +
                "nadie vivo, recordas que viste como se fue el helicoptero y te das cuenta que tal vez ese fue el " +
                "ultimo rescate.\nDesesperado unos gritos lejanos llaman tu atencion , por la avenida de los " +
                "Pescadores, " +
                "empezas a observar cientos de siluetas a lo lejos viniendo hacia vos,al tiempo que se van acercando " +
                "te das cuenta que no ya no son mas humanos sino" +
                "  es una horda de " +
                "zombies .\nLo primero que se te " +
                "ocurre es intentar esconderse dentro del edificio, " +
                "saltas una barrera de palos y alambres para entrar al edificio, la puerta se encontraba abierta.");


    }

    public int parte1(){//Metodo que imprime las diferentes opciones de la parte1 del capitulo 2
        System.out.println("-----------------------");
        System.out.println("Al entrar al edificio de la prefectura,lo unico que ves son cuerpos sin vida,gritas para " +
                "ver si queda alguien vivo,empezas a escuchar a alguien corriendo hacia vos,levantas tu " +
                "mirada y ves un infectado deforme con  brazo gigante ,Que decision tomas?");
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

    public int parte2(){ //Metodo que imprime las diferentes opciones de la parte2 del capitulo 2
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

    public int parte3(){ //Metodo que imprime las diferentes opciones de la parte3 del capitulo 2
        System.out.println("-----------------------");
        System.out.println("Logras comunicarte con la persona del walkie talkie, y te avisa que al dia siguiente  a " +
                "las 13:30 pm" +
                "  desde" +
                " la base naval, zarparan submarinos en busca de nuevas tierras sin infectados." +
                "\nTe avisa que no pueden mandarte ayuda,que tendras que ir solo a la base.Unicamente te ayudaran si " +
                "llegas hasta alli. Perplejo por lo que te dijo " +
                ",pateas la puerta por donde entraste .\nPor el ruido provocado, entra a tu habitacion" +
                " un infectado con capucha, corriendo y saltando velozmente. Que decision tomas?");
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
                    System.out.println("Decidis enfrentarte al encapuchado, el salta sobre tu cuerpo, te rasguña " +
                            "pero no lo suficiente ya que utilizas tu arma para empujarlo. Preparate para luchar.");
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

    public void parte4()//Metodo que muestra el final del capitulo 2
    {
        System.out.println("Cansado por la batalla con el infectado y ya con el dia anocheciendo decidis descansar " +
                        "para recuperar tus fuerzas y prepararte para emprender tu camino mañana " +
                "hacia la base naval");
                System.out.println("-----------------------");

        System.out.println("");
        System.out.println("|| Fin del capitulo ||");
        System.out.println("");

    }
}