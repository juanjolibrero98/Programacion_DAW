package com.jdperez;

public class Main {

    public static void main(String[] args) {

        Propietario p1 = new Propietario("Pepe","Perez",1,"España");
        Propietario p2 = new Propietario("Ana","Perez",2,"España");
        Propietario p3 = new Propietario("Rosa","Torres",3,"España");

        /*Perro d1 = new Perro("Atila",5,8580,true,p1,"caniche");
        Perro d2 = new Perro("Stalin",13,6700,true,p2,"boxer");
        Perro d3 = new Perro("Lulu",15,9000,true,p1,"doberman");
        Perro d4 = new Perro("Julio Cesar",6,5500,true,p2,"caniche");
        Perro d5 = new Perro("Luna",8,9300,true,p1,"boxer");
        Perro d6 = new Perro("Speedy",9,11200,true,p2,"boxer");
        Perro d7 = new Perro("Snoopy",7,12000,true,p1,"caniche");
        Perro d8 = new Perro("Lassie",10,14000,true,p1,"san bernardo");
        Perro d9 = new Perro("Goku",11,6100,true,p2,"caniche");
        Perro d10 = new Perro("Naruto",6,12175,true,p1,"caniche");
*/
        Concurso concurso = new Concurso("ExpoCanina2020","Sevilla");
        concurso.cargarPerros();
        /*concurso.addDog("caniche",d1);
        concurso.addDog("boxer",d2);
        concurso.addDog("doberman",d3);
        concurso.addDog("caniche",d4);
        concurso.addDog("boxer",d5);
        concurso.addDog("boxer",d6);
        concurso.addDog("caniche",d7);
        concurso.addDog("san bernardo",d8);
        concurso.addDog("caniche",d9);
        concurso.addDog("caniche",d10)*/;


        //concurso.perrosPorPeso("boxer");

        //concurso.perrosPorEdad("boxer");

        concurso.ownerDogs(1);
        concurso.ownerDogs(3);

        concurso.escribirPerros();



    }
}
