/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoTablas;

import ConexionBase.ConexionBase;
import Tablas.Trabajo;
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
public class DaoTrabajo {
    private String SQL;
    
    public static List<Trabajo> listaTrabajo() throws SQLException{
       
        List<Trabajo> listaTrabajo = new ArrayList<>();
        Connection conexion = ConexionBase.getConexion(); 
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM trabajo";
        ResultSet resultado = declaracion.executeQuery(SQL);
        
        while(resultado.next()){
            
            Trabajo trabajo = new Trabajo(resultado.getString("descripcion"), resultado.getString("fecha_inicio"), resultado.getString("fecha_fin"), resultado.getInt("id_trabajo"));
            
            listaTrabajo.add(trabajo);
        }
        
        ConexionBase.close(conexion, declaracion);
        return listaTrabajo;
    }
    
    public static void insetar(Trabajo trabajo) throws SQLException{
        
        Connection conexion = ConexionBase.getConexion();
        String SQL = "INSERT INTO trabajo(descripcion, fecha_inicio, fecha_fin)VALUES(?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1, trabajo.getDescripcion());
        declaracion.setString(2, trabajo.getFechaInicio());
        declaracion.setString(3, trabajo.getFechaFin());
        
        declaracion.executeUpdate();
        
        ConexionBase.close(conexion, declaracion);
    }
    
    public static void eliminar(Trabajo trabajo) throws SQLException{
        
        Connection conexion = ConexionBase.getConexion();
        String SQL = "DELETE FROM trabajo WHERE id_trabajo = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setInt(1, trabajo.getIdTrabajo());
        declaracion.executeUpdate();
        
        ConexionBase.close(conexion, declaracion);
    }
    
    public static void actualizar(Trabajo trabajo, int opcion) throws SQLException{
        
        Connection conexion = ConexionBase.getConexion();
        
        if(opcion == 1){
            String SQL = "UPDATE trabajo SET descripcion = ? WHERE id_trabajo = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, trabajo.getDescripcion());
            declaracion.setInt(2, trabajo.getIdTrabajo());
                
            declaracion.executeUpdate();
            ConexionBase.close(conexion, declaracion);
        }
        else if(opcion == 2){
            String SQL = "UPDATE trabajo SET fecha_inicio = ?, fecha_fin = ? WHERE id_trabajo = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, trabajo.getFechaInicio());
            declaracion.setString(2, trabajo.getFechaFin());
            declaracion.setInt(3, trabajo.getIdTrabajo());
                
            declaracion.executeUpdate();
            ConexionBase.close(conexion, declaracion);
        }
    }
}
