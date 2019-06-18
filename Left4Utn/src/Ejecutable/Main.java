package Ejecutable;

import Armas.Escopeta;
import Armas.Melee;
import Armas.Pistola;
import Capitulos.Capitulo1;
import Clases.Juego;
import Clases.ListaGenerica;
import Capitulos.Mapa;
import Clases.Menu;
import Clases.Superviviente;
import Zombies.Witch;
import Zombies.ZombieNormal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Juego juego = new Juego("LEFT4UTN","Felipe Cilia - Ramiro Cambre");
        Witch witch1 = new Witch("Witch",10,"F","llora como una hdp");
        Melee tuberia = new Melee("Tuberia",10,"Melee");
        Pistola pistola1 = new Pistola("Glock 17",25,"Pistola");
        ZombieNormal zombie1 = new ZombieNormal("Zombie generic 1",40,"M","Ninguna es inutil");
        Superviviente jugador = new Superviviente("Jorge",100,tuberia,"M",20);
        juego.agregarZombie(witch1);
        juego.agregarZombie(zombie1);

        Capitulo1 cap1 = new Capitulo1("Lluvioso","Mar del plata");
        Escopeta escopeta = new Escopeta("Spas-12",50,"Escopeta");
        ListaGenerica listaArmas = new ListaGenerica();
        listaArmas.agregarElementos(escopeta);
        listaArmas.agregarElementos(pistola1);




        Scanner scanf = new Scanner(System.in);

        //Variables opciones
        int opcion1=0;
        int opcionPartida=0;
        int opcionPrincipal=0;
        int opcionelegida2=2;
        //Variables de daño realizado;
        int dañoJugador=0;
        int dañoZombie=0;

        zombie1.atacar();
        jugador.atacar();

do {

    int opcion2=0;
    Menu menu = new Menu();
    menu.menuPrincipal();
    menu.ingreseOpcion();
    opcion1=scanf.nextInt();
    jugador.resetearVida(100);
    zombie1.resetearVida(40);

        switch (opcion1)
        {
            case 1:
            {
                int opcionelegida=0;

                cap1.describirNivel();
                opcionelegida=cap1.parte1();

                if (opcionelegida==1)
                {
                    System.out.println("Abris la puerta,bajas las escaleras al piso inferior,al llegar tenes 3 pasillos distintos" +
                            "izquierda,medio,derecha.Te pones a pensar por que camino ir");
while (opcionelegida2==2 || opcionelegida2==3)
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
                                jugador.vidaCero();
                            }
                            else if (opcionPrincipal==3)
                            {
                                System.out.println(jugador.consultarVida());
                                System.out.println(jugador.consultarArma());
                            }
                        }
                     }

                     else if(opcionelegida2==2)
                     {


                     }
                     else if(opcionelegida2==3)
                     {
                        jugador.encontrarArma(pistola1);

                     }


}

                }
                else if(opcionelegida==2)
                {
                    jugador.vidaCero();
                    System.out.println("GAME OVER");

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

