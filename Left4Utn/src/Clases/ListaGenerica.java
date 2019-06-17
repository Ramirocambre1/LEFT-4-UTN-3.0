package Clases;

import java.util.ArrayList;

public class ListaGenerica <T> {

    private ArrayList<T>listaElementos;


    public ListaGenerica()
    {

        listaElementos=new ArrayList<>();

    }

    public void agregarElementos(T elemento)
    {

        listaElementos.add(elemento);

    }

    public void  listarElementos()
    {
        for (T a : listaElementos)
        {

            System.out.println(a.toString());

        }


    }






}
