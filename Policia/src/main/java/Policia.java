/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class Policia {
    
    public String puesto;
    public int placa, pistola, esposas, macana, uniforme;
    
    //metodos
    @Override
    public String toString(){
        return "Su puesto es: " + puesto + "\n Numero de placas que posee: " + placa + "\n Pistolas que posee: " + pistola + "\n Esposas que tiene: " + esposas + "\n Macanas que tiene: " + macana + "\n Unifomes que tiene: " + uniforme;
    }
}
