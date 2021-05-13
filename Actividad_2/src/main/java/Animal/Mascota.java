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
public class Mascota extends Animal {
    
    private String hacerruido;

    public Mascota() {
        super();
    }

    public Mascota(String hacerruido, String comer, String dormir, String respirar) {
        super(comer, dormir, respirar);
        this.hacerruido = hacerruido;
    }
    
}
