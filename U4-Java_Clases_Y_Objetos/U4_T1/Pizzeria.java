package U4_Tarea_Entregable_Pizzeria;

public class Pizzeria {

    //atributos
    Pizza pizzas;
    Pedidos[] pedido;
    Ingredientes ingrediente;
    private int numPedido;

    //constructor
    Pizzeria(){
        pedido = new Pedidos[5];
        this.numPedido=0;
    }


    /**
     *
     * @param numPed para darle el epsacio del numero de pedidos que puede llegar a tener la pizzeria
     */
    Pizzeria(int numPed){
        pedido = new Pedidos[numPed];
        this.numPedido=0;
    }

    //metodos

    /**
     *
     * @return devuelve el numero de pedidos que hay
     */
    public boolean anhadirPedidos(){
        boolean addPedido;
        if(pedido.length < 5){
            numPedido++;
            addPedido=true;
        }else {
            addPedido=false;
        }
        return addPedido;
    }


    public Pedidos[] getPedido() {
        return pedido;
    }

    public int getNumPedido() {
        return numPedido;
    }
}
