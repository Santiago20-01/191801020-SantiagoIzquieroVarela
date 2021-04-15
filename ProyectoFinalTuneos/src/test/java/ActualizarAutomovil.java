
import DaoTablas.DaoAutomovil;
import Tablas.Automovil;
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
public class ActualizarAutomovil {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1- Cambiar modelo, marca o año.");
            System.out.println("2- Cambiar No Placas.");
            System.out.println("\tOpcion:");
            opcion = scanner.nextInt();
        }while(opcion < 1 && opcion > 2);
        
        if(opcion == 1){
            
            System.out.println("Ingrese el ID:");
            int id = scanner.nextInt();
            System.out.println("Ingrese el modelo:");
            scanner.nextLine();
            String modelo = scanner.nextLine();
            System.out.println("Ingrese la marca:");
            String marca = scanner.nextLine();
            System.out.println("Ingrese la año:");
            String año = scanner.nextLine();
            Automovil automovil = new Automovil(marca, modelo, año, id);
            DaoAutomovil.actualizar(automovil, opcion);
        }
        else if(opcion == 2){
            
            System.out.println("Ingrese el ID:");
            int id = scanner.nextInt();
            System.out.println("Ingrese el numero de la placa:");
            scanner.nextLine();
            String placa = scanner.nextLine();
            Automovil automovil = new Automovil(placa, id);
            DaoAutomovil.actualizar(automovil, opcion);
        }
    }
}
