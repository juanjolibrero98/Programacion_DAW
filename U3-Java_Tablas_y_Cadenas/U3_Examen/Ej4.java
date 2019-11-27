import java.util.Arrays;

public class Ej4 {

    public static int [] filtraPrimos (int[] enteros){

        int contador=0;
        int primo=0;
        for (int i=0;i<enteros.length;i++){ //recorre los numeros del array enteros
            if(enteros[i]%enteros[i]==0){ //si el numero entre si es 0 entra, para ir directos a los que pueden ser primos
                for(int z=2;z<enteros[i];z++){ //recorre desde el 2 hasta ese numero
                    if(enteros[i]%z==0){ //comprueba todas las divisiones hasta ese numero, si da que alguno el resto es 0, no es primo
                        contador++;
                    }
                }
                if(contador>=1){
                    //siginificaria que no es primo, por lo que no sumamos nada, reseteamos el contador
                    contador=0;
                }else {
                    //significa que es primo, sumamos +1 primo
                    primo++;
                }
            }
        }
        int[] resultado= new int[primo];
        // ahora que sabemos cuantos primos hay, los introduciremos el el array resultado
        for(int y=0;y<primo;y++){
            for (int i=0;i<enteros.length;i++){
                if(enteros[i]%enteros[i]==0){
                    for(int z=2;z<enteros[i];z++){
                        if(enteros[i]%z==0){
                            contador++;
                        }
                    }
                    if(contador>=1){
                        //siginificaria que no es primo, por lo que no sumamos nada, reseteamos el contador
                        contador=0;
                    }else {
                        resultado[y] += enteros[i];
                    }
                }
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] vector={7,457,19,16,23,567,3,5,13};
        System.out.println(Arrays.toString(filtraPrimos(vector)));
    }
}
