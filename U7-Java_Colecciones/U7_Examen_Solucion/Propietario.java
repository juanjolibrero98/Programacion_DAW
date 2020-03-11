package com.jdperez;

import java.io.Serializable;

public class Propietario implements Serializable {
    private String nombre;
    private String apellidos;
    private int id;
    private String pais;

    public Propietario(String nombre, String apellidos, int id, String pais) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", id=" + id +
                ", pais='" + pais + '\'' +
                '}';
    }
}
