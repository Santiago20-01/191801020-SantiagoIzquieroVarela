
import DaoTablas.DaoUsuario;
import Tablas.Usuario;
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
public class InsertarUsuario {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del usuario: ");
        String nombre = scanner.nextLine();
        System.out.println("Contraseña: ");
        String contraseña = scanner.nextLine();
        
        Usuario usuario = new Usuario(nombre, contraseña);
        DaoUsuario.insetar(usuario);
        
        System.out.println(usuario);
    }
}
