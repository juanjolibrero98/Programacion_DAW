import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {

    public static int[] insertarValor(int [] vector, int valor, int pos){
        int[] resultado= new int[vector.length+1];

            for (int i = 0; i < vector.length; i++) {
             if(i<pos-1){
                 resultado[i]+=vector[i];
             }else if (i == pos - 1) {
                    resultado[i] += valor;
             }else  if(i>pos-1) {
                 resultado[i] += vector[i - 1];
             }

            }

        return resultado;
    }

    public static void main(String[] args) {
        int[] vector1 = {1,2,3,4,5};
        int valor1=8;
        int pos1=3;
        System.out.println(Arrays.toString(insertarValor(vector1, valor1, pos1)));
    }
}
