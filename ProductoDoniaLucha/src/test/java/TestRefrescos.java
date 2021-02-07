
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
public class TestRefrescos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introdusca los datos del Refresco");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Codigo: ");
        String codigo = scanner.nextLine();
        System.out.println("Sabor: ");
        String sabor = scanner.nextLine();
        System.out.println("Cantidad: ");
        double cantidad = scanner.nextDouble();
        System.out.println("Precio: ");
        double precio = scanner.nextDouble();
        
        Refrescos cocaCola = new Refrescos("Coca Cola", "SB123", "Clasico", 600, 16.50);
        Refrescos pepsi = new Refrescos("Pepsi", "SB456", "Con limon", 600, 12.50);
        Refrescos fanta = new Refrescos("Fanta", "SB789", "Naranja", 1000, 20.50);
        Refrescos refresco = new Refrescos(nombre, codigo, sabor, cantidad, precio);
        
        System.out.println(cocaCola + "\n" + pepsi + "\n" + fanta + "\n" + refresco);
        
    }
}
