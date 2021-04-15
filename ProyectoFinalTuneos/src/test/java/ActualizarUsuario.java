
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
public class ActualizarUsuario {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1- Cambiar nombre del usuario");
            System.out.println("2- Cambiar contraseña");
            System.out.println("\tOpcion:");
            opcion = scanner.nextInt();
        }while(opcion < 1 && opcion > 2);
        
        if(opcion == 1){
            
            System.out.println("Ingrese el ID:");
            int id = scanner.nextInt();
            System.out.println("Ingrese el nombre:");
            scanner.nextLine();
            String nombre = scanner.nextLine();
            Usuario usuario = new Usuario(nombre, id);
            DaoUsuario.actualizar(usuario, opcion);
        }
        else if(opcion == 2){
            
            System.out.println("Ingrese el ID:");
            int id = scanner.nextInt();
            System.out.println("Ingrese el contraseña:");
            scanner.nextLine();
            String contraseña = scanner.nextLine();
            Usuario usuario = new Usuario(id, contraseña);
            DaoUsuario.actualizar(usuario, opcion);
        }
    }
}
