
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
public class TestCliente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Marca: ");
        String marca = scan.nextLine();
        System.out.println("Color: ");
        String color = scan.nextLine();
        System.out.println("Modelo: ");
        String modelo = scan.nextLine();
        System.out.println("Matricula: ");
        int matricula = scan.nextInt();
        System.out.println("Precio: ");
        double precio = scan.nextDouble();
      
        Coche coche = new Coche(marca, color, modelo, precio, matricula);
        Cliente cliente = new Cliente("Jose", "Calle Morelos #3", 123, 222999, coche);
        
        System.out.println(cliente);
    }
}
