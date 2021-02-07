/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class Refrescos {
    
    //Atributos
    public String nombre, codigo, sabor;
    public double cantidad, precio;
    
    public Refrescos(){
        
    }
    
    public Refrescos(String nombre, String codigo, String sabor, double cantidad, double precio){
        
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.sabor = sabor;
        
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\nCodigo: " + codigo + "\nSabor: " + sabor + "\nCantidad" + cantidad + "\nPrecio: " + precio;
    }
    
}
