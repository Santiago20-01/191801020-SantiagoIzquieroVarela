/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class UsuariosFotos {
    
    private String nombre, contraseña, nombreFotos, fechaQueSeTomo, formato;
    private int id;

    public UsuariosFotos() {
    }

    public UsuariosFotos(String nombre, String contraseña, String nombreFotos, String fechaQueSeTomo, String formato, int id) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.nombreFotos = nombreFotos;
        this.fechaQueSeTomo = fechaQueSeTomo;
        this.formato = formato;
        this.id = id;
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

    public String getNombreFotos() {
        return nombreFotos;
    }

    public void setNombreFotos(String nombreFotos) {
        this.nombreFotos = nombreFotos;
    }

    public String getFechaQueSeTomo() {
        return fechaQueSeTomo;
    }

    public void setFechaQueSeTomo(String fechaQueSeTomo) {
        this.fechaQueSeTomo = fechaQueSeTomo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UsuariosFotos{" + "nombre=" + nombre + ", contrase\u00f1a=" + contraseña + ", nombreFotos=" + nombreFotos + ", fechaQueSeTomo=" + fechaQueSeTomo + ", formato=" + formato + ", id=" + id + '}';
    }
    
}
