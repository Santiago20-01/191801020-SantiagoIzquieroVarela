/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class Ak {
    
    //Atributos
    public String material, disponibilidad;
    public int municion;
    public double danio, precio, velocidadDisparo;
    
    //metodos
    @Override
    public String toString(){
        return "El material del arma es de:" + material + "con una disponibilidad de:" + disponibilidad + "con una municion de " + municion + "con una veliciodad de disparo" + velocidadDisparo + "con un daño de: " + danio + "con un precio de: " + precio;
    }
    
}
