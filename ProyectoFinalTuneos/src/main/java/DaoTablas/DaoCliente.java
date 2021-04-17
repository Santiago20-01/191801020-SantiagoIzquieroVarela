/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoTablas;

import ConexionBase.ConexionBase;
import Tablas.Cliente;
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
public class DaoCliente {
    
    private String SQL;
    
    public static List<Cliente> listaCliente() throws SQLException{
       
        List<Cliente> listaCliente = new ArrayList<>();
        Connection conexion = ConexionBase.getConexion(); 
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM cliente";
        ResultSet resultado = declaracion.executeQuery(SQL);
        
        while(resultado.next()){
            
            Cliente cliente = new Cliente(resultado.getString("nombre"), resultado.getString("telefono"), resultado.getString("direccion"), resultado.getInt("id_cliente"));
            
            listaCliente.add(cliente);
        }
        
        ConexionBase.close(conexion, declaracion);
        return listaCliente;
    }
    
    public static void insetar(Cliente cliente) throws SQLException{
        
        Connection conexion = ConexionBase.getConexion();
        String SQL = "INSERT INTO cliente(nombre, telefono, direccion)VALUES(?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1, cliente.getNombre());
        declaracion.setString(2, cliente.getTelefono());
        declaracion.setString(3, cliente.getDireccion());
        
        declaracion.executeUpdate();
        
        ConexionBase.close(conexion, declaracion);
    }
    
    public static void eliminar(Cliente cliente) throws SQLException{
        
        Connection conexion = ConexionBase.getConexion();
        String SQL = "DELETE FROM cliente WHERE id_cliente = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setInt(1, cliente.getIdCliente());
        declaracion.executeUpdate();
        
        ConexionBase.close(conexion, declaracion);
    }
    
    public static void actualizar(Cliente cliente, int opcion) throws SQLException{
        
        Connection conexion = ConexionBase.getConexion();
        
        if(opcion == 1){
            String SQL = "UPDATE cliente SET nombre = ?, telefono = ?, direccion = ? WHERE id_cliente = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, cliente.getNombre());
            declaracion.setString(2, cliente.getTelefono());
            declaracion.setString(3, cliente.getDireccion());
            declaracion.setInt(4, cliente.getIdCliente());
                
            declaracion.executeUpdate();
            ConexionBase.close(conexion, declaracion);
        }
        else if(opcion == 2){
            String SQL = "UPDATE cliente SET telefono = ? WHERE id_cliente = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, cliente.getTelefono());
            declaracion.setInt(2, cliente.getIdCliente());
                
            declaracion.executeUpdate();
            ConexionBase.close(conexion, declaracion);
        }
        /*else if(opcion == 3){
            String SQL = "UPDATE cliente SET direccion = ? WHERE id_cliente = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, cliente.getDireccion());
            declaracion.setInt(2, cliente.getIdCliente());
                
            declaracion.executeUpdate();
            ConexionBase.close(conexion, declaracion);
        }*/
    }
}
