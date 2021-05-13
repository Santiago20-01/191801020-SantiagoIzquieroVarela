/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mascotas;

import Animal.Animal;
import java.util.Scanner;

/**
 *
 * @author ramse
 */
public class Animales {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Comer");
        String comer = scanner.nextLine();
        System.out.println("Dormir");
        String dormir = scanner.nextLine();
        System.out.println("Respirar");
        String respirar = scanner.nextLine();
        
        Animal perro = new Animal(comer, dormir, respirar);
        
    }
}
