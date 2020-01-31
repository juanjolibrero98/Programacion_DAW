package U5_Tarea1_Entregable;

import java.util.Objects;

public abstract class Terrestre extends  Vehiculos implements Comparable {

    private String matricula;
    private int anhoFabrica;
    private ColorVehiculosTerrestres color;

    public Terrestre(String nombreVehiculo, int numPersonasTransporte, String mMatricula, int mAnhoFabrica, ColorVehiculosTerrestres mColor) {
        super(nombreVehiculo, numPersonasTransporte);
        this.matricula = mMatricula;
        this.anhoFabrica = mAnhoFabrica;
        this.color = mColor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnhoFabrica() {
        return anhoFabrica;
    }

    public void setAnhoFabrica(int anhoFabrica) {
        this.anhoFabrica = anhoFabrica;
    }

    public ColorVehiculosTerrestres getColor() {
        return color;
    }

    public void setColor(ColorVehiculosTerrestres color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", matricula='" + matricula + '\'' +
                ", anhoFabrica=" + anhoFabrica +
                ", color=" + color +" ,"
                +getNumPersonasMontadas()+" pasajeros "+"}"+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terrestre terrestre = (Terrestre) o;
        return getMatricula().equals(terrestre.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    @Override
    public int compareTo(Object o) {
        Terrestre t1 = (Terrestre) o;
        return this.getMatricula().compareTo(t1.getMatricula());
    }


}
