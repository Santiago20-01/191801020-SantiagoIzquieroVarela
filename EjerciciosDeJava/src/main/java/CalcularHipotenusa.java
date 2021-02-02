
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
public class CalcularHipotenusa {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el valor del cateto opuesto:");
        double catetoOpuesto=scanner.nextDouble();
        System.out.println("Ingrese el valor del cateto adyacente:");
        double catetoAdyacente=scanner.nextDouble();
        System.out.println("La Hipotenusa vale:");
        double resultado=Math.sqrt((catetoOpuesto*catetoOpuesto)+(catetoAdyacente*catetoAdyacente));
        System.out.println(resultado);
    }
}
