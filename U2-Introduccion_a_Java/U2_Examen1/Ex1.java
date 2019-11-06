package Examen_1ºEVA_1ºParcial;

import java.util.Scanner;

public class Ex1 {
    /*Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han encargado
realizar un programa que pinte un 8 por pantalla usando la letra M. Se pide al usuario
la altura, que debe ser un número entero impar mayor o igual que 5. Si el número
introducido no es correcto, el programa deberá mostrar un mensaje de error. A
continuación, se muestran algunos ejemplos. La anchura de la figura siempre será de 6
caracteres.

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la altura de la figura");
        System.out.println("Tiene que ser entero impar mayor o igual a 5");
        int altura = sc.nextInt();
        int anchura=6;
        if(altura%2!=0 && altura>=5){
            for(int i=0;i<altura;i++){

                for(int y=0;y<anchura;y++){
                    if(i==0 || i==altura-1 || y==0 || y==anchura-1 || i==altura/2){
                        System.out.print("M");
                    }else{
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }


        }else {
            System.out.println("Error, has introducido un número diferente");
        }

    }
}
