package com.jdperez;

import java.io.Serializable;

public class Perro implements Comparable, Serializable {
    private String nombre;
    private int edad;
    private int peso;
    private boolean vacunas;
    private Propietario propietario;
    private String raza;

    public Perro(String nombre, int edad, int peso, boolean vacunas, Propietario propietario, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunas = vacunas;
        this.propietario = propietario;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunas=" + vacunas +
                ", propietario=" + propietario +
                ", raza='" + raza + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Perro p = (Perro) o;
        return p.getPeso()-getPeso();
    }
}
