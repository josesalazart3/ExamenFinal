/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umg.parcialfinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Parcialfinal {
    public static void main(String[] args) {
        ConfiguracionBaseDatos configuracion = new ConfiguracionBaseDatos();

        try {
            Connection connection = configuracion.getConnection();

           
            String consulta = "INSERT INTO Estudiante(carnet, nombre, edad) VALUES (?, ?, ?)";
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(consulta)) {
                
                preparedStatement.setString(1, "123456"); 
                preparedStatement.setString(2, "Juan Pérez"); 
                preparedStatement.setInt(3, 25); 

                
                preparedStatement.executeUpdate();
            }

            System.out.println("Inserción exitosa.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
