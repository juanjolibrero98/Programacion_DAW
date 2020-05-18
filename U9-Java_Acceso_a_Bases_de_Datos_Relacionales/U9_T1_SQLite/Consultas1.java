package U9_Tareas;

import java.sql.*;

public class Consultas1 {
    public static void main(String[] args) {

        Connection connection = null;

        try {
            //crear conexion a base datos
            connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);//tiempo de respuesta

            //Listado de los "customers" que no tienen "state" (el campo "state" es nulo).
            ResultSet rs = statement.executeQuery("select * from customers where state is null");
            while (rs.next()){
                System.out.println("Nombre de cliente -> " + rs.getString("customername"));
            }

            //Listado de los "payments" cuyo "amount" sea mayor de 30.000.
            rs = statement.executeQuery("select * from payments where amount > 30000");
            while (rs.next()){
                System.out.println("Pago -> " + rs.getInt("amount"));
            }

            //Listado de los "employees" que dan cuenta (reportsTo) al empleado con Id = 1143
            rs = statement.executeQuery("select * from employees where reportsto = 1143");
            while (rs.next()){
                System.out.println("Nombre empleado -> " + rs.getString("firstname") + " " + rs.getString("lastname"));
            }

        } catch (SQLException e){
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null){
                    connection.close();
                }
            } catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }

    }
}

