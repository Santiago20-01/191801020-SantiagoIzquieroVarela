
import DaoTablas.DaoTrabajo;
import Tablas.Trabajo;
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
public class ActualizarTrabajo {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1- Cambiar descripcion del trabajo.");
            System.out.println("2- Cambiar fechas.");
            System.out.println("\tOpcion:");
            opcion = scanner.nextInt();
        }while(opcion < 1 && opcion > 2);
        
        if(opcion == 1){
            
            System.out.println("Ingrese el ID:");
            int id = scanner.nextInt();
            System.out.println("Ingrese la descripcion:");
            scanner.nextLine();
            String descripcion = scanner.nextLine();
            Trabajo trabajo = new Trabajo(descripcion, id);
            DaoTrabajo.actualizar(trabajo, opcion);
        }
        else if(opcion == 2){
            
            System.out.println("Ingrese el ID:");
            int id = scanner.nextInt();
            System.out.println("Ingrese la fecha de inicio:");
            scanner.nextLine();
            String fechaInicio = scanner.nextLine();
            System.out.println("Ingrese la fecha final:");
            String fechaFin = scanner.nextLine();
            Trabajo trabajo = new Trabajo(fechaInicio, fechaFin, id);
            DaoTrabajo.actualizar(trabajo, opcion);
        }
    }
}
