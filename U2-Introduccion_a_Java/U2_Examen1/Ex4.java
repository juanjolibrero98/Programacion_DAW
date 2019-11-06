package Examen_1ºEVA_1ºParcial;

import com.sun.jdi.VMMismatchException;

import java.util.Scanner;
import java.util.SortedMap;

public class Ex4 {

    /*Realiza un programa que calcule el máximo, el mínimo y la media de una serie de
números enteros positivos introducidos por teclado. El programa terminará
cuando el usuario introduzca un número primo. Este último número no se tendrá en
cuenta en los cálculos. El programa debe indicar también cuántos
números ha introducido el usuario (sin contar el primo que sirve para salir).

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vaya introduciendo numeros enteros positivos, para terminar introduce un número primo");
        int maximo=0;
        long minimo=1000000000;
        double media;
        double sumaTotal=0;
        double numTotal=-1;//empieza en -1 debido a que cuando ponga un número primo para salir tambien se contará, poniendo esto evitaremos que salga ese numero en eo contador
        boolean primo=true;


        do{
           int num= sc.nextInt();
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primo= false;
                    break;

                }else{
                    primo=true;
                }
            }
           numTotal++;
            if(!primo) {
                if(num>maximo){
                    maximo=num;
                }else if(num<minimo){
                    minimo=num;
                }
            }

            if(!primo) {
                sumaTotal = sumaTotal + num;
            }

        }while(!primo);
        System.out.println("Ha introducido "+numTotal+" de números no primos");
        System.out.println("El número máximo es "+maximo);
        System.out.println("El número mínimo es "+minimo);
        media =sumaTotal/numTotal;
        System.out.println("La media es "+media);
    }
}
