/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardware;

/**
 *
 * @author ramse
 */
public class RAM {
    private double cantidad;
    
    public double getCantidad(){
        return this.cantidad;
    }
    
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    
    public RAM(){
        this.cantidad = 31.98;
    }
    
    public RAM(double cantidad){
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString(){
        return "Cantidad: "+ cantidad;
    }
}
