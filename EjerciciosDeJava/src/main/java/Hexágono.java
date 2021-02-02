
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
public class Hexágono {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del Hexagono:");
        int tamaño=scanner.nextInt();
        int tamaño2=tamaño;
        int espacios=tamaño;
        int asteriscos=tamaño;
        while(tamaño>0){
            for(int i=0;i<espacios-1;i++){
                System.out.print(" ");
            }
            espacios--;
            for(int j=0;j<asteriscos;j++){
                System.out.print("*");
            }
            System.out.print("\n");
            asteriscos=asteriscos+2;
            tamaño--;
        }
        espacios=tamaño2;
        tamaño=tamaño2;
        asteriscos=asteriscos-2;
        while(tamaño-1>0){
            for(int f=tamaño2;f<espacios+1;f++){
                System.out.print(" ");
            }
            tamaño2--;
            asteriscos=asteriscos-2;
            for(int k=0;k<asteriscos;k++){
                System.out.print("*");
            }
            System.out.print("\n");
            tamaño--;
        }
    }
}