
import java.sql.*;
import java.util.Scanner;
import DaoUsuarios.DaoUsuarios;
import Usuarios.Usuarios;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class Insertar {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.println("Contraseña: ");
        String contraseña = scanner.nextLine();
        
        Usuarios usuario = new Usuarios(nombreUsuario, contraseña);
        DaoUsuarios.insetar(usuario);
        
        System.out.println(usuario);
        /*
        String url = "jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            // Crear conexion con base de datos         
            //Connection conexion = DriverManager.getConnection(url, "root", "");
            Connection conexion = Conexion.getConexion();
            // Crear una declaracion de como se travajara con la base de datos.
            //PreparedStatement declaracion = conexion.createStatement();
            String SQL = "INSERT INTO usuarios(nombre_usuario, contraseña, status)VALUES(?,?,?)"; 
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Usuario: ");
            String nombreUsuario = scanner.nextLine();
            System.out.println("Contraseña: ");
            String contraseña = scanner.nextLine();
            System.out.println("Ingrese el status 1 o 0: ");
            int status = scanner.nextInt();
            declaracion.setString(1, nombreUsuario);
            declaracion.setString(2, contraseña);
            declaracion.setInt(3,status);
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
*/
    }
}
