
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
public class EliminarAutomovil {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el id del automovil: ");
        int idAutomovil = scanner.nextInt();
        
        Automovil automovil = new Automovil(idAutomovil);
        DaoAutomovil.eliminar(automovil);
    }
}
