package Examen;

public class Perro {
    private String nombrePerro;
    private int edad;
    private double peso;
    private boolean totalVacunas;
    private PropietarioPerro propietarioPerro;
    private Raza raza;

    public Perro(String nombrePerro, int edad, double peso, boolean totalVacunas, PropietarioPerro propietarioPerro, Raza raza) {
        this.nombrePerro = nombrePerro;
        this.edad = edad;
        this.peso = peso;
        this.totalVacunas = totalVacunas;
        this.propietarioPerro = propietarioPerro;
        this.raza = raza;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isTotalVacunas() {
        return totalVacunas;
    }

    public void setTotalVacunas(boolean totalVacunas) {
        this.totalVacunas = totalVacunas;
    }

    public PropietarioPerro getPropietarioPerro() {
        return propietarioPerro;
    }

    public void setPropietarioPerro(PropietarioPerro propietarioPerro) {
        this.propietarioPerro = propietarioPerro;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombrePerro='" + nombrePerro + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", totalVacunas=" + totalVacunas +
                ", propietarioPerro=" + propietarioPerro +
                ", raza=" + raza +
                '}'+"\n";
    }
}
