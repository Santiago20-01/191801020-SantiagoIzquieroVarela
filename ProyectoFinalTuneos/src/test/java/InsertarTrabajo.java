
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
public class InsertarTrabajo {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Descripcion del trabajo: ");
        String descripcion = scanner.nextLine();
        System.out.println("Fecha de inicio: ");
        String fechaInicio = scanner.nextLine();
        System.out.println("Fecha de fin: ");
        String fechaFin = scanner.nextLine();
        
        Trabajo trabajo = new Trabajo(descripcion, fechaInicio, fechaFin);
        DaoTrabajo.insetar(trabajo);
        
        System.out.println(trabajo);
    }
}
