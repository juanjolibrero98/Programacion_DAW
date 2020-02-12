package Examen;

public class Elfos extends Personajes implements Atacar {
    private TipoElfo tipo;

    public Elfos(String nombre, int energia, int capAtaque, int capDefensa, boolean encantados, TipoElfo tipo) {
        super(nombre, energia, capAtaque, capDefensa, encantados);
        this.tipo = tipo;
    }

    public TipoElfo getTipo() {
        return tipo;
    }

    public void setTipo(TipoElfo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Elfos{" +super.toString()+
                "tipo=" + tipo +
                '}';
    }

   @Override
    public String atacarPersonaje(Personajes p) {

        if(p.getClass().getName()==Elfos.class.getName()){
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
