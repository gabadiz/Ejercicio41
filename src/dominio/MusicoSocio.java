package src.dominio;

public class MusicoSocio extends Participante{
    String instrumento;
    int idSocio;
    public MusicoSocio(String nombre, String instrumento, int idSocio){
        this.nombre = nombre;
        this.instrumento = instrumento;
        this.idSocio = idSocio;

    }
}
