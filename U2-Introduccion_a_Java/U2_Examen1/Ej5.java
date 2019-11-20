import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca horas");
        int hora=sc.nextInt();
        if(hora<0 || hora>23){
            System.out.println("Error de hora");

        }else {
            System.out.println("Introduzca minutos");
            int minuto=sc.nextInt();
            if(minuto<0 || minuto>59){
                System.out.println("Error de minutos");
            }else {
                System.out.println("Introduzca segundos");
                int segundo=sc.nextInt();
                if(segundo<0 || segundo>59){
                    System.out.println("Error de segundos");
                }else {
                    System.out.println("La hora que usted a introducido es: "+hora+":"+minuto+":"+segundo);
                    System.out.println("Introduzca segundos a incrementar");
                    int incremento=sc.nextInt();

                    System.out.println("Aumentando la hora...");
                    for(int i=0; i<incremento;i++){
                        segundo++;
                        if(segundo>59){
                            minuto++;
                            segundo=0;
                            if(minuto>59) {
                                hora++;
                                minuto=0;
                                if(hora>23) {
                                    hora = 0;
                                    minuto = 0;
                                    segundo = 0;
                                }
                            }
                        }

                        System.out.println(hora+":"+minuto+":"+segundo);
                    }
                }
            }
        }





    }
}
