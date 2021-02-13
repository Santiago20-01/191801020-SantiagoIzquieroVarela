
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
        int opcion, hora;
        
        //ArrayList <Pelicula> peliculas = new ArrayList();
        Cine cine = new Cine("Cinepolis", 9, 22);
        
        do{
            System.out.println("Ingrese el titulo de la pelicula:");
            scanner.nextLine();
            titulo = scanner.nextLine();
            Pelicula nuevaPeli = new Pelicula(titulo);
            //peliculas.add(nueva);
            cine.agregarPelicula(nuevaPeli);
            System.out.println("Si desea ingresar otra pelicula ingrese 1");
            opcion = scanner.nextInt();
        }while(opcion==1);
        
        System.out.println(cine.numPeliculas());
        System.out.println(cine.menuPeliculas());
        System.out.println("Ingrese a la hora para saber si esta abierto el cine: ");
        hora = scanner.nextInt();
        cine.horaCine(hora);
    }
}
