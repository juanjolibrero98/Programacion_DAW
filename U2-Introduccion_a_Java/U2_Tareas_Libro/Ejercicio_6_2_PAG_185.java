package U2_Tareas_Libro;

import java.util.Scanner;

public class Ejercicio_6_2_PAG_185 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la sentencia");
        String sentencia= sc.nextLine();
        String salida=" ";
        boolean comentario=false;
        String aux= "";
        for(int i=0; i<sentencia.length();i++){

            if(i<sentencia.length()-1 && comentario == false && sentencia.charAt(i)=='/' && sentencia.charAt(i+1)=='*'){
                comentario=true;
                aux="";
            }else if (i>0 && comentario && sentencia.charAt(i)=='/' && sentencia.charAt(i-1)=='*'){
                comentario=false;

            }else{
                if(!comentario){
                    System.out.print(sentencia.charAt(i));
                }else{
                     aux = aux + sentencia.charAt(i);
                }
            }

        }
        if(comentario){
            System.out.print(aux);
        }

    }
}
