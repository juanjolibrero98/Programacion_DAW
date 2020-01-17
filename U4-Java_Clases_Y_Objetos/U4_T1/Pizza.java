package U4_Tarea_Entregable_Pizzeria;

import java.util.Arrays;

public class Pizza {

    //atributos

        private Tamanho tamanho;
        private Ingredientes[] listaIngredientes = new Ingredientes[3];
        private int numIngredientes;

    //constructor
        //constructor con el tamaño por defecto de las pizzas
        Pizza(){
            this.tamanho = Tamanho.FAMILIAR;
            anhadirIngrediente(new Ingredientes("Jamon",150));
            anhadirIngrediente(new Ingredientes());
        }

    /**
     *
     * @param mTamanho es el tamaño de la pizza, familiar o mediana
     * @param mListaIngredientes es el array donde guardaremos los ingredientes que tendrá la pizza
     */
        Pizza(Tamanho mTamanho, Ingredientes[] mListaIngredientes){
            numIngredientes=0;
            this.tamanho = mTamanho;
            this.listaIngredientes = mListaIngredientes;
        }

    //metodos

    /**
     *
     * @return devuelve un mensaje diciendo los tamaños que hay para hacer la pizza
     */
    public String mostrarTamanhoPizza(){

        return Tamanho.FAMILIAR+" o "+Tamanho.MEDIANA;
    }

    /**
     *
     * @return devuelve el numero de ingredientes que tiene la pizza
     */
    public int mostrarNumIngredientesPizza(){

        return numIngredientes;
    }

    /**
     *
     * @return devuelve toda la informacion sobre la pizza, el tamaño, y el nombre y kcal del ingrediente
     */
    public String mostrarInfoPizza(){
        String local="Ingredientes: ";
        for (int i = 0; i <listaIngredientes.length ; i++) {
            if(listaIngredientes[i] !=null){
                local+= listaIngredientes[i].getNombre()+ " y "+ listaIngredientes[i].getNumKcalX100()+"KCal";
            }
            local+=",";
        }
        return this.tamanho+" y "+local;
    }

    /**
     *
     * @param ingrediente es el ingrediente a incluir en la pizza
     * @return devuelve  un booleano diciendo si ha sido posible añadir o no el ingrediente
     */
    public boolean anhadirIngrediente(Ingredientes ingrediente){
        boolean esAnhadido;
        if(numIngredientes<3){
            listaIngredientes[numIngredientes] = ingrediente;
            numIngredientes++;
            esAnhadido = true;
        }else {
            esAnhadido = false;
        }


        return esAnhadido;
    }


}
