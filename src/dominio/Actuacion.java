package src.dominio;
import java.time.LocalDate;
import java.util.ArrayList;

public class Actuacion {
    private ArrayList <Participante> participantes = new ArrayList();
    private LocalDate fecha;
    public Actuacion(LocalDate fecha){
        this.fecha = fecha;

    }
    public void annadirParticipante(Participante participante){
        participantes.add(participante);
    }
    @Override
    public String toString (){
        return "Fecha de actuación: "+fecha.toString() + "\n" + participantes.toString()+"\n";
    }

}
