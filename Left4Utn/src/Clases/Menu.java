package Clases;

public class Menu {

    public Menu() {

    }

    public void menuPrincipal() //Menu principal que se ejecuta la principio de la ejecucion del programa con las
    // opciones principales
    {
        System.out.println("----Menu Principal----");
        System.out.println("1.Empezar partida");
        System.out.println("2.Extras");
        System.out.println("3.Creditos");
        System.out.println("4.Salir");


    }

    public void menuExtras()//Menu de extras que muestra los diferetes elementos cargados en las colleciones
    {
        System.out.println("----Menu Extras----");
        System.out.println("1.Mostrar Zombies");
        System.out.println("2.Mostrar Capitulos");
        System.out.println("3.Mostrar Armas");
        System.out.println("4.Volver hacia atras");
    }

    public void creditos()//Los creadores del tp :)
    {
        System.out.println("---Creadores---");
        System.out.println("Felipe Cilia");
        System.out.println("Ramiro Cambre");
    }

    public void ingreseOpcion()
    {
        System.out.println("-Ingrese la opcion-");
    } // Metodo que muestra para ingresar una opciones,se utiliza con los diferentes menus que tiene el trabajo


}
