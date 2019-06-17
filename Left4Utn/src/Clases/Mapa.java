package Clases;

public class Mapa {
    private String clima;
    private String hora;
    private String localizacion;

    public Mapa(String clima, String hora, String localizacion) {
        this.clima = clima;
        this.hora = hora;
        this.localizacion = localizacion;
    }

    public String getClima() {
        return clima;
    }

    public String getHora() {
        return hora;
    }

    public String getLocalizacion() {
        return localizacion;
    }
}
