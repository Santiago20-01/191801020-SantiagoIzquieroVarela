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
public class Trabajo {
    
    private String descripcion, fechaInicio, fechaFin;
    private int idTrabajo;

    public Trabajo() {
        
    }

    public Trabajo(String descripcion, String fechaInicio, String fechaFin, int idTrabajo) {
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.idTrabajo = idTrabajo;
    }
    
    public Trabajo(String descripcion, String fechaInicio, String fechaFin) {
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    public Trabajo(int idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public Trabajo(String descripcion, int idTrabajo) {
        this.descripcion = descripcion;
        this.idTrabajo = idTrabajo;
    }

    public Trabajo(String fechaInicio, String fechaFin, int idTrabajo) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.idTrabajo = idTrabajo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(int idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    @Override
    public String toString() {
        return idTrabajo + "|" + descripcion + "|" + fechaInicio + "|" + fechaFin;
    }
    
    public String imprimir() {
        return "Trabajo{" + "descripcion=" + descripcion + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", idTrabajo=" + idTrabajo + '}';
    }
}
