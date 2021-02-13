/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class Pelicula {
    
    public String titulo, director, genero, casaProductora;
    public int año;
    public double duracion;
    public boolean subtitulo;
    
    public Pelicula(){
        
    }
    
    public Pelicula(String titulo, String director, String genero, String casaProductora, int año, double duracion, boolean subtitulo){
        
        this.año = año;
        this.casaProductora = casaProductora;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.subtitulo = subtitulo;
        this.titulo = titulo;
    }
    
    public Pelicula(String titulo){
        this.titulo = titulo;
    }
    
    @Override
    public String toString(){
        return ("\n\nTitulo:"+ titulo +"\nDirector:"+ director +"\nGenero:"+ genero +"\nCasa de produccion"+ casaProductora +"\nAño:"+ año +"\nDuracion:"+ duracion +"\nSubtitulos:"+ subtitulo);
    }
}
