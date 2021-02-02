
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
public class CalcularEdad {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese su año de nacimiento:");
        int añoDeNacimento=scanner.nextInt();
        System.out.println("Esta es tu edad o vas a cumplir estos años:");
        System.out.println(2021-añoDeNacimento);
    }
}
