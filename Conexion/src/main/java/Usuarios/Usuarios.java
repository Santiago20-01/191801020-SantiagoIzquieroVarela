package Usuarios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class Usuarios {
    
    private String nombre, contraseña, fechaDeAlta;
    private int id;
    private boolean status;

    public Usuarios() {
    }

    public Usuarios(String nombre, String contraseña, String fechaDeAlta, int id, boolean status) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.fechaDeAlta = fechaDeAlta;
        this.id = id;
        this.status = status;
    }
    
    public Usuarios(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }
    
    public Usuarios(int id) {
        this.id = id;
    }
    
    public Usuarios(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Usuarios(String contraseña, int id) {
        this.contraseña = contraseña;
        this.id = id;
    }

    public Usuarios(Usuarios usuario, String contraseña) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(String fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public String imprimir() {
        return "usuarios{" + "nombre=" + nombre + ", contrase\u00f1a=" + contraseña + ", fechaDeAlta=" + fechaDeAlta + ", id=" + id + ", status=" + status + '}';
    }
}
