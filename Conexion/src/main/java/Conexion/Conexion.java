/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;

/**
 *
 * @author ramse
 */
public class Conexion {
    //static es una palabra reservada que determina que el atributo es de la clase y no de objeto
    //final es un modificador que indica que el atributo es una constante, no se le podra cambiar e valor de nugun modo.
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USUARIO = "root", PASSWORD = "";
    public static Connection getConnection;
    public static Connection getConexion() throws SQLException{
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }
    public static void close(Connection conexion) throws SQLException{
        conexion.close();
    }
    public static void close(Connection conexion, Statement declaracion, ResultSet resultado) throws SQLException{
        conexion.close();
        declaracion.close();
        resultado.close();
    }
    public static void close(Statement declaracion, ResultSet resultado) throws SQLException{
        declaracion.close();
        resultado.close();
    }
    
    public static void close(Connection conexion, Statement declaracion) throws SQLException{
        conexion.close();
        declaracion.close();
    }
}
