/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoUsuarios;

import Conexion.Conexion;
import Usuarios.Usuarios;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ramse
 */
public class DaoUsuarios {
    
    private String SQL;
    
    public static List<Usuarios> listaUsuarios() throws SQLException{
       
        List<Usuarios> listaUsuarios = new ArrayList<>();
        Connection conexion = Conexion.getConexion(); 
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM usuarios";
        ResultSet resultado = declaracion.executeQuery(SQL);
        
        while(resultado.next()){
            
            Usuarios usuario = new Usuarios(resultado.getString("nombre_usuario"), resultado.getString("contraseña"), resultado.getString("fecha_de_alta"), resultado.getInt("id"), resultado.getBoolean("status"));
            
            listaUsuarios.add(usuario);
        }
        
        Conexion.close(conexion, declaracion);
        return listaUsuarios;
    }
    
    public static void insetar(Usuarios usuario) throws SQLException{
        
        Connection conexion = Conexion.getConexion();
        String SQL = "INSERT INTO usuarios(nombre_usuario, contraseña, status)VALUES(?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1, usuario.getNombre());
        declaracion.setString(2, usuario.getContraseña());
        declaracion.setInt(3,1);
        
        declaracion.executeUpdate();
        
        Conexion.close(conexion, declaracion);
    }
    
    public static void eliminar(Usuarios usuario) throws SQLException{
        
        Connection conexion = Conexion.getConexion();
        String SQL = "DELETE FROM usuarios WHERE id = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setInt(1, usuario.getId());
        declaracion.executeUpdate();
        
        Conexion.close(conexion, declaracion);
    }
    
    public static void actualizar(Usuarios usuario, int opcion) throws SQLException{
        
        Connection conexion = Conexion.getConexion();
        
        if(opcion == 1){
            String SQL = "UPDATE usuarios SET nombre_usuario = ? WHERE id = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, usuario.getNombre());
            declaracion.setInt(2, usuario.getId());
                
            declaracion.executeUpdate();
            Conexion.close(conexion, declaracion);
        }
        else if(opcion == 2){
            String SQL = "UPDATE usuarios SET contraseña = ? WHERE id = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, usuario.getContraseña());
            declaracion.setInt(2, usuario.getId());
                
            declaracion.executeUpdate();
            Conexion.close(conexion, declaracion);
        }
    }
}
