package U2_Tareas_Libro;

import java.util.Scanner;

public class Ejercicio_6_11_PAG_181 {
    public static void main(String[] args) {
        String cadena1= "eikmpqrstuv";
        String cadena2= "pviumterkqs";

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un código");
        String palabra = sc.nextLine();
        String resultado=palabra;
        palabra = palabra.toLowerCase();

        for(int i=0; i<palabra.length();i++){
            char current=palabra.charAt(i);
            if(cadena2.contains(Character.toString(current))){
                int posicion=cadena2.indexOf(current);
                char cod=cadena1.charAt(posicion);
                StringBuilder sb= new StringBuilder(palabra);
                sb.setCharAt(i,cod);
                palabra=sb.toString();
            }
        }

        System.out.println(palabra);
    }
}
