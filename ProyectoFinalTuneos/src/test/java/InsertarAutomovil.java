
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
public class InsertarAutomovil {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Marca: ");
        String marca = scanner.nextLine();
        System.out.println("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.println("Año: ");
        String año = scanner.nextLine();
        System.out.println("Placa: ");
        String placa = scanner.nextLine();
        
        Automovil automovil = new Automovil(marca, modelo, año, placa);
        DaoAutomovil.insetar(automovil);
        
        System.out.println(automovil);
    }
}
