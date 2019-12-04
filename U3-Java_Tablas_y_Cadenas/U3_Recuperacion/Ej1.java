import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {

    public static float[] mediaVectores(int[] v1, int[] v2){
        float[] resultado;
        if(v1.length>v2.length){
            resultado= new float[v1.length];
        }else {
            resultado= new float[v2.length];
        }
        for(int i=0;i<resultado.length;i++){
            if(i<v1.length && i<v2.length){
                resultado[i]= (float) ((v1[i]+v2[i])/2.0);
            }else if(i>=v1.length){
                resultado[i]=v2[i];
            }else if(i>=v2.length){
                resultado[i]=v1[i];
            }

        }
        return resultado;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el tamaño del vector v1");
        int tam1=sc.nextInt();
        int[] v11= new int[tam1];
        System.out.println("Dime el tamaño del vector v2");
        int tam2=sc.nextInt();
        int[] v22= new int[tam2];

        System.out.println(" ");

        System.out.println("Dime los valores que quieres introducir en el vector v1");
        for(int i=0;i<tam1;i++){
            v11[i]=sc.nextInt();
        }
        System.out.println("Ahora mostraremos los valores que usted ha introducido para ver si son correctos");
        for(int i=0;i<tam1;i++){
            System.out.println(v11[i]);
        }

        System.out.println(" ");

        System.out.println("Dime los valores que quieres introducir en el vector v2");
        for(int i=0;i<tam2;i++){
            v22[i]=sc.nextInt();
        }
        System.out.println("Ahora mostraremos los valores que usted ha introducido para ver si son correctos");
        for(int i=0;i<tam2;i++){
            System.out.println(v22[i]);
        }
        System.out.println(" ");
        System.out.println("A continuacion procederemos a mostrar el ejercicio resuelto");
        System.out.println(Arrays.toString(mediaVectores(v11, v22)));
    }

}
