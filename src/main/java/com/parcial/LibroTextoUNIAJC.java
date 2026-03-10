package com.parcial;

public class LibroTextoUNIAJC extends LibroTexto {

    private String facultad;

    public LibroTextoUNIAJC(String titulo, String autor, int ejemplares, int prestados, String curso, String facultad) {
        super(titulo, autor, ejemplares, prestados, curso);
        this.facultad = facultad;
    }

    public String toString() {
        return super.toString() + ", Facultad: " + facultad;
    }
}


