# Parcial I - Programación II
Proyecto de sistema de gestión de biblioteca.
## Diagrama UML

```mermaid

classDiagram
    class Libro {
        - String titulo
        - String autor
        - int ejemplares
        - int prestados
        + Libro()
        + Libro(String, String, int, int)
        + getTitulo() String
        + setTitulo(String)
        + getAutor() String
        + setAutor(String)
        + getEjemplares() int
        + setEjemplares(int)
        + getPrestados() int
        + setPrestados(int)
    }
    
    class Novela {
        - String tipo
        + Novela(String, String, int, int, String)
        + toString() String
    }
    
    class LibroTexto {
        - String curso
        + LibroTexto(String, String, int, int, String)
        + toString() String
    }
    
    class LibroTextoUNIAJC {
        - String facultad
        + LibroTextoUNIAJC(String, String, int, int, String, String)
        + toString() String
    }
    
    Libro <|-- Novela
    Libro <|-- LibroTexto
    LibroTexto <|-- LibroTextoUNIAJC

```
## Casos donde la herencia no sería posible
Clase final: final class Libro {
    String titulo;
}

Problema: class Novela extends Libro {
}. Esto da error porque una clase final no puede ser heredada en Java.


Constructor privado: public class Libro {
    private Libro() {
    }
}

Problema: class LibroTexto extends Libro {
}. Error porque las subclases no pueden acceder a un constructor private.

## Atributos
private int añoPublicacion;
private String editorial;

## Metodo
public int ejemplaresDisponibles() {
    return ejemplares - prestados;
}

Actualización final del proyecto.
