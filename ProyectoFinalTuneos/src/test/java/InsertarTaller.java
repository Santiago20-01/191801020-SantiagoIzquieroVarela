
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
public class InsertarTaller {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del taller: ");
        String nombre = scanner.nextLine();
        System.out.println("Direccion: ");
        String direccion = scanner.nextLine();
        
        Taller taller = new Taller(nombre, direccion);
        DaoTaller.insetar(taller);
        
        System.out.println(taller);
    }
}
