
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
public class Cine {
    public String nombre;
    public int horaIn, horaOut;
    public ArrayList <Pelicula> peliculas = new ArrayList();
    
    public Cine(){
        this.horaIn = 0;
        this.horaOut = 0;
        this.nombre = "";
        this.peliculas = null;
    }
    
    public Cine(String nombre, int horaIn, int horaOut, ArrayList <Pelicula> peliculas){
        this.horaIn = horaIn;
        this.horaOut = horaOut;
        this.nombre = nombre;
        this.peliculas = peliculas;
    }
    
    public Cine(String nombre, int horaIn, int horaOut){
        this.horaIn = horaIn;
        this.horaOut = horaOut;
        this.nombre = nombre;
        this.peliculas = null;
    }
    
    public String imprimirPeliculas(){
        String cartelera = "";
        for(Pelicula pelicula:peliculas){
            cartelera += pelicula.titulo+"\n";
        }
        return cartelera;
    }
    
    public void agregarPelicula(Pelicula pelicula){
            peliculas.add(pelicula);
    }
    
    @Override
    public String toString(){
        return "Nombre: "+ nombre;
    }
}
