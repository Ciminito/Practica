public class Canasto extends Accesorios {

    double volumen;

    public Canasto(double volumen){

        this.volumen = volumen;
    }


    @Override
    public double peso() {
        return 0;
    }

    public double carga() {
        return volumen*2;
    }

    public boolean esLuminoso() {
        return false;
    }
}
