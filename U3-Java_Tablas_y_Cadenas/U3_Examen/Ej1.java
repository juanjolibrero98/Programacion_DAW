
import java.util.Scanner;

public class Ej1 {

    public static int maxMatriz(int[][] vector){
        int mayor=0;//ponemos 0 por defecto
        int[][] resultado= new int[vector.length][vector.length];
        for(int i=0;i< vector.length;i++){
            for(int y=0;y<vector[i].length;y++){
                mayor+=vector[0][0];//inicializo que el mayor por defecto es el primer número del array
                if(vector[i][y]>mayor){//si el numero en el que estamos es mayor que el que inicialize se cambiara
                    mayor=0;//si lo encuentra, quitamos el numero anterior y ponemos el nuevo
                    mayor+=vector[i][y];
                }
            }
        }
        return mayor;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número de filas que tendrá nuestro array");
        int filas=sc.nextInt();
        System.out.println("Dime el número de columnas que tendrá nuestro array");
        int colum=sc.nextInt();

        int[][] vectorBidemi = new int[filas][colum];

        for(int i=0;i<vectorBidemi.length-1;i++){
            for(int z=0;z<vectorBidemi[i].length-1;z++){
                vectorBidemi[i][z]+= Math.random()*1000;
            }
        }

        System.out.println("El mayor numero del array que hemos creado es: "+maxMatriz(vectorBidemi));

    }
}
