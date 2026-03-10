package com.parcial;

public class LibroTexto extends Libro {

    private String curso;

    public LibroTexto(String titulo, String autor, int ejemplares, int prestados, String curso) {
        super(titulo, autor, ejemplares, prestados);
        this.curso = curso;
    }

    public String toString() {
        return super.toString() + ", Curso: " + curso;
    }
}


