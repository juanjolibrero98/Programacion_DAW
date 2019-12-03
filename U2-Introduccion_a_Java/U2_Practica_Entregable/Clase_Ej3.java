package U2_Practica_Entregable;

import java.util.Scanner;

public class Clase_Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número entero positivo");
        int num = sc.nextInt();

        String resto="";
                 do{
              if(num%2==0){
                  resto= resto + 0;
               num= num/2;

              }else{
                  resto = resto + 1;
                  num= num/2;
              }

          }while(num>=2);
          resto = resto +1;//porque cuando llegamos a la ultima division como en el ejemplo que pongo abajo, la ultima siempre es 1 en el dividendo
        //entonces hay que añadirlo
         /*
        17/2
         1 8/2
         0  4/2
            0 2/2
            0 1

            10001
                    */
        System.out.println("El número "+num+" pasado a binario es: "+resto);





    }
}
