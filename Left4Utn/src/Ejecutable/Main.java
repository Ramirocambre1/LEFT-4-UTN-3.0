package Ejecutable;

import Armas.Escopeta;
import Armas.Melee;
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
        Melee tuberia = new Melee("Tuberia",20,"Melee");
        ZombieNormal zombie1 = new ZombieNormal("Zombie generic 1",2,"M","Ninguna es inutil");
        Superviviente jugador = new Superviviente("Jorge",100,tuberia,"M",20);
        juego.agregarZombie(witch1);
        juego.agregarZombie(zombie1);

        Capitulo1 cap1 = new Capitulo1("Lluvioso","Mar del plata");
        Escopeta escopeta = new Escopeta("Spas-12",50,"escopeta");
        ListaGenerica listaArmas = new ListaGenerica();
        listaArmas.agregarElementos(escopeta);



        Scanner scanf = new Scanner(System.in);
        int opcion1=0;
        int opcionPartida=0;

        zombie1.atacar();

/*
do {

    int opcion2=0;
    Menu menu = new Menu();
    menu.menuPrincipal();
    menu.ingreseOpcion();
    opcion1=scanf.nextInt();

        switch (opcion1)
        {
            case 1:
            {
                int opcionelegida=0;

                cap1.describirNivel();
                opcionelegida=cap1.parte1();

                if (opcionelegida==1)
                {

                    int opcionelegida2=0;
                     opcionelegida2=cap1.parte2();

                     if (opcionelegida2==1)
                     {



                     }
                     else if(opcionelegida2==2)
                     {

                     }
                     else if(opcionelegida2==3)
                     {


                     }




                }
                else if(opcionelegida==2)
                {
                    jugador.vidaCero();
                    System.out.println(jugador.getSalud());

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
    */

}
}
