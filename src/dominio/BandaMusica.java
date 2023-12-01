package src.dominio;
import java.util.ArrayList;

public class BandaMusica {
    ArrayList<Actuacion> actuaciones= new ArrayList();
    public String nombre;
    public BandaMusica(String nombre){
        this.nombre = nombre;

    }
    public void annadirActuacion(Actuacion actuacion){
        actuaciones.add(actuacion);

    }
    public String toString (){

        return nombre + "\n" + actuaciones.toString();

    }

}
