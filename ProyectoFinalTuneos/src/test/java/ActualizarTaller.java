
import DaoTablas.DaoTaller;
import Tablas.Taller;
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
public class ActualizarTaller {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1- Cambiar nombre del taller.");
            System.out.println("2- Cambiar direccion.");
            System.out.println("\tOpcion:");
            opcion = scanner.nextInt();
        }while(opcion < 1 && opcion > 2);
        
        if(opcion == 1){
            
            System.out.println("Ingrese el ID:");
            int id = scanner.nextInt();
            System.out.println("Ingrese el nombre:");
            scanner.nextLine();
            String nombre = scanner.nextLine();
            Taller taller = new Taller(nombre, id);
            DaoTaller.actualizar(taller, opcion);
        }
        else if(opcion == 2){
            
            System.out.println("Ingrese el ID:");
            int id = scanner.nextInt();
            System.out.println("Ingrese la direccion:");
            scanner.nextLine();
            String direccion = scanner.nextLine();
            Taller taller = new Taller(id, direccion);
            DaoTaller.actualizar(taller, opcion);
        }
    }
}
