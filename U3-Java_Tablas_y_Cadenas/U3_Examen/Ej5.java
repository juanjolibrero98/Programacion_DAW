import java.util.Arrays;


public class Ej5 {
    public static void main(String[] args) {
        String[] v11 ={"a","b","c"};
        String[] v22 ={"d","e","f"};
        System.out.println(Arrays.toString(VectoresExamen.unir(v11, v22)));

        String[] v33={"a","b", "c","d", "e","f"};
        System.out.println(Arrays.toString(VectoresExamen.rotar(v33, 2)));
    }
}
