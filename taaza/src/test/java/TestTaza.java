/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class TestTaza {
    public static void main(String[] args) {
        
        Taza tazaRoja = new Taza();
        tazaRoja.color = "Roja";
        tazaRoja.material = "Plastico";
        tazaRoja.modelo = "Navideño 2020";
        tazaRoja.precio = 350.90;
        tazaRoja.tamanio = "Mediana";
        
        System.out.println(tazaRoja);
        
        Taza tazaNaranja = new Taza("Naranja",119.50, "Industrial", "Grande", "Plata");
        
        System.out.println(tazaNaranja);
        
    }
}
