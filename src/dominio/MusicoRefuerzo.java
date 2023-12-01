package src.dominio;
import java.math.BigDecimal;

public class MusicoRefuerzo extends Participante{
    String instrumento;
    BigDecimal precioHora;

    public MusicoRefuerzo(String nombre, String instrumento, BigDecimal precioHora){
        this.nombre = nombre;
        this.instrumento = instrumento;
        this.precioHora = precioHora;
    }
}
