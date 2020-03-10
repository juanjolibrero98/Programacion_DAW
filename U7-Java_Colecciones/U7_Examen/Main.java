package Examen;

public class Main {
    public static void main(String[] args) {

        PropietarioPerro pp1 = new PropietarioPerro("Pepe","Felix Duarte",25,"España");
        PropietarioPerro pp2 = new PropietarioPerro("Ana","Metrovich",34,"Rusia");
        PropietarioPerro pp3 = new PropietarioPerro("Marisa","Antuan Blabla",12,"Francia");
        PropietarioPerro pp4 = new PropietarioPerro("Juan","Trobin Bleble",6,"Alemania");

        Perro p1 = new Perro("Dexter",2,3.45,true,pp1,Raza.AKITA);
        Perro p2 = new Perro("Blender",1,2.3,false,pp2,Raza.AFGANO);
        Perro p3 = new Perro("Java",3,3.3,true,pp3,Raza.BASENJI);
        Perro p4 = new Perro("Oracle",2,1.9,true,pp4,Raza.BEAGLE);
        Perro p5 = new Perro("Html",4,3.70,false,pp1,Raza.AKITA);
        Perro p6 = new Perro("Css",1,3.10,true,pp2,Raza.BERGAMASCO);
        Perro p7 = new Perro("Angular",2,2.45,true,pp3,Raza.BEAGLE);
        Perro p8 = new Perro("Github",3,2.90,false,pp4,Raza.AFGANO);
        Perro p9 = new Perro("Docker",2,3.23,true,pp1,Raza.BERGAMASCO);
        Perro p10 = new Perro("Pepa",1,2.67,true,pp2,Raza.AKITA);

        Perro[] arrayPerros= new Perro[10];
        arrayPerros[0]=p1;
        arrayPerros[1]=p2;
        arrayPerros[2]=p3;
        arrayPerros[3]=p4;
        arrayPerros[4]=p5;
        arrayPerros[5]=p6;
        arrayPerros[6]=p7;
        arrayPerros[7]=p8;
        arrayPerros[8]=p9;
        arrayPerros[9]=p10;

        Concurso c1 = new Concurso(arrayPerros,"Perrigri Andalucia","Sevilla");
        //insertamos cada uno en su raza
        c1.addDog(Raza.BASENJI,p3);
        c1.addDog(Raza.BEAGLE,p7);
        c1.addDog(Raza.AFGANO,p8);
        c1.addDog(Raza.BERGAMASCO,p9);
        c1.addDog(Raza.AKITA,p10);

        //vamos a equivocarnos e intentar meter un perro en una raza distinta
        c1.addDog(Raza.AFGANO,p1);

        //mostramos como queda el Map con todos los perros diferenciacos por la key de raza
        System.out.println(c1.concur);

        //vamos a descalificar 1 perro
        c1.disqyualifyDog(p8);
        System.out.println(c1.concur);
        //vamos a equivocarnos e intentar descalificar 1 perro que no está inscrito
        System.out.println("Vamos a intentar descalificar a p1");
        c1.disqyualifyDog(p1);
        System.out.println(" ");

        //ahora mostramos los perros del mismo dueño
        System.out.println("Vamos a mostrar los perros del propietario pp1");
        c1.ownerDogs(25);
        System.out.println(" ");

        //ahora vamos a sacar por pantalla una lista de perros de una raza ordenados por peso
        System.out.println("Mostramos lista ordenada por peso");
        c1.perrosPorPeso(Raza.AKITA);
        System.out.println(" ");

        //ahora vamos a sacar por pantalla una lista de perros de una raza ordenados por edad
        System.out.println("Mostramos lista ordenada por edad");
        c1.perrosPorEdad(Raza.BEAGLE);
        System.out.println(" ");

        //Ahora cargamos los perros de un fichero ya creado
        System.out.println("Cargamos perros de fichero");
        c1.cargarPerros();
        System.out.println(" ");

        //ahora volcamos los perros que tenemos en un fichero
        System.out.println("Volcamos perros en fichero");
        c1.guardarPerros();







    }
}
