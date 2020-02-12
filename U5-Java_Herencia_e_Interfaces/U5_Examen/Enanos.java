package Examen;

public class Enanos extends  Personajes implements  Atacar {

    private int altura;

    public Enanos(String nombre, int energia, int capAtaque, int capDefensa, boolean encantados, int altura) {
        super(nombre, energia, capAtaque, capDefensa, encantados);
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Enanos{" +super.toString()+
                "altura=" + altura +
                '}';
    }

    @Override
    public String atacarPersonaje(Personajes p) {

        if(p.getClass().getName()==Enanos.class.getName()){
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

