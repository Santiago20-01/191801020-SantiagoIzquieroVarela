
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
public class Pomedio {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Igrese su primer calificacion: ");
        double calificacionUno=scanner.nextDouble();
        System.out.println("Igrese su segunda calificacion: ");
        double calificacionDos=scanner.nextDouble();
        System.out.println("Igrese su tercer calificacion: ");
        double calificacionTres=scanner.nextDouble();
        System.out.println(calificacionUno+calificacionDos+calificacionTres/3);
    }
}
