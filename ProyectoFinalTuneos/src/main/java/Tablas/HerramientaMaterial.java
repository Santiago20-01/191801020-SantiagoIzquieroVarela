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
public class HerramientaMaterial {
    
    private String nombre, descripcion;
    private int id, tipo;

    public HerramientaMaterial() {
        
    }

    public HerramientaMaterial(String nombre, String descripcion, int id, int tipo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
        this.tipo = tipo;
    }

    public HerramientaMaterial(String nombre, String descripcion, int tipo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public HerramientaMaterial(int id) {
        this.id = id;
    }

    public HerramientaMaterial(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public HerramientaMaterial(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public HerramientaMaterial(int id, int tipo) {
        this.id = id;
        this.tipo = tipo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return id + "|" + nombre + "|" + descripcion + "|" + tipo;
    }
    public String imprimir() {
        return "HerramientaMaterial{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", id=" + id + ", tipo=" + tipo + '}';
    }
}
