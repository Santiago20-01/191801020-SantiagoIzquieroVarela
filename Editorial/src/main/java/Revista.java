/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class Revista {
    
    private String titulo;
    private int id, dia, mes, año;
    
    public String setTitulo(String titulo){
        return this.titulo;
    }
    
    public int setId(int id){
        return this.id;
    }
    
    public int setDia(int dia){
        return this.dia;
    }
    
    public int setMes(int mes){
        return this.mes;
    }
    
    public int setAño(int año){
        return this.año;
    }
    
    public void getTitulo(){
        this.titulo = "Avon";
    }
    
    public void getId(){
        this.id = 12334;
    }
    
    public void getDia(){
        this.dia = 1;
    }
    
    public Revista(){
        this.año = 0;
        this.dia = 0;
        this.id = 0;
        this.titulo = "";
    }
    
    public Revista(String titulo, int id, int dia, int mes, int año){
        this.año = año;
        this.dia = dia;
        this.id = id;
        this.mes =  mes;
        this.titulo = titulo;
    }
    
    @Override
    public String toString(){
        return "Titulo: "+ titulo +"\nID: "+ id +"\nDia: "+ dia +"\nMes: "+ mes +"\nAño: "+ año;
    }
}
