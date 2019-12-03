package U3_Entregable_1920;

import java.util.Arrays;

public class Ej4 {

    public static String convierteArrayEnString(int[] a){
        String devuelve="";
        for(int i=0;i<a.length;i++){
            devuelve+=a[i];
        }
        return "("+devuelve+")";
    }

    public static void main(String[] args) {
        int[] a = {5,6,2,4};
        System.out.println(convierteArrayEnString(a));
    }
}
