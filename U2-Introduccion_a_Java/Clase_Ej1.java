package U2_Practica_Entregable;

import java.util.Scanner;

public class Clase_Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la nota del primer control");
        double nota1=sc.nextInt();
        System.out.println("Dime la nota del segundo control");
        double nota2=sc.nextInt();
        double media=0;
        double mediaRecu=0;
        String recupera= new String();



        if(((nota1+nota2)/2) >= 5){
            media = media + ((nota1+nota2)/2);
            if(media>=5 && media<6){
                System.out.println("Tu nota de Programación es un "+media+" - Suficiente");
            }else if(media>=6 && media<7){
                System.out.println("Tu nota de Programación es un "+media+" - Bien");
            }else if(media>=7 && media<9){
                System.out.println("Tu nota de Programación es un "+media+" - Notable");
            }else {
                System.out.println("Tu nota de Programación es un "+media+" - Sobresaliente");
            }
        }else {
            System.out.println("¿Cual ha sido el resultado de la recuperacion?");
            System.out.println("Responde con apto/no apto");
            recupera = sc.nextLine();
            recupera= sc.nextLine();
            recupera=recupera.toLowerCase();

            if(recupera.equals("apto")){
                System.out.println("Tu nota de Programación es un 5 - Suficiente");
            }else if(recupera.equals("no apto")){
                mediaRecu = mediaRecu + ((nota1+nota2)/2);
                System.out.println("Tu nota de Programación es un "+mediaRecu+" - Suspenso");
            }
        }
    }
}
