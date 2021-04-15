
import java.sql.SQLException;
import java.util.Scanner;
import Tablas.Cliente;
import DaoTablas.DaoCliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class InsertarCliente {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.println("Telefono: ");
        String telefono = scanner.nextLine();
        System.out.println("Direccion: ");
        String direccion = scanner.nextLine();
        
        Cliente cliente = new Cliente(nombre, telefono, direccion);
        DaoCliente.insetar(cliente);
        
        System.out.println(cliente);
    }
}
