import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero positivo: ");
        int num=sc.nextInt();
        int contador=0;
        for(int i=num;i<num+5;i++){
            for(int z=1;z<=i;z++){
                if(i%z==0 ){
                    contador++;//cada vez que encuentra un resto que sea 0 al dividir los 5 numeros entre los 100 primeros suma 1
                }
            }
            if(contador>=3){//pongo que tiene que ser como minimo 3 ya que  al hacer lo de arriba, meto en el contador la division entre el 1 y el mismo numero que eso siempre el resto es 0, por lo que para que no sea primo tiene que encontrar otro con resto 0
                System.out.println(i+" no es primo");
            }else {
                System.out.println(i+" es primo");
            }
            contador=0;//reseteo el contador para que cuando pase al siguiente numero(i) empieze el contador de nuevo
        }
    }
}
