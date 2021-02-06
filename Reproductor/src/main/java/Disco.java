
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class Disco {
    
    public String nombre;
    public String artista;
    public int anio;
    public ArrayList <Cancion> cancion;
    
    public Disco(){
        
    }
    public Disco(String nombre, String artista, int anio, ArrayList <Cancion> cancion){
        
        this.anio = anio;
        this.artista = artista;
        this.cancion = cancion;
        this.nombre = nombre;
        
    }
    
    @Override
    public String toString(){
        return "Año: "+ anio +"\nArtista: "+ artista +"Cancion: "+ cancion +"\nNombre: "+ nombre;
    }

}
