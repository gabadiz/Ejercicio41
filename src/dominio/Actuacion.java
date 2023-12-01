package src.dominio;
import java.time.LocalDate;
import java.util.ArrayList;

public class Actuacion {
    ArrayList <Participante> participantes = new ArrayList();
    LocalDate fecha;
    public Actuacion(LocalDate fecha){
        this.fecha = fecha;

    }
    public void annadirParticipante(Participante participante){
        participantes.add(participante);
    }
    public String toString (){
        return fecha.toString() + "\n" + participantes.toString();
    }

}
