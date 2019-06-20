package Clases;

import Interfaces.Json;
import org.json.JSONArray;

import java.util.ArrayList;

public class ListaGenerica <T> {//Clase generica

    private ArrayList<T>listaElementos;


    public ListaGenerica()//Constructor de la lista
    {

        listaElementos=new ArrayList<>();

    }

    public void agregarElementos(T elemento)//Agrega un elemento a la lista
    {

        listaElementos.add(elemento);

    }

    public void  listarElementos()//Lista los elementos de la lista
    {
        for (T a : listaElementos)
        {

            System.out.println(a.toString());

        }


    }

/*
    public void arrayListToJsonArray()//Intento de aplicaicon de json  a listas genericas
    {
        JSONArray jsonArray = new JSONArray();

        for (T a : listaElementos)
        {
            T auxiliar =a;








        }


    }

 */






}
