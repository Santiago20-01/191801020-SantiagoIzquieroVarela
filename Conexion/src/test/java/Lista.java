

import java.sql.*;
import DaoUsuarios.DaoUsuarios;
import Usuarios.Usuarios;
import java.util.List;
import java.util.ArrayList;

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
    public static void main(String[] args) throws SQLException{
        
        List<Usuarios> listaUsuarios = new ArrayList<>();
        listaUsuarios = DaoUsuarios.listaUsuarios();
        
        for(Usuarios usuario:listaUsuarios){
            System.out.println(usuario);
        }
        /*
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
*/
    }
}
