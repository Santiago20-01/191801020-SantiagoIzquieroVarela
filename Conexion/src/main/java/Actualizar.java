
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class Actualizar {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            // Crear conexion con base de datos         
            Connection conexion = DriverManager.getConnection(url, "root", "");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Elija el numero del atrivuto");
            System.out.println("1- nombre_usuario");
            System.out.println("2- contraseña");
            System.out.println("Opcion:");
            int numeroAtributo = scanner.nextInt();
            // Crear una declaracion de como se travajara con la base de datos.
            //PreparedStatement declaracion = conexion.createStatement();
            //String SQL = "UPDATE usuarios SET nombre_usuario = ?, contraseña = ?, status = ? WHERE id = ?"; 
            //PreparedStatement declaracion = conexion.prepareStatement(SQL);
            System.out.println("Ingrese el ID:");
            int id = scanner.nextInt();
            if(numeroAtributo == 1){
                String SQL = "UPDATE usuarios SET nombre_usuario = ?, status = ? WHERE id = ?"; 
                PreparedStatement declaracion = conexion.prepareStatement(SQL);
                System.out.println("Ingrese el nombre:");
                scanner.nextLine();
                String nombreUsuario = scanner.nextLine();
                declaracion.setString(1, nombreUsuario);
                declaracion.setInt(3, id);
                declaracion.setInt(2,1);
                declaracion.executeUpdate();
                declaracion.close();
            }
            else if(numeroAtributo == 2){
                String SQL = "UPDATE usuarios SET contraseña = ?, status = ? WHERE id = ?"; 
                PreparedStatement declaracion = conexion.prepareStatement(SQL);
                System.out.println("Ingrese la contraseña:");
                scanner.nextLine();
                String contraseña = scanner.nextLine();
                declaracion.setString(1, contraseña);
                declaracion.setInt(3, id);
                declaracion.setInt(2,1);
                declaracion.executeUpdate();
                declaracion.close();
            }
            //declaracion.setString(numeroAtributo, atributoNew);
            //declaracion.setString(2, contraseña);
            //declaracion.setInt(2,1);
            // Variable que recivira el resultado de ejecutar la secuencia SQL
            //declaracion.executeUpdate();
            
            // Imprimir valores
            
            // Crear toda la conexion con la base de datos
            //resultado.close();
            //declaracion.close();
            conexion.close();
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
}
