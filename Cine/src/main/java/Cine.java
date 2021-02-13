
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
    
    public int numPeliculas(){
        System.out.println("Total de peliculas: ");
        return peliculas.size();
    }
    
    public String menuPeliculas(){
        String menu = "";
        int i = 1;
        menu += "\tMENU\n";
        for (Pelicula pelicula:peliculas){
            menu += i + "- " + pelicula.titulo + "\n";
            i++;
        }
        return menu;
    }
  
    public void horaCine(int horaEn){
        
        if(horaIn <= horaEn && horaOut >= horaEn){
            System.out.println("Si esta abierto");
        }
        else{
            System.out.println("No esta abierto");
        }
    }
    
    @Override
    public String toString(){
        return "Nombre: "+ nombre;
    }
}
