package src.dominio;
import java.math.BigDecimal;

public class MusicoRefuerzo extends Participante{
    private String instrumento;
    private BigDecimal precioHora;

    public MusicoRefuerzo(String nombre, String instrumento, BigDecimal precioHora){
        super(nombre);
        this.instrumento = instrumento;
        this.precioHora = precioHora;
        //prueba
    }
    @Override
    public String toString(){
        return super.toString() + ", " + instrumento + ", " + precioHora+"€ \n";
    }
}
