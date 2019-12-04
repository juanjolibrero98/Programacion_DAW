import java.util.Arrays;

public class Ej3 {


    public static void main(String[] args) {
        String pal1="hola";
        System.out.println("La palabra inversa y en mayusculas es: "+Arrays.toString(LibreriaCadenasEj3.invertir(pal1)));
        System.out.println("La palabra con las vocales desplazadas es: "+ Arrays.toString(LibreriaCadenasEj3.desplazarVocales(pal1)));
    }

}
