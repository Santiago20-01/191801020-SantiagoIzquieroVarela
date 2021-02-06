/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class Materias {
    
    public String nombre, carrera, codigo;
    public int creditos, cuatrimestre;
    
    public Materias(){
        
    }
    
    public Materias(String nombre, String carrera, String codigo, int creditos, int cuatrimestre){
        this.carrera = carrera;
        this.codigo =codigo;
        this.creditos = creditos;
        this.cuatrimestre = cuatrimestre;
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
       return "Carrera: "+ carrera +"\nCodigo: "+ codigo +"\nCreditos: "+ creditos +"\nCutrimestre: "+cuatrimestre +"\nNombre: "+ nombre;   
    }
}
