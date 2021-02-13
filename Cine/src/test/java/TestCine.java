
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class TestCine {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String titulo;
        int opcion;
        
        //ArrayList <Pelicula> peliculas = new ArrayList();
        Cine cine = new Cine("Love", 9, 10);
         
        do{
            System.out.println("Ingrese el titulo de la pelicula:");
            scanner.nextLine();
            titulo=scanner.nextLine();
            Pelicula nuevaPeli = new Pelicula(titulo);
            //peliculas.add(nueva);
            cine.agregarPelicula(nuevaPeli);
            System.out.println("Si desea ingresar otra pelicula ingrese 1");
            opcion = scanner.nextInt();
        }while(opcion==1);
        
        //Cine cine = new Cine("Love", 9, 11, peliculas);
        System.out.println(cine.imprimirPeliculas());
    }
}
