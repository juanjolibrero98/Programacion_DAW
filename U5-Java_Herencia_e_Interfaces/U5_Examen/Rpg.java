package Examen;

import java.util.Arrays;

public class Rpg{

    private Personajes[] juego = new Personajes[10];
    private int contadorPersonajes=0;

    //


    public Rpg(Personajes[] juego) {
        this.juego = juego;
    }

    //metodos
    public Personajes[] getJuego() {
        return juego;
    }
    public String anhadirPersonaje(Personajes p){
        if(contadorPersonajes<9){
            juego[contadorPersonajes] = p;
            contadorPersonajes++;
            return "Personaje añadido";
        }else {
            return "No se puede añadir mas personajes";
        }
    }

   public String borrarMuertos(Personajes p){
            if(p.getEnergia()<=0){
                for (int i = 0; i <juego.length ; i++) {
                        if(juego[i] == p){
                            juego[i] = null;
                        }
                }
                return "Borrado";
            }else {
                return "No borrado, aun tiene energia";
            }

    }
   /* public String mostrarEstado(Object o){
        Rpg rpg1 = (Rpg) o;
        return

    }

    */

    public String hayGanador(){
        int contador=0;
        for (int i = 0; i <juego.length ; i++) {
            if(juego[i]!=null){
                contador++;
            }
        }
        if (contador==1){
            return "HAY GANADOR Y ES: "+" ...";
        }else {
            return "AUN QUEDA MÁS DE 1 JUGADOR";
        }
    }





    public void setJuego(Personajes[] juego) {
        this.juego = juego;
    }

    @Override
    public String toString() {
        return "Rpg{" +
                "juego=" + Arrays.toString(juego) +
                '}';
    }
}
