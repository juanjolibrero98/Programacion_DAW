package Examen;

import java.io.*;
import java.util.*;

public class Concurso implements Serializable {
    private Perro[] perro;
    private String nombreConcurso;
    private String localidadCelebracion;


    public Concurso(Perro[] perro, String nombreConcurso, String localidadCelebracion) {
        this.perro = perro;
        this.nombreConcurso = nombreConcurso;
        this.localidadCelebracion = localidadCelebracion;

    }

    Map<Raza,Perro> concur = new TreeMap<>();//aqui ya estan separados los perros por razas


   public void addDog(Raza r, Perro p){
        if(r == p.getRaza()){
            concur.put(r,p);
        }else {
            System.out.println("Su perro no es válida para esta clase de raza");
        }
    }


    public void disqyualifyDog(Perro p){
        if(concur.containsValue(p)){
            concur.remove(p.getRaza());
            System.out.println("Perro descalificado");
        }else {
            System.out.println("Perro no inscrito");
        }
    }
    public void ownerDogs(int numSocio){
       if(concur.containsValue(numSocio)){
           System.out.println(concur.values());
       }else {
           System.out.println("Este socio no tienen perros inscritos");
       }

    }
    public void perrosPorPeso(Raza r){
        Collection<Perro> per = concur.values();
        List<Perro> lista = new ArrayList<>(per);
        Collections.sort(lista, new Comparator<Perro>() {
            @Override
            public int compare(Perro perro, Perro t1) {
                return (int) (t1.getPeso()-perro.getPeso());
            }
        });
        for (Perro c: lista  ) {
            if(c.getRaza()==r) {
                System.out.println(c);
            }
        }
    }
    public void perrosPorEdad(Raza r){
        Collection<Perro> per = concur.values();
        List<Perro> lista = new ArrayList<>(per);
        Collections.sort(lista, new Comparator<Perro>() {
            @Override
            public int compare(Perro perro, Perro t1) {
                return (int) (t1.getEdad()-perro.getEdad());
            }
        });
        for (Perro c: lista  ) {
            if(c.getRaza()==r) {
                System.out.println(c);
            }
        }
    }
    public void cargarPerros(){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("perros.dat"));
            Set<Map.Entry<Raza,Perro>> cargarPerros = concur.entrySet();
            while (true){
                cargarPerros.add((Map.Entry<Raza, Perro>) ois.readObject());
                ois.readLine();
            }

        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public void guardarPerros(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("perros.dat"));

            oos.writeObject(concur);

            oos.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public Perro[] getPerro() {
        return perro;
    }

    public void setPerro(Perro[] perro) {
        this.perro = perro;
    }

    public String getNombreConcurso() {
        return nombreConcurso;
    }

    public void setNombreConcurso(String nombreConcurso) {
        this.nombreConcurso = nombreConcurso;
    }

    public String getLocalidadCelebracion() {
        return localidadCelebracion;
    }

    public void setLocalidadCelebracion(String localidadCelebracion) {
        this.localidadCelebracion = localidadCelebracion;
    }



    @Override
    public String toString() {
        return "Concurso{" +
                "perro=" + Arrays.toString(perro) +
                ", nombreConcurso='" + nombreConcurso + '\'' +
                ", localidadCelebracion='" + localidadCelebracion + '\'' +
                ", raza=" +
                '}';
    }
}
