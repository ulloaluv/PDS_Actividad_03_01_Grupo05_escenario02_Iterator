package pds_actividad_03_01_grupo05_escenario02_iterator;

import java.util.List;

public class LibrosIterator implements IteradorLibros {
    private List<Libro> libros;
    private int posicionActual;

    public LibrosIterator(List<Libro> libros) {
        this.libros = libros;
        this.posicionActual = 0;
    }

    @Override
    public boolean hasNext() {
        return posicionActual < libros.size();
    }

    @Override
    public Libro next() {
        if (hasNext()) {
            Libro libro = libros.get(posicionActual);
            posicionActual++;
            return libro;
        }
        return null;
    }
}
