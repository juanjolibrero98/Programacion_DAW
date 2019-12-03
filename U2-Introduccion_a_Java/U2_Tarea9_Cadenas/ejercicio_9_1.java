package U2_Tarea9_Cadenas;

import java.util.Scanner;

public class ejercicio_9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce una palabra");
        String pala1 = sc.nextLine();
        System.out.printf("Introduce otra palabra");
        String pala2 = sc.nextLine();
        if(pala1.length()<pala2.length()){
            System.out.printf("La primera palabra introducida es la mas corta, es decir, esta: "+pala1);

        }else {
            System.out.printf("La segunda palabra introducida es la mas corta, es decir, esta: "+pala2);
        }

    }
}
