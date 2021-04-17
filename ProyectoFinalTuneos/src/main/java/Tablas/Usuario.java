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
public class Usuario {
    
    private String nombre, contraseña, fechaAlta;
    private int idUsuario;

    public Usuario() {
    }

    public Usuario(String nombre, String contraseña, String fechaAlta, int idUsuario) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.fechaAlta = fechaAlta;
        this.idUsuario = idUsuario;
    }

    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(String nombre, int idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
    }
    
    public Usuario(int idUsuario, String contraseña) {
        this.idUsuario = idUsuario;
        this.contraseña = contraseña;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return nombre +"|"+ contraseña +"|"+ fechaAlta +"|"+ idUsuario ;
    }
    public String imprimir() {
        return "Usuario{" + "nombre=" + nombre + ", contrase\u00f1a=" + contraseña + ", fechaAlta=" + fechaAlta + ", idUsuario=" + idUsuario + '}';
    }
}
