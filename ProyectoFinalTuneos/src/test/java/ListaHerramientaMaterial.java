
import DaoTablas.DaoHerramientaMaterial;
import Tablas.HerramientaMaterial;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class ListaHerramientaMaterial {
    public static void main(String[] args) throws SQLException{
         
        List<HerramientaMaterial> listaHerramientaMaterial = new ArrayList<>();
        listaHerramientaMaterial = DaoHerramientaMaterial.listaHerramientaMaterial();
        
        for(HerramientaMaterial herramientaMaterial:listaHerramientaMaterial){
            System.out.println(herramientaMaterial);
        }
    }
}
