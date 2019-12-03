package U2_Tareas_Libro;

import java.util.Scanner;

public class Ejercicio_6_10_PAG_180 {
    public static void main(String[] args) {

        String cadena1= "eikmpqrstuv";
        String cadena2= "pviumterkqs";

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una palabra");
        String palabra = sc.nextLine();
        String resultado=palabra;
        palabra = palabra.toLowerCase();
        /*
        for(int p=0; p<palabra.length();p++){
            for(int c=0;c<cadena1.length();c++){
                if(palabra.charAt(p)==cadena1.charAt(c)){
                    resultado=resultado.replace(palabra.charAt(p),cadena2.charAt(c));
                }
            }
        }
        */


        for(int i=0; i<palabra.length();i++){
            char current=palabra.charAt(i);
            if(cadena1.contains(Character.toString(current))){
                int posicion=cadena1.indexOf(current);
                char cod=cadena2.charAt(posicion);
                StringBuilder sb= new StringBuilder(palabra);
                sb.setCharAt(i,cod);
                palabra=sb.toString();
            }
        }


        System.out.println(resultado);
        System.out.println(palabra);

    }
}
