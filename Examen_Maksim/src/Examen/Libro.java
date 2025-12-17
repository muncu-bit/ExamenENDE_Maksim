package Examen;
/**
 * La clase Libro representa un libro en la librería con atributos como
 * título, autor, ISBN y un estado de préstamo.
 */

public class Libro {
    private String  titulo, autor, isbn;
    private boolean prestado;

    public Libro(String titulo, String autor, String isbn, boolean prestado) {
        this.titulo = titulo;       // Título del libro
        this.autor = autor;         // Autor del libro
        this.isbn = isbn;           // Número de ISBN del libro
        this.prestado = prestado;   // Indica si el libro está prestado o no
    }

    /**
     * Constructor de la clase Libro que inicializa todos los atributos.
     *
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param isbn El número de ISBN del libro.
     * @param prestado Indica si el libro está prestado o no.
     */

    /**
     * Obtiene el título del libro.
     *
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece un nuevo título para el libro.
     *
     * @param titulo El nuevo título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro.
     *
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece un nuevo autor para el libro.
     *
     * @param autor El nuevo autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }


    /**
     * Obtiene el número de ISBN del libro.
     *
     * @return El número de ISBN del libro.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Establece un nuevo número de ISBN para el libro.
     *
     * @param isbn El nuevo número de ISBN del libro.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Indica si el libro está prestado.
     *
     * @return true si el libro está prestado, false en caso contrario.
     */
    public boolean isPrestado() {
        return prestado;
    }

    /**
     * Establece el estado de préstamo del libro.
     *
     * @param prestado true si el libro debe estar prestado, false en caso contrario.
     */
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    /**
     * Devuelve una representación en cadena del libro.
     *
     * @return Una cadena que representa los atributos del libro.
     */
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", prestado=" + prestado +
                '}';
    }
}
