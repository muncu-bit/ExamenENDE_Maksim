package Examen;

public class Libro {
    private String  titulo, autor, isbn;
    private boolean prestado;

    public Libro(String titulo, String autor, String isbn, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prestado = prestado;
    }
}
