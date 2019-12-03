package U2_Practica_Entregable;

import java.util.Scanner;

public class Clase_Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la altura de la figura");
        int altura= sc.nextInt();
        if(altura%2!=0 && altura>=3){
            //filas horizon
            for(int x=0;x<(altura/2)+1;x++){
                //columnas verti
                for(int y=0;y<(altura/2)-x;y++){

                        System.out.print(" ");

                }
                System.out.println(".     .");//5 espacios
            }

            //filas horizon
            for(int x=0;x<(altura/2);x++){
                //columnas verti
                for(int y=0;y<x+1;y++){

                    System.out.print(" ");

                }
                System.out.println(".     .");//5 espacios
            }


        }else{
            System.out.println("Error, ha introducido un numero par o menor que 3");
        }
    }
}



