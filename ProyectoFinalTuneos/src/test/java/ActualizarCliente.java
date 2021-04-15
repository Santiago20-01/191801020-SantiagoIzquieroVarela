
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
public class ActualizarCliente {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1- Cambiar nombre del cliente");
            System.out.println("2- Cambiar telefono");
            System.out.println("\tOpcion:");
            opcion = scanner.nextInt();
        }while(opcion < 1 && opcion > 2);
        
        if(opcion == 1){
            
            System.out.println("Ingrese el ID:");
            int id = scanner.nextInt();
            System.out.println("Ingrese el nombre:");
            scanner.nextLine();
            String nombre = scanner.nextLine();
            Cliente cliente = new Cliente(nombre, id);
            DaoCliente.actualizar(cliente, opcion);
        }
        else if(opcion == 2){
            
            System.out.println("Ingrese el ID:");
            int id = scanner.nextInt();
            System.out.println("Ingrese el numero telefonico:");
            scanner.nextLine();
            String telefono = scanner.nextLine();
             Cliente cliente = new Cliente(id, telefono);
            DaoCliente.actualizar(cliente, opcion);
        }
    }
}
