package src.dominio;
import java.util.ArrayList;

public class BandaMusica {
    private ArrayList<Actuacion> actuaciones= new ArrayList();
    private String nombre;
    private String mayuscula;

    public BandaMusica(String nombre){
        this.nombre = nombre;
        mayuscula = nombre.toUpperCase();

    }
    public void annadirActuacion(Actuacion actuacion){
        actuaciones.add(actuacion);

    }

    @Override
    public String toString (){

        return mayuscula + "\n" + actuaciones.toString();

    }

}
