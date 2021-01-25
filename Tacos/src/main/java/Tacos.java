
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
public class Tacos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("\t Menu");
        System.out.println("-Tacos $17");
        System.out.println("-Refrescos $10");
        System.out.println("¿Cuantos tacos consumio?");
        int tacos=scanner.nextInt();
        System.out.println("¿Cuantos refrescos consumio?");
        int refrescos=scanner.nextInt();
        System.out.println("Cuenta:");
        System.out.println((tacos*17)+(refrescos*10));
    }
}
