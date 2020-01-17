package U4_Tarea_Entregable_Pizzeria;

import java.util.Calendar;

public class Pedidos {
    //atributos
    Pizza pizza;
    private int numPedidos;

    //constructor

    /**
     *
     * @param mPizza para indicar que pizza quiere pedir
     */
    Pedidos(Pizza mPizza){
        this.pizza = mPizza;
        Calendar horaExacta = Calendar.getInstance();
        this.numPedidos=0;
    }

    //metodos

    /**
     *
     * @return devuelve la pizza pedida
     */
    public Pizza getPizza() {

        return pizza;
    }

    /**
     *
     * @param pizza para cambiar el pedido de la pizza
     */
    public void setPizza(Pizza pizza) {

        this.pizza = pizza;
    }






}
