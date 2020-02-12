package Examen;

public class Main {

    public static void main(String[] args) {

        Elfos e1 = new Elfos("Jhon",500,60,40,false,TipoElfo.BOSQUE);
        Elfos e2 = new Elfos("Fran",150,50,20,true,TipoElfo.COSTA);
        Orcos o1 = new Orcos("Pepa",900,30,90,true,300);
        Enanos en1 = new Enanos("Nigard",400,80,40,false,120);
        Guerreros g1 = new Guerreros("Nieve",700,50,70,true,26);
        Enanos en2 = new Enanos("Brol",450,85,45,true,125);
        Guerreros g2 = new Guerreros("Sol",500,55,85,false,24);
        Magos m1 = new Magos("HarryPother",600,60,40,false,0);
        Personajes[] todos = new Personajes[5];
        todos[0]= e1;
        todos[1]= o1;
        todos[2]= en1;
        todos[3]= g1;
        todos[4]= m1;
        System.out.println(en1.atacarPersonaje(en2));//no hace daño

        System.out.println(en1.atacarPersonaje(g1));//ataca *2 por que está encantado el guerrero1
        System.out.println(g1.toString());//quita 20

        System.out.println(g1.atacarPersonaje(g2));//no hace daño

        System.out.println(g1.atacarPersonaje(en2));//ataca *2 por estar encantado el enano2
        System.out.println(en2.toString());//quita 10

       System.out.println(e1.atacarPersonaje(m1));//ataca quitando 20
        System.out.println(m1.toString());

        System.out.println(o1.atacarPersonaje(e2));//el e2 se queda con 130 energia
        System.out.println(en2.atacarPersonaje(e2));// e2 muere, ya que le quitan con esto los 130 de energia
        System.out.println(e2.toString());//comprobamos que tiene 0 energia


        System.out.println("Ahora mostraremos el encantamiento y desencantamiento realizado a los personajes");
        m1.encantar(e1);
        System.out.println(e1.toString());
        m1.desencantar(g1);
        System.out.println(g1.toString());
        System.out.println(" ");

        Rpg juego1 = new Rpg(todos);
        juego1.anhadirPersonaje(e1);
        juego1.anhadirPersonaje(en1);
        juego1.anhadirPersonaje(o1);
        juego1.anhadirPersonaje(m1);
        juego1.anhadirPersonaje(e2);
        juego1.anhadirPersonaje(g1);
        System.out.println("Ahora mostramos si hay o no ganador");
        System.out.println(juego1.hayGanador());

        System.out.println(juego1.toString());
        System.out.println(juego1.borrarMuertos(e2));
    }

}
