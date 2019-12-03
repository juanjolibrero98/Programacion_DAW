package U2_Tarea9_Cadenas;

import java.util.Scanner;

public class ejercicio_9_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una frase");
        String frase= sc.nextLine();

        if(frase.charAt(frase.length()/2) == ' '){
            System.out.println("El caracter central es un espacio");
        }else {
            System.out.println("El caracter central no es un espacio");
        }
    }
}
