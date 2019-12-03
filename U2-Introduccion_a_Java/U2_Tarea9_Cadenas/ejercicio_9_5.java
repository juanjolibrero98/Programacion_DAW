package U2_Tarea9_Cadenas;

import java.util.Scanner;

public class ejercicio_9_5 {
    public static void main(String[] args) {
        String cadena1 = "Javalín,javalón";
        String cadena2 = "javalén,len,len";

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la frase");
        String frase= sc.nextLine();

        if((frase.startsWith(cadena1) && !frase.endsWith(cadena2)) || (!frase.startsWith(cadena1) && frase.endsWith(cadena2))){
            System.out.println("Es del dialecto");

            frase= frase.replaceAll(cadena1,"");
            frase= frase.replaceAll(cadena2, "");
            frase=frase.trim();
            System.out.println(frase);

        }else{
            System.out.println("No es del dialecto");
        }
    }
}
