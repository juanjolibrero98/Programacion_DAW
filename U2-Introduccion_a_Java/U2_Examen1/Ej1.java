import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura de los calcetines");
        int altura=sc.nextInt();

        for(int i=0;i<altura;i++){
            if(i==altura-2 || i==altura-1){
                System.out.println("******  ******");

            }else {
                System.out.println("***     ***");

            }
        }
        System.out.println(" ");


    }


}
