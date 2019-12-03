package U3_Entregable_1920;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {


    static int[][] media(int[][] tabla){
        int[][] resultado= new int[tabla.length+1][tabla.length+1];
        int sumaTotalFila=0;
        int sumaTotalColum=0;
        int sumaFila=0;
        int sumaColum=0;
        for(int i=0;i<tabla.length;i++){
            for(int z=0;z<tabla.length;z++){
                resultado[i][z] += tabla[i][z];
                sumaFila+= tabla[i][z];
                sumaTotalFila+= tabla[i][z];
            }

            resultado[i][tabla.length]+=(sumaFila/tabla.length);
            sumaFila=0;

        }

        for(int i=0;i<tabla.length;i++){
            for(int z=0;z<tabla.length;z++){
                resultado[resultado.length-1][z]+= (resultado[i][z]/tabla.length);
                sumaTotalColum+=resultado[i][z];
            }
        }
        resultado[resultado.length-1][resultado.length-1]+=(sumaTotalColum+sumaTotalFila)/20;

        return resultado;
    }

    public static void main(String[] args) {

        System.out.println("Prueba de la media");
        int[][] tabla = new int[4][5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla[i].length;j++){
                System.out.println("Introduce el numero de la posicion "+i+" "+j);
                tabla[i][j]+=sc.nextInt();
            }

        }
        System.out.println(Arrays.deepToString(media(tabla)));

        /*
        int[][] tabla = new int[4][5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla[i].length;j++){
                System.out.println("Introduce el numero de la posicion "+i+" "+j);
                tabla[i][j]+=sc.nextInt();
            }

        }
        for(int i=0;i<tabla.length;i++){
            System.out.print("(");
            for(int j=0;j<tabla[i].length;j++){
                System.out.print(tabla[i][j]);
                if(tabla[i].length==j+1){
                    System.out.print("");
                }else {
                    System.out.print(",");
                }
            }
            System.out.print(")");
            System.out.println("");
        }
        int sumaJ=0;
        int [][] tablAmpliada = new int[5][6];
        for(int i=0;i<tablAmpliada.length;i++){
            for(int j=0;j<tablAmpliada[i].length;j++){
                if(j==6){
                    tablAmpliada[i][j]+=sumaJ/tablAmpliada.length;
                }
                tablAmpliada[i][j]+=tabla[i][j];
                sumaJ+=tabla[i][j];
            }
            sumaJ=0;

        }

         */
    }


}
