package U3_Entregable_1920;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ej1 {



    public static void main(String[] args) {

        int[] mesas = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<mesas.length;i++){

               mesas[i]+= Math.floor(Math.random()*4);

        }


        System.out.println("Mostraré el ejercicio a continuación");
        for(int i=0;i<mesas.length;i++){
                System.out.print(mesas[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Como puedes observar hay 10 mesas y el número en cada posición indica el numero de comersales que hay en cada una");
        int comersales;
        do {
            System.out.println("¿Cuantos son? (Introduzca -1 para salir del programa");
           comersales = sc.nextInt();
           if(comersales>4){
               System.out.println("Lo siento, no admitimos grupos de "+comersales+", haga grupos de 4 personas");
           }else {
               for(int i=0;i<mesas.length;i++) {
                   if (mesas[i] == 0) {
                       System.out.println("Por favor, siéntense en la mesa número " + i);
                       mesas[i] += comersales;
                   }
               }
               for(int i=0;i<mesas.length;i++){
                   if(mesas[i]==1 && 1+comersales<=4){
                       System.out.println("Por favor, siéntense en la mesa número "+i);
                       mesas[i]+=comersales;
                   }else if(mesas[i]==2 && 2+comersales<=4){
                       System.out.println("Por favor, siéntense en la mesa número "+i);
                       mesas[i]+=comersales;
                   }else if(mesas[i]==3 && 3+comersales<=4){
                       System.out.println("Por favor, siéntense en la mesa número "+i);
                       mesas[i]+=comersales;
                   }else {
                       System.out.println("Lo siento, en estos momentos no queda sitio");
                   }
               }
           }
        }while(comersales!=-1);
        System.out.println("Gracias. Hasta pronto.");
    }
}
