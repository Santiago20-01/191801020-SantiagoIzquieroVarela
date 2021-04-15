
import DaoTablas.DaoTaller;
import Tablas.Taller;
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
public class ListaTaller {
    public static void main(String[] args) throws SQLException{
         
        List<Taller> listaTaller = new ArrayList<>();
        listaTaller = DaoTaller.listaTaller();
        
        for(Taller taller:listaTaller){
            System.out.println(taller);
        }
    }
}
