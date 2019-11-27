import java.util.Arrays;

public class VectoresExamen {

    public  static  String [] unir(String [] v1, String [] v2){
        String [] devuelve = new String[v1.length+v2.length];



        for(int y=0;y<devuelve.length;y++) {
            for (int i = 0; i < v2.length; i++) {
                devuelve[y] += v2[i];


            }
            for (int z = 0; z < v1.length; z++) {
                devuelve[y] += v1[z];
            }
        }



        return devuelve;
    }

   public static String[] rotar(String[] v1, int num_pos) {
       String[] devuelve = new String[v1.length];
        for(int y=0;y<devuelve.length;y++){
           for (int i = num_pos; i < v1.length; i++) {

               devuelve[y] += v1[i];
           }
           for(int z=0;z<num_pos;z++){

               devuelve[y]+=v1[z];
           }
       }
        return devuelve;
    }





  /*  public static void main(String[] args) {
        String[] v11 ={"a","b","c"};
        String[] v22 ={"d","e","f"};
        System.out.println(Arrays.toString(unir(v11, v22)));

        String[] v33={"a","b", "c","d", "e","f"};
      System.out.println(Arrays.toString(rotar(v33, 2)));
    }

   */

}
