
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
public class EliminarUsuario {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la id: ");
        int id = scanner.nextInt();
        
        Usuario usuario = new Usuario(id);
        DaoUsuario.eliminar(usuario);
    }
}
