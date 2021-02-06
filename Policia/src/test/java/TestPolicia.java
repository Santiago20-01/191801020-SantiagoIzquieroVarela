/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class TestPolicia {
    public static void main(String[] args) {
        Policia comandante = new Policia();
        comandante.puesto = "Comandate";
        comandante.esposas = 1;
        comandante.macana = 1;
        comandante.pistola = 2;
        comandante.placa = 1;
        comandante.uniforme = 1;
        
        System.out.println(comandante);
    }
}
