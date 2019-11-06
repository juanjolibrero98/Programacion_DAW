package Examen_1ºEVA_1ºParcial;

import java.util.Scanner;

public class Ex2 {

    /*Escribe un programa que permita partir un número introducido por teclado en dos
partes. Las posiciones se cuentan de izquierda a derecha empezando por
el 1. Suponemos que el usuario introduce correctamente los datos, es decir, el número
introducido tiene dos dígitos como mínimo y la posición en la que
se parte el número está entre 2 y la longitud del número. No se permite en este
ejercicio el uso de funciones de manejo de String (por ej. para extraer
subcadenas dentro de una cadena).

     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número positivo entero");
        long num = sc.nextLong();


        System.out.println("Introduce la posición a partir de la cual quiere partir el número");
        int partir = sc.nextInt();
    }
}
