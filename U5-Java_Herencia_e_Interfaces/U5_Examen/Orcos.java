package Examen;

public class Orcos extends Personajes implements  Atacar {

    private int pesoOrco;

    public Orcos(String nombre, int energia, int capAtaque, int capDefensa, boolean encantados, int peso) {
        super(nombre, energia, capAtaque, capDefensa, encantados);
        this.pesoOrco = peso;
    }

    public int getPesoOrco() {
        return pesoOrco;
    }

    public void setPesoOrco(int pesoOrco) {
        this.pesoOrco = pesoOrco;
    }

    @Override
    public String toString() {
        return "Orcos{" +super.toString()+
                "pesoOrco=" + pesoOrco +
                '}';
    }

    @Override
    public String atacarPersonaje(Personajes p) {

        if(p.getClass().getName()==Orcos.class.getName()){
            return getNombre()+" - "+"ATACANDO "+" NO HACE DAÑO, MISMO TIPO";
        }else {
            if(p.isEncantados()==true) {
                p.setEnergia((p.getEnergia() - (getCapAtaque() - p.getCapDefensa())*2));
                return getNombre()+" - "+"ATACANDO";
            }else {
                p.setEnergia((p.getEnergia() - (getCapAtaque() - p.getCapDefensa())));
                return getNombre()+" - "+"ATACANDO";
            }

        }
    }
}
