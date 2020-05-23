package U9_Tareas;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ADClassicModels {

    public ADClassicModels() {
    }

    public List<Employee> getEmpleados(){
        List<Employee> empleadoss = new ArrayList<>();

        try {
            Connection c = ConexionBD.getConnection();
            Statement statement = c.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs = statement.executeQuery("select * from employees");

            while (rs.next()){

                int employeeNumber = rs.getInt("employeeNumber");
                String lastName = rs.getString("lastName");
                String firstName = rs.getString("firstName");
                String extension = rs.getString("extension");
                String email = rs.getString("email");
                String officeCode = rs.getString("officeCode");
                int reportsTo = rs.getInt("reportsTo");
                String jobTitle = rs.getString("jobTitle");

                Employee employee = new Employee(employeeNumber,lastName,firstName,extension,email,officeCode,reportsTo,jobTitle);
                empleadoss.add(employee);

            }

        } catch (SQLException ex){
            ex.printStackTrace();
        }

        return empleadoss;
    }

    public List<Office> getOffices(){
        List<Office> ofices = new ArrayList<>();

        try {
            Connection c = ConexionBD.getConnection();
            Statement statement = c.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs = statement.executeQuery("select * from offices");

            while (rs.next()){

                String officeCode = rs.getString("officeCode");
                String city = rs.getString("city");
                String phone = rs.getString("phone");
                String addressLine1 = rs.getString("addressLine1");
                String addressLine2 = rs.getString("addressLine2");
                String state = rs.getString("state");
                String country = rs.getString("country");
                String postalCode = rs.getString("postalCode");
                String territory = rs.getString("territory");

                Office office = new Office(officeCode,city,phone,addressLine1,addressLine2,state,country,postalCode,territory);
                ofices.add(office);

            }

        } catch (SQLException ex){
            ex.printStackTrace();
        }

        return ofices;
    }

}