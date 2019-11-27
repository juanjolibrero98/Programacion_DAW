import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca sus números favoritos");
        String num1=sc.next();
        String num2=sc.next();
        String num3=sc.next();

        sc.nextLine();//salto para que coja el string loteria y no se quede vacio

        System.out.println("Introduzca el número de la lotería");
        String loteria=sc.nextLine();
        int contador=0;//cuenta cuantos de num1,num2 o num3 hay en el string loteria
        String numero="";//para introducir aqui cada digito
        for(int i=0;i<loteria.length();i++){
            numero+=loteria.charAt(i);//introduce el caracter de la posicion i en numero

            if((numero.equals(num1)) || (numero.equals(num2)) || (numero.equals(num3))){  //compara cada digito con cada numero
                contador++;
            }
            numero=""; //cuando acaba de comprobar ese numero, lo reseteamos para que pueda cojer el siguiente digito y no se acumule
        }
        if(contador>loteria.length()/2){ //si hay mas numero de num1,num2 o num3 en el de la loteria que la media del total de ltoeria.length
            System.out.println("Ese número le va a dar suerte");
        }else {
            System.out.println("Ese número no le va a dar suerte");
        }
    }
}
