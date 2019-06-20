package Ejecutable;

import Armas.*;
import Capitulos.Capitulo1;
import Capitulos.Capitulo2;
import Capitulos.Capitulo3;
import Clases.*;
import Capitulos.Mapa;
import Exceptions.NoVidaException;
import Zombies.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Juego
        Juego juego = new Juego("LEFT4UTN","Felipe Cilia - Ramiro Cambre");


        juego.jsonArrayToArrayListArmas();//Se lee el archivo de armas para pasarlos a la collecion de tipo ArrayList

        juego.jsonArrayToHashMapCapitulos();//Se lee el archivo de capitulos para pasarlo a la collecion de tipo hashmap

        juego.jsonArrayToHashMapZombies();//Se lee el archivo de zombies para pasarlo a la collecion de tipo hashmap




        int opcion1=0;


do {

   // Asignacion de los Zombies

    Zombie zombie0 = new Witch();
    Zombie zombie2 = new Charger();
    Zombie zombie3= new Tank();
    Zombie zombie4=new Hunter();
    Zombie zombie5=new ZombieNormal();

    zombie0=juego.retornarZombie("Witch");
    zombie2=juego.retornarZombie("Charger");
    zombie3=juego.retornarZombie("Tank");
    zombie4=juego.retornarZombie("Hunter");
    zombie5=juego.retornarZombie("Zombie generic 1");


    Witch witch1= new Witch(zombie0.getNombre(),zombie0.getSalud(),zombie0.getSexo(),zombie0.getEspecialidad());
    Charger charger1=new Charger(zombie2.getNombre(),zombie2.getSalud(),zombie2.getSexo(),
            zombie2.getEspecialidad());
    Tank tank1=new Tank(zombie3.getNombre(),zombie3.getSalud(),zombie3.getSexo(),zombie3.getEspecialidad());
    Hunter hunter1=new Hunter(zombie4.getNombre(),zombie4.getSalud(),zombie4.getSexo(),zombie4.getEspecialidad());
    ZombieNormal zombie1= new ZombieNormal(zombie5.getNombre(),zombie5.getSalud(),zombie5.getSexo(),
            zombie5.getEspecialidad());



// Asignacion de las Armas

        Arma tuberia = new Arma();
        Arma pistola1= new Arma();
        Arma escopeta1=new Arma();
        Arma rifleAsalto1=new Arma();
        Arma francotirador1=new Arma();
        Arma melee2=new Arma();

        francotirador1=juego.retonarArma("M40");
        rifleAsalto1=juego.retonarArma("M4A1");
        escopeta1=juego.retonarArma("Spas-12");
        pistola1=juego.retonarArma("Glock 18");
        tuberia=juego.retonarArma("Tuberia");
        melee2=juego.retonarArma("Hacha de bomberos");




//Asignacion de los capitulos

    Mapa capitulo1=new Capitulo1();
    Mapa capitulo2=new Capitulo2();
    Mapa capitulo3=new Capitulo3();

    capitulo1=juego.retornarCapitulo("La azotea");
    capitulo2=juego.retornarCapitulo("Señales de vida");
    capitulo3=juego.retornarCapitulo("El escape");

    Capitulo1 cap1= new Capitulo1(capitulo1.getNombre(),capitulo1.getClima(),capitulo1.getLocalizacion());
    Capitulo2 cap2=new Capitulo2(capitulo2.getNombre(),capitulo2.getClima(),capitulo2.getLocalizacion());
    Capitulo3 cap3=new Capitulo3(capitulo3.getNombre(),capitulo3.getClima(),capitulo3.getLocalizacion());

//Asignacion de los Zombies

Scanner scanf = new Scanner(System.in);



Superviviente jugador = new Superviviente("Jorge",100,tuberia,"M",20);


    int opcion2=0;
    Menu menu = new Menu();
    menu.menuPrincipal();
    menu.ingreseOpcion();
    opcion1=scanf.nextInt();
    jugador.resetearVida(100); //resetean la vida del jugador por si se vuelve a empezar
    zombie1.resetearVida(40);
    jugador.setArma(tuberia);
    //Variables flag
    int flag=0;
    int flag1=0;
    int flag2=0;

    //Variables de daño realizado;
    int dañoJugador=0;
    int dañoZombie=0;

    //Variables de opciones
    int opcionPrincipal=0;
    int opcionelegida2=2;
    int opcionelegida3=0;
    int opcionelegida4=0;
    int opcionelegida5=0;
    int opcionelegida6=0;
    int opcionelegida7=0;


        switch (opcion1)
        {
            case 1:
            {
                int opcionelegida=0;

                cap1.describir();
                opcionelegida=cap1.parte1();

                if (opcionelegida==1)
                {
                    System.out.println("-----------------------");
                    System.out.println("Abris la puerta,bajas las escaleras al piso inferior,al llegar tenes 3 pasillos distintos" +
                            " izquierda,medio,derecha.Te pones a pensar por que camino ir");
                    System.out.println("-----------------------");
    while (opcionelegida2==2 || opcionelegida2==3 )
    {

            System.out.println("1.Pasillo izquierdo");
            System.out.println("2.Seguir de frente");
            System.out.println("3.Pasillo derecho");

                menu.ingreseOpcion();
                opcionelegida2=scanf.nextInt();
                cap1.parte2(opcionelegida2);


        if (opcionelegida2==1)
        {
            while (jugador.getSalud()>0 && zombie1.getSalud()>0)
            {

                cap1.opcionesPrincipales();
                menu.ingreseOpcion();
                opcionPrincipal=scanf.nextInt();


                if (opcionPrincipal==1)
                {
                    dañoZombie=jugador.atacar();
                    dañoJugador=zombie1.atacar();
                    jugador.restarVida(dañoJugador);
                    zombie1.restarVida(dañoZombie);

                }
                else if (opcionPrincipal==2)
                {
                    try {
                        System.out.println(cap1.correrMuerte());
                        jugador.vidaCero();
                    } catch (NoVidaException e) {
                        e.printStackTrace();
                    }



                }
                else if (opcionPrincipal==3)
                {
                    System.out.println(jugador.consultarVida());
                    System.out.println(jugador.consultarArma());
                }
            }


                if (jugador.getSalud()>0)
                {
                    opcionelegida=cap1.parte3();

                    if (opcionelegida==1)
                    {
                        witch1.atacar();
                        try {
                            jugador.vidaCero();
                        } catch (NoVidaException e) {
                            e.printStackTrace();
                        }


                    }
                    else if(opcionelegida==2)
                    {
                        cap2.describir();
                        opcionelegida3=cap2.parte1();

                            if (opcionelegida3==1)
                            {

                                try {
                                    jugador.vidaCero();
                                } catch (NoVidaException e) {
                                    e.printStackTrace();
                                }


                            }

                            if (opcionelegida3==2)
                            {
                                while (jugador.getSalud()>0 && charger1.getSalud()>0)
                                {
                                    cap2.opcionesPrincipales();
                                    menu.ingreseOpcion();
                                    opcionPrincipal=scanf.nextInt();

                                    if (opcionPrincipal==1)
                                    {
                                        dañoZombie=jugador.atacar();
                                        dañoJugador=charger1.atacar();
                                        jugador.restarVida(dañoJugador);
                                        charger1.restarVida(dañoZombie);

                                    }

                                    else if (opcionPrincipal==2)
                                    {
                                        if(flag==0)
                                        {
                                            System.out.println("-----------------------");
                                            System.out.println("Decidiste correr, tomaste un camino incorrecto estas " +
                                                    "contra la pared,pero encontraste un kit de primeros auxilio,lo utilizas " +
                                                    "rapidamente y te recuperas completamente la vida,la unica posibilidad " +
                                                    "que te queda ahora es pelear por tu vida.");
                                            System.out.println("-----------------------");

                                            jugador.resetearVida(100);
                                            flag=1;
                                        }
                                        else
                                        {   System.out.println("-----------------------");
                                            System.out.println("Ya no podes correr mas tenes que pelear.");
                                            System.out.println("-----------------------");
                                        }
                                    }
                                    else if (opcionPrincipal==3)
                                    {
                                        System.out.println(jugador.consultarVida());
                                        System.out.println(jugador.consultarArma());
                                    }
                                }
                                if (jugador.getSalud()>0)
                                {
                                    opcionelegida4=cap2.parte2();

                                    if(opcionelegida4==1)
                                    {
                                        jugador.encontrarArma(rifleAsalto1);

                                    }
                                    else if (opcionelegida4==2)
                                    {
                                        jugador.encontrarArma(escopeta1);
                                    }
                                    else if (opcionelegida4==3)
                                    {
                                        jugador.encontrarArma(melee2);
                                    }

                                        opcionelegida5=cap2.parte3();

                                    if (opcionelegida5==1)
                                    {
                                        while (jugador.getSalud()>0 && hunter1.getSalud()>0)
                                        {
                                            cap2.opcionesPrincipales();
                                            menu.ingreseOpcion();
                                            opcionPrincipal=scanf.nextInt();

                                            if (opcionPrincipal==1)
                                            {
                                                dañoZombie=jugador.atacar();
                                                dañoJugador=hunter1.atacar();
                                                jugador.restarVida(dañoJugador);
                                                hunter1.restarVida(dañoZombie);

                                            }

                                            else if (opcionPrincipal==2)
                                            {
                                                    System.out.println("-----------------------");
                                                    System.out.println("Decidiste correr,pero no tenes alternativa  " +
                                                            "donde " +
                                                            "estas" +
                                                                    " es una habitacion cerrada,Te golpeas la cabeza" +
                                                            " " +
                                                                    "contra una estanteria perdiendo 2 de vida");
                                                    jugador.restarVida(2);
                                                    System.out.println("-----------------------");



                                            }
                                            else if (opcionPrincipal==3)
                                            {
                                                System.out.println(jugador.consultarVida());
                                                System.out.println(jugador.consultarArma());
                                            }
                                        }
                                            if (jugador.getSalud()>0)
                                            {
                                                cap2.parte4();

                                                jugador.resetearVida(100);

                                                cap3.describir();

                                                opcionelegida6=cap3.parte1();

                                                if(opcionelegida6==1)
                                                {
                                                    opcionelegida7=cap3.parte2();

                                                    if (opcionelegida7==1)
                                                    {

                                                        try {
                                                            jugador.vidaCero();
                                                        } catch (NoVidaException e) {
                                                            e.printStackTrace();
                                                        }


                                                    }
                                                    else if (opcionelegida7==2)
                                                    {
                                                        jugador.encontrarArma(francotirador1);
                                                        System.out.println("Conseguiste un Rifle Francotirador");
                                                        System.out.println("-----------------------");
                                                        cap3.parte3();

                                                        while (jugador.getSalud()>0 && tank1.getSalud()>0)
                                                        {

                                                            cap2.opcionesPrincipales();
                                                            menu.ingreseOpcion();
                                                            opcionPrincipal=scanf.nextInt();

                                                            if (opcionPrincipal==1)
                                                            {
                                                                dañoZombie=jugador.atacar();
                                                                dañoJugador=tank1.atacar();
                                                                jugador.restarVida(dañoJugador);
                                                                tank1.restarVida(dañoZombie);

                                                            }

                                                            else if (opcionPrincipal==2)
                                                            {
                                                                System.out.println("-----------------------");
                                                                System.out.println("No podes correr,lo unico que " +
                                                                        "podes hacer es pelear por tu vida!");;
                                                                System.out.println("-----------------------");

                                                            }
                                                            else if (opcionPrincipal==3)
                                                            {
                                                                System.out.println(jugador.consultarVida());
                                                                System.out.println(jugador.consultarArma());
                                                            }



                                                        }

                                                        if (jugador.getSalud()>0)
                                                        {

                                                            cap3.parteFinal();



                                                        }
                                                        else
                                                        {
                                                            try {
                                                                jugador.vidaCero();
                                                            } catch (NoVidaException e) {
                                                                e.printStackTrace();
                                                            }


                                                        }



                                                    }
                                                    else if (opcionelegida7==3)
                                                    {
                                                        cap3.parte3();

                                                        while (jugador.getSalud()>0 && tank1.getSalud()>0)
                                                        {

                                                            cap3.opcionesPrincipales();
                                                            menu.ingreseOpcion();
                                                            opcionPrincipal=scanf.nextInt();

                                                            if (opcionPrincipal==1)
                                                            {
                                                                dañoZombie=jugador.atacar();
                                                                dañoJugador=tank1.atacar();
                                                                jugador.restarVida(dañoJugador);
                                                                tank1.restarVida(dañoZombie);

                                                            }

                                                            else if (opcionPrincipal==2)
                                                            {
                                                                System.out.println("-----------------------");
                                                                System.out.println("No podes correr,lo unico que " +
                                                                        "podes hacer es pelear por tu vida!");;
                                                                System.out.println("-----------------------");

                                                            }
                                                            else if (opcionPrincipal==3)
                                                            {
                                                                System.out.println(jugador.consultarVida());
                                                                System.out.println(jugador.consultarArma());
                                                            }



                                                        }


                                                        if (jugador.getSalud()>0)
                                                        {

                                                            cap3.parteFinal();


                                                        }
                                                        else
                                                        {
                                                            try {
                                                                jugador.vidaCero();
                                                            } catch (NoVidaException e) {
                                                                e.printStackTrace();
                                                            }


                                                        }



                                                    }



                                                }
                                                else if(opcionelegida6==2)
                                                {
                                                    try {
                                                        jugador.vidaCero();
                                                    } catch (NoVidaException e) {
                                                        e.printStackTrace();
                                                    }
                                                }

                                            }
                                            else
                                            {
                                                try {
                                                    jugador.vidaCero();
                                                } catch (NoVidaException e) {
                                                    e.printStackTrace();
                                                }

                                            }



                                    }

                                    else if (opcionelegida5==2)
                                    {
                                        try {
                                            jugador.vidaCero();
                                        } catch (NoVidaException e) {
                                            e.printStackTrace();
                                        }
                                    }




                                }
                            }
                    }
                }
                else
                {
                    try {
                        jugador.vidaCero();
                    } catch (NoVidaException e) {
                        e.printStackTrace();
                    }

                }
            }


        else if(flag1==0 && opcionelegida2==2)
        {
          if (opcionelegida2==2)
          {
              System.out.println("-----------------------");
              System.out.println("Decidiste ir por el pasillo del medio,te encuentras con unos de tus compañeros de " +
                      "la universidad,le preguntas que esta pasando pero el tampoco sabe nada.Tiene demasiado miedo " +
                      "para continuar asi que vuelves hacia atras.");
              System.out.println("-----------------------");
              flag1=1;
          }

        }
        else if (opcionelegida2==2)
        {
            System.out.println("-----------------------");
            System.out.println("Te arrepentiste de no preguntarle si queria ir contigo,pero cuando te diste la vuelta" +
                            " ya no estaba mas");
            System.out.println("-----------------------");


        }
        else if(flag2==0 && opcionelegida2==3)
        {
            if (opcionelegida2==3)
            {
                System.out.println("-----------------------");
                System.out.println("Decidiste ir por el pasillo de la derecha,el cual da a los baños,Con valentia " +
                        "entras para ver " +
                        "si hay" +
                        " alguien vivo,esta vacio pero antes de darte la vuelta en el piso encontras un pistola y la " +
                        "agarras.");

                System.out.println("Conseguiste una nueva arma---> 'Glock 18' ");
                System.out.println("-----------------------");
                jugador.encontrarArma(pistola1);
                flag2=1;
            }



        }
        else if (opcionelegida2==3)
        {
            System.out.println("-----------------------");
            System.out.println("Volviste al baño,pero ya no encontraste nada de utilidad te das la vuelta");
            System.out.println("-----------------------");

        }

}
        }
                else if(opcionelegida==2)
                {
                    try {
                        jugador.vidaCero();
                    } catch (NoVidaException e) {
                        e.printStackTrace();
                    }


                }
                break;
            }

            case 2:
            {
                do {
                menu.menuExtras();
                menu.ingreseOpcion();
                opcion2=scanf.nextInt();
                switch (opcion2)
                {
                    case 1:
                        System.out.println("----ZOMBIES----");
                        juego.listarZombie();
                        break;
                    case 2:
                        System.out.println("----CAPITULOS----");
                        juego.listarCapitulos();
                        break;
                    case 3:
                        System.out.println("----ARMAS----");
                        juego.listarArmas();
                        break;
                }

                 } while (opcion2!=4);
                break;
}
            case 3:
            {
                 menu.creditos();
                break;
            }

        }
}while (opcion1!=4);




}

}

