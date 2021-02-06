
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
public class TestMaterias {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Carrera: ");
        String carrera = scanner.nextLine(); 
        System.out.println("Clave: ");
        String clave = scanner.nextLine();
        System.out.println("Creditos: ");
        int creditos = scanner.nextInt();
        System.out.println("Cuatrimestre: ");
        int cuatrimestre = scanner.nextInt();
                
        Materias matematicas = new Materias("Matematicas", "Industrial", "SB123", 10, 2);
        Materias etica = new Materias("Etica", "Iformatica", "SB456", 11, 1);
        Materias espaniol = new Materias("Español", "Financiera", "SB789", 15, 3);
        
        System.out.println(matematicas);
        System.out.println(etica);
        System.out.println(espaniol);
        System.out.println(nombre);
        System.out.println(carrera);
        System.out.println(clave);
        System.out.println(creditos);
        System.out.println(cuatrimestre);
    }
}
