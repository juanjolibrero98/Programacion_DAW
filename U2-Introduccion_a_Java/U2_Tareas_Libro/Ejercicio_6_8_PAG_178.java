package U2_Tareas_Libro;

import java.util.Scanner;

public class Ejercicio_6_8_PAG_178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una frase");
        String frase= sc.nextLine();
        boolean esPalindromo=true;
        frase= frase.replaceAll(" ","");
        for(int i=0; i<frase.length()/2;i++){
            if(frase.charAt(i) == frase.charAt(frase.length()-1-i)){
                esPalindromo=false;
                break;
            }
            if(esPalindromo){
                System.out.println("Es palíndromo la frase");
            }else {
                System.out.println("No es palíndromo la frase");
            }
        }
    }
}
