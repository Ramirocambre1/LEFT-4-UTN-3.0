package Zombies;

import Clases.Personaje;
import Interfaces.Json;
import org.json.JSONException;
import org.json.JSONObject;

public class Zombie extends Personaje implements Json {//Clase padre que extienden los diferentes tipos de zombies
    // que hay
    private String especialidad;

    public Zombie()
    {

    }

    public Zombie(String nombre, int salud ,String sexo, String especialidad) {//Constructor de la clase
        super(nombre, salud,sexo);
        this.especialidad = especialidad;
    }

    private void mostrarInfo(Zombie z){
        System.out.println(z.toString());
    } //Muestra la info de un zombi

    @Override
    public String toString() {
        return super.toString() +
                ", Especialidad:" + especialidad + '\'';//Metodo to string que muestra un zombi
    }

    public String getEspecialidad() {
        return especialidad;
    }//Retonar la especialidad del atributo de un zombi


    public JSONObject getFormatoJson() throws JSONException// Permite poner en formate json a los objetos de la
    // clase,retornando un objeto json para poder guardalo luego en un array
    {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("nombre",getNombre());
        jsonObject.put("salud",getSalud());
        jsonObject.put("sexo",getSexo());
        jsonObject.put("especialidad",getEspecialidad());


        return  jsonObject;



    }

    public void setEspecialidad(String especialidad) { // Setea la especiliadad de un zombie
        this.especialidad = especialidad;
    }
}
