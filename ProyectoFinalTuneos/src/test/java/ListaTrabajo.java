
import DaoTablas.DaoTrabajo;
import Tablas.Trabajo;
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
public class ListaTrabajo {
    public static void main(String[] args) throws SQLException{
         
        List<Trabajo> listaTrabajo = new ArrayList<>();
        listaTrabajo = DaoTrabajo.listaTrabajo();
        
        for(Trabajo trabajo:listaTrabajo){
            System.out.println(trabajo);
        }
    }
}
