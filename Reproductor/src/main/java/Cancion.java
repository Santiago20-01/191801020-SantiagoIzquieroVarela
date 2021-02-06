/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class Cancion {
    
    //Atributos
    
    public int orden;
    public String titulo;
    public double duracion;
    
    public Cancion (int orden, String titulo, double duracion){
        
        this.duracion = duracion;
        this.orden = orden;
        this.titulo = titulo;
        
    }
    
    public Cancion (){
        
        this.duracion = 0;
        this.orden = 0;
        this.titulo = "";
        
    }
    
    @Override
    public String toString(){
        return "Duracion: "+ duracion +"\nOrden: "+ orden +"\nTitulo: "+titulo;
    }
}
