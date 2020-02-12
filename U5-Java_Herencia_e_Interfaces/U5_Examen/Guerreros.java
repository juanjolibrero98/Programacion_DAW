package Examen;

public class Guerreros extends Hombres implements Atacar {
    private int edad;

    public Guerreros(String nombre, int energia, int capAtaque, int capDefensa, boolean encantados, int edad) {
        super(nombre, energia, capAtaque, capDefensa, encantados);
        this.edad= edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Guerreros{" +super.toString()+
                "edad=" + edad +
                '}';
    }

    @Override
    public String atacarPersonaje(Personajes p) {

        if(p.getClass().getName()==Guerreros.class.getName()){
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
