
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
public class TiempoDeViaje {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("¿Cuantos tramos tuvo?");
        int numeroTramos=scanner.nextInt();
        int horas;
        int minutos;
        int sumaTramos = 0;
        for(int i=0;i<numeroTramos;i++){
            int tramos=scanner.nextInt();
            sumaTramos=sumaTramos+tramos;
        }
        horas=sumaTramos/60;
        System.out.println("Horas:");
        System.out.println(horas);
        for(int j=0;j<horas;j++){
            sumaTramos=sumaTramos-60;
        }
        minutos=sumaTramos;
        System.out.println("Minutos:");
        System.out.println(minutos);
    }
}
