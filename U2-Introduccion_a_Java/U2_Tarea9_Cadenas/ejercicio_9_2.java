package U2_Tarea9_Cadenas;

import java.util.Scanner;

public class ejercicio_9_2 {
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
        if(contra.equals(intento)){
            System.out.println("Acertaste");
        }else {
            System.out.println("Fallaste");
        }
    }
}
