package U4_Tarea_Entregable_Pizzeria;

public class Main {

    public static void main(String[] args) {

        Ingredientes gr1 = new Ingredientes();//es por defecto queso
        Ingredientes gr2 = new Ingredientes("Atun",130);
        Ingredientes gr3 = new Ingredientes("Peperonni",340);

        Ingredientes[] newIngre = {gr1};
        Pizza p1 = new Pizza();//por defecto, con ingrdientes, queso y jamon
        Pizza p2 = new Pizza(Tamanho.MEDIANA, newIngre);

        //piza por defecto
        System.out.println("Los tamaños disponibles para la pizza son: "+p1.mostrarTamanhoPizza());
        System.out.println("La piza p tiene actualmente "+p1.mostrarNumIngredientesPizza()+" ingredientes");
        System.out.println(p1.anhadirIngrediente(gr2));//añadimos un ingrediente a lapizza predefinida, ahora hay 3 ingredientes
        System.out.println(p1.anhadirIngrediente(gr3));//da error porque ya hay 3 ingredientes
        System.out.println("La info de la pizza es: "+p1.mostrarInfoPizza());

        System.out.println(" ");
        //pizza creada
        System.out.println("Los tamaños disponibles para la pizza son: "+p2.mostrarTamanhoPizza());
        System.out.println("La piza p2 tiene actualmente "+p2.mostrarNumIngredientesPizza()+" ingredientes");
        System.out.println(p2.anhadirIngrediente(gr2));//añadimos un ingrediente a lapizza creada, ahora hay 2 ingredientes

    }
}
