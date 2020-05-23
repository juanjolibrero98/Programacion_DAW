package U9_Tareas;

import java.sql.*;

public class ConexionBD {

    private static Connection connection = null;

    public static Connection getConnection() {

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/classicmodels?user=root&password=root");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return connection;
    }

    public static void close(){
        try{
            connection.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}