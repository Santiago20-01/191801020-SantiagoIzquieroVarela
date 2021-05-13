/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author ramse
 */
public class Animal {
    
    private String comer, dormir, respirar;

    public Animal() {
    }

    public Animal(String comer, String dormir, String respirar) {
        this.comer = comer;
        this.dormir = dormir;
        this.respirar = respirar;
    }

    @Override
    public String toString() {
        return "Animal{" + "comer=" + comer + ", dormir=" + dormir + ", respirar=" + respirar + '}';
    }

}
