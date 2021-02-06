/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class Taza {
    
    //Atributos
    public String color;
    public double precio;
    public String modelo;
    public String tamanio;
    public String material;
    
    //Metodos
    //Constructores
    public Taza(String color, double precio, String modelo, String tamanio, String material){
        this.color = color;
        this.material = material;
        this.modelo = modelo;
        this.precio = precio;
        this.tamanio = tamanio;
        
    }
    public Taza(){
        this.color = "";
        this.material = "";
        this.modelo = "";
        this.precio = 0;
        this.tamanio = "";
    }
    //Metodos toString
    @Override
    public String toString (){
        return "El color de la taza es "+ color + "El precio es: "+ precio +"El modelo es: "+ modelo +"El tamaño es: "+ tamanio +"El material es: "+ material;
    }
    
    
}
