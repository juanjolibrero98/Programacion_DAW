package U5_Tarea1_Entregable;

public abstract class Vehiculos {

    //todos los atributos private
    //los vehiculos del garaje pueden ser arereos y/o terrestres
    //de los aereos pueden haber helicopteros y avionetas
    //de los terestres coches y motocicletas(guardaran la matricula, año fabricacion, color(azul,amarillo,rojo y verde))


    private String nombreVehiculo;
    private int numPersonasTransporte;
    private int numPersonasMontadas;

    public Vehiculos(String nombreVehiculo, int numPersonasTransporte) {
        this.nombreVehiculo = nombreVehiculo;
        this.numPersonasTransporte = numPersonasTransporte;
        this.numPersonasMontadas = 0;
    }

    public int getNumPersonasMontadas() {
        return numPersonasMontadas;
    }

    public void setNumPersonasMontadas(int numPersonasMontadas) {
        this.numPersonasMontadas = numPersonasMontadas;
    }

    public String getNombreVehiculo() {
        return nombreVehiculo;
    }

    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }

    public int getNumPersonasTransporte() {
        return numPersonasTransporte;
    }

    public void setNumPersonasTransporte(int numPersonasTransporte) {
        this.numPersonasTransporte = numPersonasTransporte;
    }

    boolean transportar(int num){
        if(num<numPersonasTransporte){
            numPersonasMontadas = num;
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{ " +
                "nombreVehiculo='" + nombreVehiculo + '\'' +
                ", numPersonasTransporte=" + numPersonasTransporte;
    }
}
