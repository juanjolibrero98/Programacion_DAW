package Examen;

public abstract class Personajes {
    private String nombre;
    private int energia;
    private int capAtaque;
    private int capDefensa;
    private boolean encantados;

    public Personajes(String nombre, int energia, int capAtaque, int capDefensa, boolean encantados) {
        this.nombre = nombre;
        this.energia = energia;

        this.capAtaque = capAtaque;
        this.capDefensa = capDefensa;
        this.encantados = encantados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if(energia<0 | energia>1000){
            System.out.println("Valor fuera de límites");
        }else {
            this.energia = energia;
        }

    }
    public void setCapAtaque(int capAtaque) {
        if(capAtaque<0 | capAtaque>100){
            System.out.println("Valor fuera de límites");
        }else {
            this.capAtaque = capAtaque;
        }

    }
    public void setCapDefensa(int capDefensa) {
        if(capDefensa<0 | capDefensa>100){
            System.out.println("Valor fuera de límites");
        }else {
            this.capDefensa = capDefensa;
        }
    }

    public int getCapAtaque() {
        return capAtaque;
    }



    public int getCapDefensa() {
        return capDefensa;
    }



    public boolean isEncantados() {
        return encantados;
    }

    public void setEncantados(boolean encantados) {
        this.encantados = encantados;
    }


    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", capAtaque=" + capAtaque +
                ", capDefensa=" + capDefensa +
                ", encantados=" + encantados +
                '}';
    }
}
