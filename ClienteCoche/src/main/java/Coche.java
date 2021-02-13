/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class Coche {
    public String marca, color, modelo;
    public double precio;
    public int matricula;
    
    public Coche(){
        this.color = "";
        this.marca = "";
        this.matricula = 0;
        this.modelo = "";
        this.precio = 0;
    }
    
    public Coche(String marca, String color, String modelo, double precio, int matricula){
        this.color = color;
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return "Marca: "+ marca +"\nColor: "+ color +"\nModelo: "+ modelo +"\nMatricula: "+ matricula +"Precio: "+ precio;
    }
}
