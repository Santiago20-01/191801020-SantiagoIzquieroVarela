/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class Planta {
    private int dni;
    private String nombre, nombreCientifico;
    private boolean siEsSol, siEsCurativa;
    
    public Planta(){
        
    }
    
    public Planta(int dni, String nombre, String nombreCientifico, boolean siEsSol, boolean siEsCurativa){
        this.dni = dni;
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.siEsCurativa = siEsCurativa;
        this.siEsSol = siEsSol;
    }
    
    public int getDni(){
        return this.dni;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getNombreCientifico(){
        return this.nombreCientifico;
    }
    
    public boolean getSiEsSol(){
        return this.siEsSol;
    }
    
    public boolean getSiEsCurativa(){
        return this.siEsCurativa;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setDni(int dni){
        this.dni = dni;
    }
    
    public void setNombreCientifico(String nombreCientifico){
        this.nombreCientifico = nombreCientifico;
    }
    
    public void setSiEsSol(boolean siEsSol){
        this.siEsSol = siEsSol;
    }
    
    public void setSiEsCurativa(boolean siEsCurativa){
        this.siEsCurativa = siEsCurativa;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+ nombre;
    }
}
