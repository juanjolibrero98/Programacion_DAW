package U3_Entregable_1920;

public class Ej5 {

    public static int aleatorioDeArray (int[] a){
        int numAle = (int) (Math.random()*a.length);

       return a[numAle];
    }


    public static void main(String[] args) {
        int[] a = {111, 222, 333, 444};
        int [] b = {52, 37};
        System.out.println(aleatorioDeArray(a));
        System.out.println(" ");
        System.out.println(aleatorioDeArray(b));
    }
}
