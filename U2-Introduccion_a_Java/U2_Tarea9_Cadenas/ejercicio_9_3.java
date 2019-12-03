package U2_Tarea9_Cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_9_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer jugador, instroduce una contraseña");
        String contra= sc.nextLine();

        System.out.println("Segundo jugador, te toca intentar acertarla, te voy a dar un par de pistas");
        System.out.println("La longitud de la contraseña es de: "+contra.length());
        System.out.println("La primera letra de la contraseña es: "+contra.charAt(0));
        System.out.println("La última letra de la contraseña es: "+contra.charAt(contra.length()-1));

        System.out.println(" ");

        System.out.println("Ahora te toca intentar acertarla, tienes 1 intento");
        String intento= sc.nextLine();

        //PARA EL COMPARETO, lo de <0, >0, =0, significa que si es =0 es ACeRTASTE
        //>0 significa que la contra es mayor que el intento lexicamente
        //<0 al reves
        if(contra.equals(intento)){
            System.out.println("Acertaste");
        }else if(intento.compareTo(contra)<0){
            System.out.println("Tu palabra es mayor alfabeticamente que la contraseña");
        }else{
            System.out.println("Tu palabra es menor alfabeticamente que la contraseña");
        }
    }
}
