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
public class Automovil {
    
    private String marca, modelo, año, placa;
    private int idAutomovil;

    public Automovil() {
        
    }

    public Automovil(String marca, String modelo, String año, String placa, int idAutomovil) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.placa = placa;
        this.idAutomovil = idAutomovil;
    }

    public Automovil(String marca, String modelo, String año, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.placa = placa;
    }

    public Automovil(int idAutomovil) {
        this.idAutomovil = idAutomovil;
    }
    
    public Automovil(String marca, String modelo, String año, int idAutomovil) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.idAutomovil = idAutomovil;
    }

    public Automovil(String placa, int idAutomovil) {
        this.placa = placa;
        this.idAutomovil = idAutomovil;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getIdAutomovil() {
        return idAutomovil;
    }

    public void setIdAutomovil(int idAutomovil) {
        this.idAutomovil = idAutomovil;
    }

    @Override
    public String toString() {
        return idAutomovil + "|" + marca + "|" + modelo + "|" + año + "|" + placa;
    }
    
    public String imprimir() {
        return "Automovil{" + "marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", placa=" + placa + ", idAutomovil=" + idAutomovil + '}';
    }
}
