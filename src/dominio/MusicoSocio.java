package src.dominio;
import java.math.BigDecimal;
import java.util.*;

public class MusicoSocio extends Participante{
    private String instrumento;
    private int idSocio;
    public MusicoSocio(String nombre, String instrumento, int idSocio){
        super(nombre);
        this.instrumento = instrumento;
        this.idSocio = idSocio;
    }
    @Override
    public String toString(){
        return super.toString() + ", " + instrumento + ", numero de socio: " + idSocio+ "\n";
    }
}
