
import java.sql.*;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class Conexion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/usuarios_fotos?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            // Crear conexion con base de datos         
            Connection conexion = DriverManager.getConnection(url, "root", "");
            
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
            
            // Crear toda la conexion con la base de datos
            resultado.close();
            declaracion.close();
            conexion.close();
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
}
