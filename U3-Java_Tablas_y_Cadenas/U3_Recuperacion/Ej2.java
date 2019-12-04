import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la columna donde quieres que se encuentre la torre");
        String columPos=sc.next();
        System.out.println("Introduzca la fila donde quieres que se encuentre la torre");
        int filaPos=sc.nextInt();

        System.out.println("La torre puede moverse a las siguientes posiciones verticalmente");
        for(int i=1;i<=8;i++){//tamaño del ajedrez
            if(i==filaPos){
                System.out.print(" ");
            }else {
                System.out.print(" "+columPos + i+" ");
            }
        }

        System.out.println(" ");
        System.out.println("la torre puede moverse a las siguientes posiciones horizontalmente");
        String[] cadena= {"a","b","c","d","e","f","g","h",};
        for(int i=0;i<cadena.length;i++){
                if(columPos == "a"){
                    System.out.print(" ");
                }else if(columPos == "b") {
                    System.out.print(" ");
                }else if(columPos == "c") {
                    System.out.print(" ");
                }else if(columPos == "d") {
                    System.out.print(" ");
                }else if(columPos == "e") {
                    System.out.print(" ");
                }else if(columPos == "f") {
                    System.out.print(" ");
                }else if(columPos == "g") {
                    System.out.print(" ");
                }else if(columPos == "h") {
                    System.out.print(" ");
                }else {
                        System.out.print(" "+cadena[i]+filaPos+" ");
                }


        }
    }
}
