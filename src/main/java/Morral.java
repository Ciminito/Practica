public class Morral extends Accesorios {

    int largo;
    boolean ojoDeGato;

    public Morral(int largo, boolean ojoDeGato){
        this.largo = largo;
        this.ojoDeGato = ojoDeGato;
    }

    public double peso() {
        return 1.2;
    }

    public double carga() {
        return largo/3;
    }

    public boolean esLuminoso() {
        return ojoDeGato;
    }
}
