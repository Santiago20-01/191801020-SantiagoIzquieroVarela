
import hardware.RAM;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class TestRAM {
    public static void main(String[] args) {
        
        RAM amd = new RAM(31.98);
        
        System.out.println(amd);
        
        amd.setCantidad(62.31);
        
        System.out.println(amd);
    }
}
