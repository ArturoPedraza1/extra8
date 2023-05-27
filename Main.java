package org.example;

import org.example.modelo.Libro;
import org.example.persistencia.DemoLibroDB;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DemoLibroDB demo = new DemoLibroDB();

        Libro libro = new Libro(0,"El juego","Desconocido");
       /* if (demo.insertarLibro(libro)){
            System.out.println("Se inserto correctamente");
        }else{
            System.out.println("No se inserto");
        }*/
        System.out.println(demo.buscarlibroporID(1));
        System.out.println("------------------------");

        for (Libro tmp: demo.obtenertodos()) {
            System.out.println("Libro: "+tmp);
            System.out.println("Titulo"+tmp.getTitulo());
        }
    }
}