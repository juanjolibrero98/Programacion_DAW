package U3_Entregable_1920;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
lo que se especifica en los comentarios:

public int[] filtraCon7(int x[]) // Devuelve un array con todos los números
                                 // que contienen el 7 (por ej. 7, 27, 782)
                                 // que se encuentren en otro array que se
                                 // pasa como parámetro. El tamaño del array
                                 // que se devuelve será menor o igual al
                                // que se pasa como parámetro.

Utiliza esta función en un programa para comprobar que funcionan bien. Para
que el ejercicio resulte más fácil, las repeticiones de números que contienen
7 se conservan; es decir, si en el array x el número 875 se repite 3 veces, en
el array devuelto también estará repetido 3 veces. Si no existe ningún número
que contiene 7 en el array x, se devuelve un array con el número -1 como único
elemento.
 */


public class Ej3 {

    static public int[] filtraCon7(int x[]){
        Arrays.toString(x);
        String [] nuevoArray = new String[x.length];
        for(int i=0;i<x.length;i++){
            nuevoArray[i]+=x[i];
        }
        int contador=0;
        int numero=0;
        int[] arrayDevuelve= new int[contador];
        for(int i=0;i<nuevoArray.length;i++){
            if(nuevoArray[i].contains("7")){
                contador++;
                numero += Integer.parseInt(nuevoArray[i]);
                arrayDevuelve [i] += numero;
            }else {
                arrayDevuelve[i]+=-1;
            }
        }
        return arrayDevuelve;
    }


    public static void main(String[] args) {

        int [] x = {7,24,874,89,17,7};
        System.out.println(filtraCon7(x));

    }
}
