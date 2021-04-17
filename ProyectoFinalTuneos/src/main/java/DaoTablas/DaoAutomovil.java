/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoTablas;

import ConexionBase.ConexionBase;
import Tablas.Automovil;
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
public class DaoAutomovil {
    private String SQL;
    
    public static List<Automovil> listaAutomovil() throws SQLException{
       
        List<Automovil> listaAutomovil = new ArrayList<>();
        Connection conexion = ConexionBase.getConexion(); 
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM automovil";
        ResultSet resultado = declaracion.executeQuery(SQL);
        
        while(resultado.next()){
            
            Automovil automovil = new Automovil(resultado.getString("marca"), resultado.getString("modelo"), resultado.getString("año"), resultado.getString("placa"), resultado.getInt("id_automovil"));
            
            listaAutomovil.add(automovil);
        }
        
        ConexionBase.close(conexion, declaracion);
        return listaAutomovil;
    }
    
    public static void insetar(Automovil automovil) throws SQLException{
        
        Connection conexion = ConexionBase.getConexion();
        String SQL = "INSERT INTO automovil(marca, modelo, año, placa)VALUES(?,?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1, automovil.getMarca());
        declaracion.setString(2, automovil.getModelo());
        declaracion.setString(3, automovil.getAño());
        declaracion.setString(4, automovil.getPlaca());
        
        declaracion.executeUpdate();
        
        ConexionBase.close(conexion, declaracion);
    }
    
    public static void eliminar(Automovil automovil) throws SQLException{
        
        Connection conexion = ConexionBase.getConexion();
        String SQL = "DELETE FROM automovil WHERE id_automovil = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setInt(1, automovil.getIdAutomovil());
        declaracion.executeUpdate();
        
        ConexionBase.close(conexion, declaracion);
    }
    
    public static void actualizar(Automovil automovil, int opcion) throws SQLException{
        
        Connection conexion = ConexionBase.getConexion();
        
        if(opcion == 1){
            String SQL = "UPDATE automovil SET marca = ?, modelo = ?, año = ?, placa = ? WHERE id_automovil = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, automovil.getMarca());
            declaracion.setString(2, automovil.getModelo());
            declaracion.setString(3, automovil.getAño());
            declaracion.setString(4, automovil.getPlaca());
            declaracion.setInt(5, automovil.getIdAutomovil());
                
            declaracion.executeUpdate();
            ConexionBase.close(conexion, declaracion);
        }
        else if(opcion == 2){
            String SQL = "UPDATE automovil SET placa = ? WHERE id_automovil = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, automovil.getPlaca());
            declaracion.setInt(2, automovil.getIdAutomovil());
                
            declaracion.executeUpdate();
            ConexionBase.close(conexion, declaracion);
        }
    }
}
