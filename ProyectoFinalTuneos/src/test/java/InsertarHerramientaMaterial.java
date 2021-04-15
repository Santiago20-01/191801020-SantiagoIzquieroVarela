
import DaoTablas.DaoHerramientaMaterial;
import Tablas.HerramientaMaterial;
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
public class InsertarHerramientaMaterial {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del material o herramienta: ");
        String nombre = scanner.nextLine();
        System.out.println("Descripcion ");
        String descripcion = scanner.nextLine();
        System.out.println("Tipo (1 = Material, 0 = Herramienta): ");
        int tipo = scanner.nextInt();
        
        HerramientaMaterial herramientaMaterial = new HerramientaMaterial(nombre, descripcion, tipo);
        DaoHerramientaMaterial.insetar(herramientaMaterial);
        
        System.out.println(herramientaMaterial);
    }
}
