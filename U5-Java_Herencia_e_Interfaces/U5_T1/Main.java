package U5_Tarea1_Entregable;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Coche[] coche = new Coche[3];
        Coche c1 = new Coche("Peugeot 308",5,"1234T",2014,ColorVehiculosTerrestres.VERDE);
        Coche c2 = new Coche("Nissan GT",2,"3214W",2017,ColorVehiculosTerrestres.AMARILLO);
        Coche c3 = new Coche("Toyota Land Cruiser",8,"4532A",2020,ColorVehiculosTerrestres.AZUL);
        coche[0] = c1;
        coche[1] = c2;
        coche[2] = c3;
        System.out.println("Ordenamos los coches segun la matricula");
        Arrays.sort(coche);
        System.out.println(Arrays.deepToString(coche));
        System.out.println(" ");
        Arrays.sort(coche, new Comparator<Coche>() {
            @Override
            public int compare(Coche coche, Coche t1) {
                return coche.getAnhoFabrica()-t1.getAnhoFabrica();
            }
        });
        System.out.println("Ordenamos los coches segun el año de fabricacion");
        System.out.println(Arrays.deepToString(coche));
        System.out.println(" ");
        System.out.println("Comparamos segun la matricula con el equals los coches c1 y c2");
        System.out.println("¿Va la matricula del coche c1 antes que la del c2? "+c1.equals(c2));
        System.out.println(" ");
        System.out.println("Añadimos 3 pasajeros al coche 1, vamos a mostrar la informacion de ese coche");
        c1.transportar(3);
        System.out.println(c1.toString());
        System.out.println(" ");


        Motocicleta[] moto = new Motocicleta[3];
        Motocicleta m1 = new Motocicleta("Yahama GT",2,"6452E",2013,ColorVehiculosTerrestres.ROJO);
        Motocicleta m2 = new Motocicleta("Kawasaki 345",2,"2134J",2014,ColorVehiculosTerrestres.AMARILLO);
        Motocicleta m3 = new Motocicleta("Peugeot 123",2,"1423L",2012,ColorVehiculosTerrestres.VERDE);
        moto[0] = m1;
        moto[1] = m2;
        moto[2] = m3;
        System.out.println("Ordenamos las motos segun la matricula");
        Arrays.sort(moto);
        System.out.println(Arrays.deepToString(moto));
        System.out.println(" ");
        Arrays.sort(moto, new Comparator<Motocicleta>() {
            @Override
            public int compare(Motocicleta motocicleta, Motocicleta t1) {
                return motocicleta.getAnhoFabrica()-t1.getAnhoFabrica();
            }
        });
        System.out.println("Ordenamos las motos segun el año de fabricacion");
        System.out.println(Arrays.deepToString(moto));
        System.out.println(" ");
        System.out.println("Comparamos segun la matricula con el equals las motos m1 y m2");
        System.out.println("¿Va la matricula de la moto m1 antes que la de la m2? "+m1.equals(m2));
        System.out.println(" ");
        System.out.println("Añadimos 1 pasajeros a la moto 1, vamos a mostrar la informacion de esa moto");
        m1.transportar(1);
        System.out.println(m1.toString());
        System.out.println(" ");



        Helicoptero h1 = new Helicoptero("Kamov Ka-52",15,800,"UP-A200I");
        System.out.println("Añadimos 9 pasajeros al h1, vamos a mostrar la info");
        h1.transportar(9);
        System.out.println(h1.toString());
        System.out.println(" ");
        System.out.println(h1.tipoAeronave());

        Avioneta a1 = new Avioneta("Boeing F-18",100,2000,"UP-A300I");
        System.out.println(a1.tipoAeronave());


    }
}
