package pds_actividad_03_01_grupo05_escenario02_iterator;

import java.util.ArrayList;
import java.util.List;

public class ColeccionLibros {
    private List<Libro> libros;

    public ColeccionLibros() {
        libros = new ArrayList<>();
    }

    // Agregar un libro a la colección
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Obtener un iterador para recorrer la colección de libros
    public IteradorLibros obtenerIterador() {
        return new LibrosIterator(libros);
    }
}