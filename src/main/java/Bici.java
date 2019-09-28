import java.util.ArrayList;
import java.util.List;

public class Bici {

    int rodado;
    int largo;
    public String marca;
    List<Accesorios> accesoriosList = new ArrayList<Accesorios>();
    public Bici(int rodado, int largo, String marca, Accesorios[]accesorios){

        this.rodado = rodado;
        this.largo = largo;
        this.marca = marca;
        this.accesoriosList = null;
    }

    public double altura(){
        return rodado * 2.5 + 15;

    }

    public int velCrucero(){
        if(largo>120){
            return rodado + 6;
        }else{
            return rodado + 2;
        }
    }

    public double carga(){
        return accesoriosList.stream()
                .map(a -> a.carga())
                .reduce((carga1, carga2) -> carga1 +  carga2)
                .get();
    }

    public double peso(){
        return accesoriosList.stream()
                .map(a -> a.peso())
                .reduce((peso1, peso2) -> peso1 + peso2)
                .get();
    }

    public boolean biciLuminosa(){
        return accesoriosList.stream()
                .filter(a -> a.esLuminoso())
                .findAny()
                .isPresent();
    }

}
