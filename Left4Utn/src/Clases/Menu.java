package Clases;

public class Menu {

    public Menu() {

    }

    public void menuPrincipal()
    {
        System.out.println("----Menu Principal----");
        System.out.println("1.Empezar partida");
        System.out.println("2.Extras");
        System.out.println("3.Creditos");
        System.out.println("4.Salir");


    }

    public void menuExtras()
    {
        System.out.println("----Menu Extras----");
        System.out.println("1.Mostrar Zombies");
        System.out.println("2.Mostrar Mapas");
        System.out.println("3.Mostrar Armas");
        System.out.println("4.Volver hacia atras");
    }

    public void creditos()
    {
        System.out.println("---Creadores---");
        System.out.println("Felipe Cilia");
        System.out.println("Ramiro Cambre");
    }

    public void ingreseOpcion()
    {
        System.out.println("-Ingrese la opcion-");
    }


}
