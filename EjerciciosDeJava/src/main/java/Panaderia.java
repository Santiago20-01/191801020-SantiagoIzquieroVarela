
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
public class Panaderia {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de barras que no son del dia:");
        int barrasNoHoy=scanner.nextInt();
        System.out.println("Ingrese la cantidad de barras que no son del dia:");
        int barrasSiHoy=scanner.nextInt();
        float descuento=(float) (3.49-((3.49*60)/100));
        float total=(float) ((descuento*barrasNoHoy)+(3.49*barrasSiHoy));
        System.out.println("Barra de pan--------> $3.49");
        System.out.println("Barras de hoy:");
        System.out.println(barrasSiHoy);
        System.out.println("Barras que no son de hoy:");
        System.out.println(barrasNoHoy);
        System.out.println("El descuento es de:");
        System.out.println(descuento);
        System.out.println("Total:");
        System.out.println(total);
    }
}
