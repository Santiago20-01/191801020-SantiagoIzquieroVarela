
import DaoTablas.DaoUsuario;
import Tablas.Usuario;
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
public class ListaUsuario {
    public static void main(String[] args) throws SQLException{
         
        List<Usuario> listaUsuario = new ArrayList<>();
        listaUsuario = DaoUsuario.listaUsuario();
        
        for(Usuario usuario:listaUsuario){
            System.out.println(usuario);
        }
    }
}
