package Examen_1ºEVA_1ºParcial;

import java.util.Scanner;

public class Ex5 {

    //Dada una cadena mostrar por pantalla la cantidad de vocales que tiene.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba la cadena porfavor");
        String cadena = sc.nextLine();
        String vocalesMin = "aeiou";
        String vocalesMay = "AEIOU";
        int contadorVocales=0;
        for(int y=0;y<vocalesMin.length();y++){
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == vocalesMin.charAt(y) || cadena.charAt(i) == vocalesMay.charAt(y) ) {
                    contadorVocales++;
                }
            }
        }
        System.out.println("La cantidad de vocales es "+contadorVocales);
    }
}
