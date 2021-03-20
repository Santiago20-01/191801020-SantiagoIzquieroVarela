

import Conexion.Conexion;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class Lista {
    public static void main(String[] args) throws SQLException {
        
            // Crear conexion con base de datos         
            // conexion = DriverManager.getConnection(url, "root", "");
            Connection conexion = Conexion.getConexion();
            // Crear una declaracion de como se travajara con la base de datos.
            Statement declaracion = conexion.createStatement();
            String SQL = "SELECT * FROM usuarios"; 
            
            // Variable que recivira el resultado de ejecutar la secuencia SQL
            ResultSet resultado = declaracion.executeQuery(SQL);
            
            // Imprimir valores
            while(resultado.next()){
                System.out.println(resultado.getInt("id"));
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getString("contraseña"));
                System.out.println(resultado.getString("nombre_foto"));
                System.out.println(resultado.getString("formato"));
            }
            Conexion.close(conexion, declaracion, resultado);
            // Crear toda la conexion con la base de datos 
    }
}
