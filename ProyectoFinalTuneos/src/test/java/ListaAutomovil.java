
import DaoTablas.DaoAutomovil;
import Tablas.Automovil;
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
public class ListaAutomovil {
    public static void main(String[] args) throws SQLException{
         
        List<Automovil> listaAutomovil = new ArrayList<>();
        listaAutomovil = DaoAutomovil.listaAutomovil();
        
        for(Automovil automovil:listaAutomovil){
            System.out.println(automovil);
        }
    }
}
