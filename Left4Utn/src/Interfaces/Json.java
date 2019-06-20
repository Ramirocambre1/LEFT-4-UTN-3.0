package Interfaces;

import org.json.JSONException;
import org.json.JSONObject;

public interface Json { //Se implementa en clases para poder conseguir el formato json de cada uno y luego guardarlos
    // en un archivo


    public JSONObject getFormatoJson() throws JSONException;



}
