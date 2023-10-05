package pds_actividad_03_01_grupo05_escenario02_iterator;

public class Principal {

    public static void main(String[] args) {
        // Crear algunos libros
        Libro libro1 = new Libro("El Gran Gatsby", "F. Scott Fitzgerald", "Ficción", 1925);
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "Ficción", 1967);
        Libro libro3 = new Libro("1984", "George Orwell", "Ciencia Ficción", 1949);

        // Crear una colección de libros
        ColeccionLibros coleccion = new ColeccionLibros();

        // Agregar libros a la colección
        coleccion.agregarLibro(libro1);
        coleccion.agregarLibro(libro2);
        coleccion.agregarLibro(libro3);

        // Obtener un iterador para recorrer la colección de libros
        IteradorLibros iterador = coleccion.obtenerIterador();

        // Recorrer y mostrar los libros
        System.out.println("Libros en la colección:");
        while (iterador.hasNext()) {
            Libro libro = iterador.next();
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Género: " + libro.getGenero());
            System.out.println("Año de Publicación: " + libro.getAnioPublicacion());
            System.out.println();
        }
    }
    
}
