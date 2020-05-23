package U9_Tareas;
import java.sql.Connection;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> empleados = new ArrayList<>();
        ArrayList<Office> ofice = new ArrayList<>();

        ADClassicModels adClassicModels = new ADClassicModels();
        empleados = (ArrayList<Employee>) adClassicModels.getEmpleados();
        ofice = (ArrayList<Office>) adClassicModels.getOffices();


        System.out.println(empleados);
        System.out.println(ofice);

        ConexionBD.close();

    }
}
