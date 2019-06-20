package Clases;

import Armas.Arma;
import Capitulos.Capitulo1;
import Capitulos.Capitulo2;
import Capitulos.Capitulo3;
import Capitulos.Mapa;
import Interfaces.Json;
import Zombies.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Juego {//Clase la cual posee  todas las colleciones que utiliza el trabajo

    private HashMap<String, Zombie> hashZombies;
    private HashMap<String, Mapa>hashCapitulos;
    private ArrayList<Arma>listaArmas;
    private String nombreJuego;
    private String creadores;

    public Juego(String nombreJuego, String creadores) {//Constructor de la clase
        this.nombreJuego = nombreJuego;
        this.creadores = creadores;
        hashZombies = new HashMap<String, Zombie>();
        hashCapitulos = new HashMap<String, Mapa>();
        listaArmas = new ArrayList<>();
    }
/////////// ZOMBIES
    public void agregarZombie(Zombie a)//Agrega un zombi al hashmap
    {
        hashZombies.put(a.getEspecialidad(),a);

    }

    public void listarZombie()//Lista todos los zombies cargado en el hashmap
    {
        Iterator iterator = this.hashZombies.values().iterator();

        while (iterator.hasNext())
        {
            Zombie zombie= (Zombie) iterator.next();


            System.out.println(""+zombie.toString());
        }

    }

    public JSONArray hashMapToJsonArrayZombies()//Pasa todos los zombies cargados de la collecion a un jsonArray
    {
        Iterator iterator = this.hashZombies.values().iterator();
        JSONArray jsonArray = new JSONArray();

        while (iterator.hasNext())
        {
            Zombie zombie= (Zombie) iterator.next();
            try {
                jsonArray.put(zombie.getFormatoJson());
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }

        }
        //System.out.println(jsonArray.toString());
        return jsonArray;
    }

    public void jsonArrayToHashMapZombies()//Lee el archivo JSON de zombies y pasa su contenido a un jsonarray para
    // luego guardalos en el hashmap de zombies
    {try {

            JSONArray jsonArray = new JSONArray(leerZombies());

            for (int i = 0 ; i<jsonArray.length();i++)
            {
                Zombie zombie = new Zombie();

                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    zombie.setNombre(jsonObject.getString("nombre"));
                    zombie.setSalud(jsonObject.getInt("salud"));
                    zombie.setSexo(jsonObject.getString("sexo"));
                    zombie.setEspecialidad(jsonObject.getString("especialidad"));

                    hashZombies.put(zombie.getEspecialidad(),zombie);
                }


        }catch (JSONException e) {
        e.printStackTrace();
    }

    }

    public  String leerZombies()//Lee el archivo de zombies y retorna su contenido en formato String
    {
        String contenido = "";
        try
        {
            contenido = new String(Files.readAllBytes(Paths.get("Zombies.json")));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return contenido;
    }
    public static void grabarZombies(JSONArray array) {//Se encarga de crear el archivo de zombies y escribirlo con
        // datos que le pasemos por un jsonArray

        try {
            FileWriter file = new FileWriter("Zombies.json");
            file.write(array.toString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



  public Zombie retornarZombie(String nombre)//Retonar un zombie guardado en la collecion
  {
      Iterator iterator = this.hashZombies.values().iterator();

              while (iterator.hasNext())
              {
                    Zombie zombie = (Zombie) iterator.next();

                    if (zombie.getNombre().equalsIgnoreCase(nombre))
                    {
                        return zombie;
                    }


              }



      return  null;

  }



    ///////// CAPITULOS

    public void agregarCapitulo(Mapa a)//Agrega un capitulo al hashmap de capitulos
    {
        hashCapitulos.put(a.getLocalizacion(),a);

    }

    public void listarCapitulos()//Lista todos los capitulos disponibles en el hashmap de capitulos
    {
        Iterator iterator = this.hashCapitulos.values().iterator();

        while (iterator.hasNext())
        {
            Mapa capitulo= (Mapa) iterator.next();

            System.out.println("Capitulos");
            System.out.println(""+capitulo.toString());

        }
    }

    public JSONArray hashmapToJsonArrayCapitulos()//Pasa todos los capitulos cargados de la collecion a un jsonArray
    // y lo retorna
    {
        Iterator iterator=this.hashCapitulos.values().iterator();
        JSONArray jsonArray = new JSONArray();


            while (iterator.hasNext())
            {
                Mapa capitulo=(Mapa)iterator.next();

                try {
                    jsonArray.put(capitulo.getFormatoJson());
                }catch (JSONException e)
                {
                    e.printStackTrace();
                }


            }

        System.out.println(jsonArray.toString());

        return  jsonArray;

    }

    public void jsonArrayToHashMapCapitulos() //Lee el archivo JSON de Capitulos y pasa su contenido a un jsonarray
    // para
    // luego guardalos en el hashmap de capitulos
    {
        try {

            JSONArray jsonArray = new JSONArray(leerCapitulos());

            for (int i = 0 ; i<jsonArray.length();i++)
            {
                Mapa capitulo = new Mapa();

                JSONObject jsonObject = jsonArray.getJSONObject(i);
                capitulo.setNombre(jsonObject.getString("nombre"));
                capitulo.setClima(jsonObject.getString("clima"));
                capitulo.setLocalizacion(jsonObject.getString("localizacion"));

                hashCapitulos.put(capitulo.getLocalizacion(),capitulo);
            }


        }catch (JSONException e) {
            e.printStackTrace();
        }

    }
    public static void grabarCapitulos(JSONArray array) {//Crea un archivo json de capitulos que guarda el contenido
        // de un json que le pasemos
        try {
            FileWriter file = new FileWriter("Capitulos.json");
            file.write(array.toString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  String leerCapitulos()//Lee el archivo de capitulos json y retorna su contenido en formato String
    {
        String contenido = "";
        try
        {
            contenido = new String(Files.readAllBytes(Paths.get("Capitulos.json")));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return contenido;
    }

    public Mapa retornarCapitulo(String nombreCapitulo)//Retorna un capitulo guardado en la collecion
    {
        Mapa capitulo = new Mapa();
        Iterator iterator=this.hashCapitulos.values().iterator();

        while (iterator.hasNext())
        {

            capitulo=(Mapa) iterator.next();
            if (capitulo.getNombre().equalsIgnoreCase(nombreCapitulo))
            {
                return capitulo;
            }

        }

        return  capitulo;

    }


    ////// ARMAS

    public void  agregarArma(Arma a)//Agrega un arma al arraylist de armas
    {

        listaArmas.add(a);

    }

    public void  listarArmas()//Lista todas las armas cargadas en la lista
    {
        for (Arma a : listaArmas)
        {
            System.out.println(a.toString());

        }

    }


    public JSONArray arrayListToJsonArray()//Pasa los elementos del arraylist  a un jsonArray
    {
        JSONArray jsonArray = new JSONArray();

        for (Arma a : listaArmas)
        {
            Arma arma =a;

            try {
                jsonArray.put(arma.getFormatoJson());
            } catch (JSONException e) {
                e.printStackTrace();
            }


        }

        //System.out.println(jsonArray.toString());

        return jsonArray;

    }

    public void jsonArrayToArrayListArmas() //Pasa el contenido guardado en el archivo de Armas json a la collecion
    {
        try {
                JSONArray jsonArray = new JSONArray(leerArmas());
                for (int i=0;i<jsonArray.length();i++)
                {
                    Arma arma = new Arma();
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    arma.setNombreArma(jsonObject.getString("nombrearma"));
                    arma.setDaño(jsonObject.getInt("daño"));
                    arma.setTipo(jsonObject.getString("tipo"));

                    agregarArma(arma);

                }




        }catch (JSONException e)
        {
            e.printStackTrace();
        }

    }

    public static void grabarArmas(JSONArray array) { // Crea un archivo json de armas
        try {
            FileWriter file = new FileWriter("Armas.json");
            file.write(array.toString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  String leerArmas()//Lee el contenido del archivo armas json y lo pasa en formato de String
    {
        String contenido = "";
        try
        {
            contenido = new String(Files.readAllBytes(Paths.get("Armas.json")));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return contenido;
    }


    public Arma retonarArma(String nombreArma)//Retonar un arma que se encuentre en el arraylist
    {
        Arma arma = new Arma();
        for (Arma a : listaArmas)
        {
            if (a.getNombreArma().equalsIgnoreCase(nombreArma))
            {
               arma=a;
            }
        }
            return arma;
    }


}
