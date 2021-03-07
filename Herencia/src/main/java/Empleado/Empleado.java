/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author ramse
 */
public class Empleado {
    
    private String nombre, apellidoPaterno, apellidoMaterno;
    private int dni;
    
    public Empleado(){
        this.apellidoMaterno = "";
        this.apellidoPaterno = "";
        this.dni = 0;
        this.nombre = "";
    }
    
    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, int dni){
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.dni = dni;
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+ nombre +"\nApellido Paterno: "+ apellidoPaterno +"\nApellido Materno: "+ apellidoMaterno +"\nDNI: "+ dni;
    }
}
