package com.jdperez;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Concurso {
    private String nombre;
    private String localidad;
    private Map<String, Set<Perro>> perros;

    public Concurso(String nombre, String localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
        perros = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Map<String, Set<Perro>> getPerros() {
        return perros;
    }

    public void setPerros(Map<String, Set<Perro>> perros) {
        this.perros = perros;
    }

    public void addDog(String raza, Perro perro ) {
        if (perro.getRaza().equals(raza)) {
            if (!perros.containsKey(raza)) {
                perros.put(raza,new TreeSet<Perro>());
            }
            perros.get(raza).add(perro);
        } else {
            System.out.println("El perro no es de la raza en la que quiere apuntarse");
        }
    }

    public boolean disqualifyDog(Perro perro) {
        if (!perros.containsKey(perro.getRaza())) {
            System.out.println("No hay inscritos en esa raza");
            return false;
        } else {
            if (perros.get(perro.getRaza()).contains(perro)) {
                return perros.get(perro.getRaza()).remove(perro);
            } else {
                System.out.println("No consta en la lista de su raza");
                return false;
            }
        }
    }

    public void perrosPorPeso(String raza) {
        if (!perros.containsKey(raza)) {
            System.out.println("No hay perros inscritos de esa raza");
        } else {
            System.out.println(perros.get(raza));
        }
    }

    public void perrosPorEdad(String raza) {
        if (!perros.containsKey(raza)) {
            System.out.println("No hay perros inscritos de esa raza");
        } else {
            List<Perro> lista = new ArrayList<>(perros.get(raza));

            Collections.sort(lista, new Comparator<Perro>() {
                @Override
                public int compare(Perro perro, Perro t1) {
                    return t1.getEdad()-perro.getEdad();
                }
            });

            System.out.println(lista);
        }

    }

    public void ownerDogs(int id) {

        Collection<Set<Perro>> conjunto = perros.values();
        int numperros = 0;

        Iterator it = conjunto.iterator();

        while (it.hasNext()) {
            Set<Perro> dogs = (Set<Perro>) it.next();

            for (Perro p : dogs) {
                if (p.getPropietario().getId() == id) {
                    System.out.println(p);
                    numperros++;
                }
            }
        }

        if (numperros==0) {
            System.out.println("El dueño no tiene ningún inscrito");
        }

    }

    public void cargarPerros() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("perros.dat"));

            while (true) {
                Perro p = (Perro) ois.readObject();
                addDog(p.getRaza(),p);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void escribirPerros() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("perros.dat"));
            Collection<Set<Perro>> conjunto = perros.values();

            Iterator it = conjunto.iterator();

            while (it.hasNext()) {
                Set<Perro> dogs = (Set<Perro>) it.next();

                for (Perro p : dogs) {
                    oos.writeObject(p);
                }
            }

            oos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
