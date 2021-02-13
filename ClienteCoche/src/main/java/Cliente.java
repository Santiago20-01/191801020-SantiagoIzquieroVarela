
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class Cliente {
    public int dni, telefono;
    public String nombre, direccion;
    public Coche coche;
    
    public Cliente(){
        this.coche = null;
        this.direccion = "";
        this.dni = 0;
        this.nombre = "";
        this.telefono = 0;
    }
    
    public Cliente(String nombre, String direccion, int dni, int telefono, Coche coche){
        this.coche = coche;
        this.direccion = direccion;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }

     @Override
    public String toString(){
        return "Nombre: "+ nombre +"\nTelefono: "+ telefono +"\nDNI: "+ dni +"\nDireccion: "+ direccion +"\nCoche"+ coche;
    }
}
