package U2_Tareas_Libro;

import java.util.Scanner;

public class Ejercicio_6_1_PAG_185 {
    public static void main(String[] args) {
        //jugador a escribe palabra
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una palabra jugador A");
        String pala1=sc.nextLine();
        System.out.println("La palabra secreta que ha escrito el jugador A es: "+pala1);
        //mostrar "_" tantos como letras ahiga en la pala1
        String pala2="";
        for(int i=0;i < pala1.length();i++){
            pala2 = pala2 + "_ ";
        }
        System.out.println(" ");
        System.out.println("La cadena  es: "+pala2);

        //jugador B intenta acertarla letra a letra
        //las acertadas se mostraran por pantalla y las que no con _
        System.out.println("JUgador B es tu turno de intentar acertar la palabra");
        for(int b=0;b<pala1.length();b++) {
            System.out.println("Caracter de la posición" + b);
             pala2 = sc.nextLine();

            if (pala1.contains(pala2)) {
                pala2.replace('_',pala1.charAt(b));

            }
        }
        System.out.println(pala2);

    }
}
