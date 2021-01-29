/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class NumeroAleatoreo2 {
    public static void main(String[] args) {
        int max = 10; 
        int min = 1; 
        int range = max - min + 1;     
        int rand = (int)(Math.random() * range) + min; 
        System.out.println(rand); 
    }
}
