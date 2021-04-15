
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
public class ActualizarHerramientaMaterial {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1- Cambiar nombre del material o herramineta.");
            System.out.println("2- Cambiar descripcion.");
            System.out.println("3- Cambiar tipo.");
            System.out.println("\tOpcion:");
            opcion = scanner.nextInt();
        }while(opcion < 1 && opcion > 3);
        
        if(opcion == 1){
            
            System.out.println("Ingrese el ID:");
            int id = scanner.nextInt();
            System.out.println("Ingrese el nombre:");
            scanner.nextLine();
            String nombre = scanner.nextLine();
            HerramientaMaterial herramientaMaterial = new HerramientaMaterial(nombre, id);
            DaoHerramientaMaterial.actualizar(herramientaMaterial, opcion);
        }
        else if(opcion == 2){
            
            System.out.println("Ingrese el ID:");
            int id = scanner.nextInt();
            System.out.println("Ingrese la direccion:");
            scanner.nextLine();
            String descripcion = scanner.nextLine();
            HerramientaMaterial herramientaMaterial = new HerramientaMaterial(id, descripcion);
            DaoHerramientaMaterial.actualizar(herramientaMaterial, opcion);
        }
        else if(opcion == 3){
            
            System.out.println("Ingrese el ID:");
            int id = scanner.nextInt();
            System.out.println("Ingrese el tipo:");
            int tipo = scanner.nextInt();
            HerramientaMaterial herramientaMaterial = new HerramientaMaterial(id, tipo);
            DaoHerramientaMaterial.actualizar(herramientaMaterial, opcion);
        }
    }
}
