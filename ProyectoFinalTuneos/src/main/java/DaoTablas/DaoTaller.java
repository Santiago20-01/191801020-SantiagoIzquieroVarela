/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoTablas;

import ConexionBase.ConexionBase;
import Tablas.Taller;
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
public class DaoTaller {
    private String SQL;
    
    public static List<Taller> listaTaller() throws SQLException{
       
        List<Taller> listaTaller = new ArrayList<>();
        Connection conexion = ConexionBase.getConexion(); 
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM taller";
        ResultSet resultado = declaracion.executeQuery(SQL);
        
        while(resultado.next()){
            
            Taller taller = new Taller(resultado.getString("nombre"), resultado.getString("direccion"), resultado.getInt("id_taller"));
            
            listaTaller.add(taller);
        }
        
        ConexionBase.close(conexion, declaracion);
        return listaTaller;
    }
    
    public static void insetar(Taller taller) throws SQLException{
        
        Connection conexion = ConexionBase.getConexion();
        String SQL = "INSERT INTO taller(nombre, direccion)VALUES(?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1, taller.getNombre());
        declaracion.setString(2, taller.getDireccion());
        
        declaracion.executeUpdate();
        
        ConexionBase.close(conexion, declaracion);
    }
    
    public static void eliminar(Taller taller) throws SQLException{
        
        Connection conexion = ConexionBase.getConexion();
        String SQL = "DELETE FROM taller WHERE id_taller = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setInt(1, taller.getIdTaller());
        declaracion.executeUpdate();
        
        ConexionBase.close(conexion, declaracion);
    }
    
    public static void actualizar(Taller taller, int opcion) throws SQLException{
        
        Connection conexion = ConexionBase.getConexion();
        
        if(opcion == 1){
            String SQL = "UPDATE taller SET nombre = ? WHERE id_taller = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, taller.getNombre());
            declaracion.setInt(2, taller.getIdTaller());
                
            declaracion.executeUpdate();
            ConexionBase.close(conexion, declaracion);
        }
        else if(opcion == 2){
            String SQL = "UPDATE taller SET direccion = ? WHERE id_taller = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, taller.getDireccion());
            declaracion.setInt(2, taller.getIdTaller());
                
            declaracion.executeUpdate();
            ConexionBase.close(conexion, declaracion);
        }
    }
}
