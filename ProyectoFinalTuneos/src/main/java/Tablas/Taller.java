/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

/**
 *
 * @author ramse
 */
public class Taller {
    
    private String nombre, direccion;
    private int idTaller;

    public Taller() {
        
    }

    public Taller(String nombre, String direccion, int idTaller) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.idTaller = idTaller;
    }

    public Taller(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Taller(String nombre, int idTaller) {
        this.nombre = nombre;
        this.idTaller = idTaller;
    }

    public Taller(int idTaller, String direccion){
        this.idTaller = idTaller;
        this.direccion = direccion;
    }
    
    public Taller(int idTaller) {
        this.idTaller = idTaller;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdTaller() {
        return idTaller;
    }

    public void setIdTaller(int idTaller) {
        this.idTaller = idTaller;
    }

    @Override
    public String toString() {
        return idTaller +"|" + "|" + nombre + "|" + direccion;
    }
    
    public String imprimir() {
        return "Taller{" + "nombre=" + nombre + ", direccion=" + direccion + ", idTaller=" + idTaller + '}';
    }
}
