/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class TestAk {
    public static void main(String[] args) {
        //Crear un objeto (instanciar una clase)
        Ak cobre=new Ak();
        cobre.material = "cobre";
        cobre.disponibilidad = "alta";
        cobre.municion = 5;
        cobre.precio = 10;
        cobre.velocidadDisparo = 10.5;
        cobre.danio = 5;
        
        System.out.println(cobre);
        
        Ak diamante = new Ak();
        diamante.material = "Diamante";
        diamante.disponibilidad = "alta";
        diamante.municion = 5;
        diamante.precio = 10;
        diamante.velocidadDisparo = 10.5;
        diamante.danio = 5;
        
        System.out.println(diamante);
    }
}
