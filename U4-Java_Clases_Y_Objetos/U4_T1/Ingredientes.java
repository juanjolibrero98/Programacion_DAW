package U4_Tarea_Entregable_Pizzeria;

public class Ingredientes {

    //atributos

    private String nombre;
    private int numKcalX100;

    //constructor
        //constructor para cuando no se indique el tipo e ingrediente
        Ingredientes(){
            this.nombre = "Queso";
            this.numKcalX100 = 250;
        }

    /**
     *
     * @param mNombre es el nombre del ingrediente
     * @param mNumKcalX100 son las calorias que tiene el ingrediente por cada 100gr del producto
     */
        Ingredientes(String mNombre, int mNumKcalX100){
                this.nombre = mNombre;
                this.numKcalX100 = mNumKcalX100;
        }

        //metodos

    /**
     *
     * @return devuelve el nombre del alimento
     */
    public String getNombre() {

        return nombre;
    }

    /**
     *
     * @param nombre el nombre que quiere darle al nuevo alimetno ,para sustituirlo
     */
    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    /**
     *
     * @return devuelve el numero de kcal que tiene el ingrediente por cada 100gr
     */
    public int getNumKcalX100() {

        return numKcalX100;
    }

    /**
     *
     * @param numKcalX100 para cambiar el numero de kcal de ese ingrediente
     */
    public void setNumKcalX100(int numKcalX100) {

        this.numKcalX100 = numKcalX100;
    }
}
