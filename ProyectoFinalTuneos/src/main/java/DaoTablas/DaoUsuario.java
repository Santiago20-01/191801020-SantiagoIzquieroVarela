/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoTablas;

import ConexionBase.ConexionBase;
import Tablas.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ramse
 */
public class DaoUsuario {
    
    private String SQL;
    
    public static List<Usuario> listaUsuario() throws SQLException{
       
        List<Usuario> listaUsuario = new ArrayList<>();
        Connection conexion = ConexionBase.getConexion(); 
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM usuario";
        ResultSet resultado = declaracion.executeQuery(SQL);
        
        while(resultado.next()){
            
            Usuario usuario = new Usuario(resultado.getString("nombre"), resultado.getString("contraseña"), resultado.getString("fecha_alta"), resultado.getInt("id_usuario"));
            
            listaUsuario.add(usuario);
        }
        
        ConexionBase.close(conexion, declaracion);
        return listaUsuario;
    }
    
    public static void insetar(Usuario usuario) throws SQLException{
        
        Connection conexion = ConexionBase.getConexion();
        String SQL = "INSERT INTO usuario(nombre, contraseña)VALUES(?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1, usuario.getNombre());
        declaracion.setString(2, usuario.getContraseña());
        
        declaracion.executeUpdate();
        
        ConexionBase.close(conexion, declaracion);
    }
    
    public static void eliminar(Usuario usuario) throws SQLException{
        
        Connection conexion = ConexionBase.getConexion();
        String SQL = "DELETE FROM usuario WHERE id_usuario = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setInt(1, usuario.getIdUsuario());
        declaracion.executeUpdate();
        
        ConexionBase.close(conexion, declaracion);
    }
    
    public static void actualizar(Usuario usuario, int opcion) throws SQLException{
        
        Connection conexion = ConexionBase.getConexion();
        
        if(opcion == 1){
            String SQL = "UPDATE usuario SET nombre = ? WHERE id_usuario = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, usuario.getNombre());
            declaracion.setInt(2, usuario.getIdUsuario());
                
            declaracion.executeUpdate();
            ConexionBase.close(conexion, declaracion);
        }
        else if(opcion == 2){
            String SQL = "UPDATE usuario SET contraseña = ? WHERE id_usuario = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, usuario.getContraseña());
            declaracion.setInt(2, usuario.getIdUsuario());
                
            declaracion.executeUpdate();
            ConexionBase.close(conexion, declaracion);
        }
    }
}
