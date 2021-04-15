/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoTablas;

import ConexionBase.ConexionBase;
import Tablas.HerramientaMaterial;
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
public class DaoHerramientaMaterial {
    private String SQL;
    
    public static List<HerramientaMaterial> listaHerramientaMaterial() throws SQLException{
       
        List<HerramientaMaterial> listaHerramientaMaterial = new ArrayList<>();
        Connection conexion = ConexionBase.getConexion(); 
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM herramienta_material";
        ResultSet resultado = declaracion.executeQuery(SQL);
        
        while(resultado.next()){
            
            HerramientaMaterial herramientaMaterial = new HerramientaMaterial(resultado.getString("nombre"), resultado.getString("descripcion"), resultado.getInt("id"), resultado.getInt("tipo"));
            
            listaHerramientaMaterial.add(herramientaMaterial);
        }
        
        ConexionBase.close(conexion, declaracion);
        return listaHerramientaMaterial;
    }
    
    public static void insetar(HerramientaMaterial herramientaMaterial) throws SQLException{
        
        Connection conexion = ConexionBase.getConexion();
        String SQL = "INSERT INTO herramienta_material(nombre, tipo, descripcion)VALUES(?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1, herramientaMaterial.getNombre());
        declaracion.setInt(2, herramientaMaterial.getTipo());
        declaracion.setString(3, herramientaMaterial.getDescripcion());
        
        declaracion.executeUpdate();
        
        ConexionBase.close(conexion, declaracion);
    }
    
    public static void eliminar(HerramientaMaterial herramientaMaterial) throws SQLException{
        
        Connection conexion = ConexionBase.getConexion();
        String SQL = "DELETE FROM herramienta_material WHERE id = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setInt(1, herramientaMaterial.getId());
        declaracion.executeUpdate();
        
        ConexionBase.close(conexion, declaracion);
    }
    
    public static void actualizar(HerramientaMaterial herramientaMaterial, int opcion) throws SQLException{
        
        Connection conexion = ConexionBase.getConexion();
        
        if(opcion == 1){
            String SQL = "UPDATE herramienta_material SET nombre = ? WHERE id = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, herramientaMaterial.getNombre());
            declaracion.setInt(2, herramientaMaterial.getId());
                
            declaracion.executeUpdate();
            ConexionBase.close(conexion, declaracion);
        }
        else if(opcion == 2){
            String SQL = "UPDATE herramienta_material SET descripcion = ? WHERE id = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, herramientaMaterial.getDescripcion());
            declaracion.setInt(2, herramientaMaterial.getId());
                
            declaracion.executeUpdate();
            ConexionBase.close(conexion, declaracion);
        }
        else if(opcion == 3){
            String SQL = "UPDATE herramienta_material SET tipo = ? WHERE id = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setInt(1, herramientaMaterial.getTipo());
            declaracion.setInt(2, herramientaMaterial.getId());
                
            declaracion.executeUpdate();
            ConexionBase.close(conexion, declaracion);
        }
    }
}
