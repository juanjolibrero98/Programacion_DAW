package U8_T6_Desde_Json_A_Java;

import java.util.ArrayList;

public class Futbolista {
    private int dorsal;
    private String nombre;
    private ArrayList<String> demarcaciones;
    private String equipo;

    public Futbolista(int dorsal, String nombre, String equipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.demarcaciones = new ArrayList<>();
        this.equipo = equipo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getDemarcaciones() {
        return demarcaciones;
    }

    public void setDemarcaciones(ArrayList<String> demarcaciones) {
        this.demarcaciones = demarcaciones;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", demarcaciones=" + demarcaciones +
                ", equipo='" + equipo + '\'' +
                '}';
    }
}
