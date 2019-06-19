package Ejecutable;

import Armas.Escopeta;
import Armas.Melee;
import Armas.Pistola;
import Armas.RifleAsalto;
import Capitulos.Capitulo1;
import Capitulos.Capitulo2;
import Capitulos.Capitulo3;
import Clases.Juego;
import Clases.ListaGenerica;
import Capitulos.Mapa;
import Clases.Menu;
import Clases.Superviviente;
import Exceptions.NoVidaException;
import Zombies.Charger;
import Zombies.Hunter;
import Zombies.Witch;
import Zombies.ZombieNormal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Juego
        Juego juego = new Juego("LEFT4UTN","Felipe Cilia - Ramiro Cambre");

        //Zombies
        Witch witch1 = new Witch("Witch",10,"F","Witch");
        Charger charger1=new Charger("Charger",60,"Masculino","Charger");
        ZombieNormal zombie1 = new ZombieNormal("Zombie generic 1",40,"M","Ninguna es inutil");
        Hunter hunter1=new Hunter("Hunter",120,"Masculino","Hunter");

        //Armas
        Melee tuberia = new Melee("Tuberia",10,"Melee");
        Pistola pistola1 = new Pistola("Glock 18",25,"Pistola");
        RifleAsalto rifleAsalto1=new RifleAsalto("M4A1",40,"Rifle de Asalto");
        Escopeta escopeta1 = new Escopeta("Spas-12",38,"Escopeta");
        Melee melee2=new Melee("Hacha de bomberos",35,"Melee");

        //Jugador
        Superviviente jugador = new Superviviente("Jorge",100,tuberia,"M",20);


        juego.agregarZombie(witch1);
        juego.agregarZombie(zombie1);

        Capitulo1 cap1 = new Capitulo1("Lluvioso","Mar del Plata");
        Capitulo2 cap2 = new Capitulo2("Nublado","Edificio de prefectura");
        Capitulo3 cap3 = new Capitulo3("Soleado","Base Naval");

        ListaGenerica listaArmas = new ListaGenerica();
        listaArmas.agregarElementos(escopeta1);
        listaArmas.agregarElementos(pistola1);




        Scanner scanf = new Scanner(System.in);

        //Variables opciones
        int opcion1=0;

        //Variables de daño realizado;
        int dañoJugador=0;
        int dañoZombie=0;
        //Variables flag
        int flag=0;
        int flag1=0;
        int flag2=0;


do {

    int opcion2=0;
    Menu menu = new Menu();
    menu.menuPrincipal();
    menu.ingreseOpcion();
    opcion1=scanf.nextInt();
    jugador.resetearVida(100);
    zombie1.resetearVida(40);
    int opcionPrincipal=0;
    int opcionelegida2=2;
    int opcionelegida3=0;
    int opcionelegida4=0;
    int opcionelegida5=0;


        switch (opcion1)
        {
            case 1:
            {
                int opcionelegida=0;

                cap1.describirNivel();
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
                    System.out.println(cap1.correrMuerte());
                    try {
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


                if (jugador.getSalud()>=0)
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
                        cap2.describirNivel();
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

                                                cap3.describirNivel();





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
                        juego.listarZombie();
                        break;
                    case 2:
                        //Mostrar mapas
                        break;
                    case 3:
                        listaArmas.listarElementos();
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

