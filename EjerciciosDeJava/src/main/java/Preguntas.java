
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
public class Preguntas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Este es un juego de falso o verdadero, solo son 5 preguntas");
        System.out.println("falso = 0");
        System.out.println("verdadero = 1");
        System.out.println("Mexico es un pais");
        int respuesta=scanner.nextInt();
        if(respuesta==1){
            System.out.println("Correcto!!!");
            System.out.println("Fortnite no es gratis");
            respuesta=scanner.nextInt();
            if(respuesta==0){
                System.out.println("Correcto!!!");
                System.out.println("La aves vuelan");
                respuesta=scanner.nextInt();
                if(respuesta==1){
                    System.out.println("Correcto!!!");
                    System.out.println("El mundial no trata de futbol");
                    respuesta=scanner.nextInt();
                    if(respuesta==0){
                        System.out.println("Correcto!!!");
                        System.out.println("El agua es liquida");
                        respuesta=scanner.nextInt();
                        if(respuesta==1){
                            System.out.println("Correcto!!!");
                            System.out.println("GANASTE!!!");
                        }
                        else
                            System.out.println("Incorrecto, perdiste!!!");
                    }
                    else
                        System.out.println("Incorrecto, perdiste!!!");
                }
                else
                    System.out.println("Incorrecto, perdiste!!!");
            }
            else
               System.out.println("Incorrecto, perdiste!!!"); 
        }
        else
            System.out.println("Incorrecto, perdiste!!!");
    }
}
