package com.parcial;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

       
        Libro libro1 = new Libro("Don Quijote", "Cervantes", 5, 0);

        Scanner sc = new Scanner(System.in);

        Libro libro2 = new Libro();

        System.out.println("Ingrese titulo:");
        libro2.setTitulo(sc.nextLine());

        System.out.println("Ingrese autor:");
        libro2.setAutor(sc.nextLine());

        System.out.println("Ingrese numero de ejemplares:");
        libro2.setEjemplares(sc.nextInt());

        libro2.setPrestados(0);

        
        LibroTextoUNIAJC libroUniac = new LibroTextoUNIAJC(
                "Programacion II",
                "Juan Perez",
                10,
                0,
                "Programacion",
                "Ingenieria"
        );

        Novela novela1 = new Novela(
                "1984",
                "George Orwell",
                4,
                0,
                "Ciencia Ficcion"
        );

        
        libro1.prestamo();
        libro1.prestamo();
        libro1.devolucion();

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libroUniac);
        System.out.println(novela1);

    }
}