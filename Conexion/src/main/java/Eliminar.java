
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import Conexion.Conexion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class Eliminar {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            // Crear conexion con base de datos         
            //Connection conexion = DriverManager.getConnection(url, "root", "");
            Connection conexion = Conexion.getConnection;
            // Crear una declaracion de como se travajara con la base de datos.
            //PreparedStatement declaracion = conexion.createStatement();
            String SQL = "DELETE FROM usuarios WHERE id = ?"; 
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el ID del usuario a eliminar: ");
            int id = scanner.nextInt();
            
            declaracion.setInt(1, id);
            // Variable que recivira el resultado de ejecutar la secuencia SQL
            declaracion.executeUpdate();
            
            // Imprimir valores
            
            // Crear toda la conexion con la base de datos
            //resultado.close();
            declaracion.close();
            conexion.close();
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
}
