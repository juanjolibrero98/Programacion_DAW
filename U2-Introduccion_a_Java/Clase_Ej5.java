package U2_Practica_Entregable;

import java.util.Scanner;

public class Clase_Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la frase");
        String cadena= sc.nextLine();
        System.out.println("Introduce la altura");
        int altura= sc.nextInt();

        for(int i=0;i<=11;i++){//filas hori
            for(int j=0;j<=11;j++){//colum verti
                if(i==11/2 || j==11/2 || (i==(11/2)-1 || j==(11/2)-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}
