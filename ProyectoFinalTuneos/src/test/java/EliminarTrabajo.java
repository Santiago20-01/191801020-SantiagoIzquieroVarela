
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
public class EliminarTrabajo {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la id: ");
        int id = scanner.nextInt();
        
        Trabajo trabajo = new Trabajo(id);
        DaoTrabajo.eliminar(trabajo);
    }
}
