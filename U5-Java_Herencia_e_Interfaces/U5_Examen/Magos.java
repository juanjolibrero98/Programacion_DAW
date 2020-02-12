package Examen;

public class Magos extends  Hombres implements  Magia {
    private int longBarba;

    public Magos(String nombre, int energia, int capAtaque, int capDefensa, boolean encantados, int longBarba) {
        super(nombre, energia, capAtaque, capDefensa, encantados);
        this.longBarba = longBarba;
    }

    public int getLongBarba() {
        return longBarba;
    }

    public void setLongBarba(int longBarba) {
        this.longBarba = longBarba;
    }

    @Override
    public String toString() {
        return "Magos{" +super.toString()+
                "longBarba=" + longBarba +
                '}';
    }

    @Override
    public void encantar(Personajes p) {
        boolean encantado=true;
        p.setEncantados(encantado);
    }

    @Override
    public void desencantar(Personajes p) {
        boolean encantado=false;
        p.setEncantados(encantado);
    }
}
