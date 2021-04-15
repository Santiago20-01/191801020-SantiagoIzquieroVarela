
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Tablas.Cliente;
import DaoTablas.DaoCliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class ListaCliente {
    public static void main(String[] args) throws SQLException{
         
        List<Cliente> listaCliente = new ArrayList<>();
        listaCliente = DaoCliente.listaCliente();
        
        for(Cliente cliente:listaCliente){
            System.out.println(cliente);
        }
    }
}
