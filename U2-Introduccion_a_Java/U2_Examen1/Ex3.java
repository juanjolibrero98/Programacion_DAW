package Examen_1ºEVA_1ºParcial;

import java.util.Scanner;

public class Ex3 {

    /*Realiza un programa que diga los dígitos que aparecen y los que no aparecen en un
número entero introducido por teclado. El orden es el que se muestra en
los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
largos.

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero positivo");
        long num= sc.nextLong();
        String numString= Long.toString(num);
        String cadenaNumeros = "0123456789";
        String aparece="";
        String noAparece="";
        for(int x=0; x<cadenaNumeros.length();x++) {
            for (int i = 0; i < numString.length(); i++) {
                if (numString.charAt(i) == cadenaNumeros.charAt(x)){

                    if(!aparece.contains(numString)){
                        aparece = aparece + numString.charAt(i);
                    }

                }else if(cadenaNumeros.compareTo(numString) != numString.charAt(i)){
                    noAparece = noAparece + cadenaNumeros.charAt(i);
                }
            }
        }
        System.out.println("Digitos que aparecen "+aparece);
        System.out.println("Digitos que no aparecen "+noAparece);
    }
}
