package U8_T5_Generar_Json_Desde_Java;

import com.google.gson.Gson;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Futbolista> seleccion = new ArrayList<>();

        Futbolista casillas = new Futbolista(1,"Casillas","Real Madrid");
        Futbolista ramos = new Futbolista(15,"Ramos","Real Madrid");
        Futbolista pique = new Futbolista(3, "Pique", "FC Barcelona");
        Futbolista puyol = new Futbolista(5, "Puyol", "FC Barcelona");
        Futbolista capdevila = new Futbolista(11, "Capdevila","Villareal");
        Futbolista xabiAlonso = new Futbolista(14, "Xabi Alonso","Real Madrid");
        Futbolista busquets = new Futbolista(16, "Busquets","FC Barcelona");
        Futbolista xaviHernandez = new Futbolista(8, "Xavi Hernandez","FC Barcelona");
        Futbolista pedrito = new Futbolista(18, "Pedrito", "FC Barcelona");
        Futbolista iniesta = new Futbolista(6, "Iniesta","FC Barcelona");
        Futbolista villa = new Futbolista(7, "Villa","FC Barcelona");

        casillas.getDemarcaciones().add("Portero");
        ramos.getDemarcaciones().add("Lateral derecho");
        ramos.getDemarcaciones().add("Medio centro");
        pique.getDemarcaciones().add("Central");
        puyol.getDemarcaciones().add("Central");
        capdevila.getDemarcaciones().add("Lateral izquierdo");
        xabiAlonso.getDemarcaciones().add("Defensa mediocampo");
        xabiAlonso.getDemarcaciones().add("Mediocampo");
        busquets.getDemarcaciones().add("Defensa mediocampo");
        xaviHernandez.getDemarcaciones().add("Mediocampo");
        pedrito.getDemarcaciones().add("Extremo izquierdo");
        pedrito.getDemarcaciones().add("Falso Extremo");
        iniesta.getDemarcaciones().add("Extremo derecho");
        iniesta.getDemarcaciones().add("Mediocampo");
        villa.getDemarcaciones().add("Delantero centro");

        seleccion.add(casillas);
        seleccion.add(ramos);
        seleccion.add(pique);
        seleccion.add(puyol);
        seleccion.add(capdevila);
        seleccion.add(xabiAlonso);
        seleccion.add(busquets);
        seleccion.add(xaviHernandez);
        seleccion.add(pedrito);
        seleccion.add(iniesta);
        seleccion.add(villa);


        Gson gson = new Gson();
        String json = gson.toJson(seleccion);

        System.out.println(json);
    }
}
