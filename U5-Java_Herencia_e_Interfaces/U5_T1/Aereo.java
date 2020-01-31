package U5_Tarea1_Entregable;

public  abstract class Aereo extends Vehiculos {

    private int altitud;
    private String oaci;

    public Aereo(String nombreVehiculo, int numPersonasTransporte, int mAltitud, String mOaci) {
        super(nombreVehiculo, numPersonasTransporte);
        this.altitud = mAltitud;
        this.oaci = mOaci;
    }

    Aereo(String oaci){
        super(null, 4);
        setOaci(oaci);
    }

    public String tipoAeronave(){
        return getClass()+" y vuela a "+altitud+" metros de altura";
    }

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }

    public String getOaci() {
        return oaci;
    }

    public void setOaci(String oaci) {
        this.oaci = oaci;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", altitud=" + altitud +
                ", oaci='" + oaci+" ,"
                +getNumPersonasMontadas()+" pasajeros "+"}"+"\n";
    }
}
