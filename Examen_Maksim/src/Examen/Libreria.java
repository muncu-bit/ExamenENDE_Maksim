package Examen;
/**
 * La clase Libreria contiene el método principal (main) que crea un libro
 * y muestra su representación en forma de texto.
 */

public class Libreria {
    public static void main(String[] args) {
        /**
         * El método principal que se ejecuta al iniciar la aplicación.
         * Crea un objeto Libro y muestra su información en la consola.
         *
         * @param args Argumentos de línea de comandos (no utilizados aquí).
         */
        Libro libro1 = new Libro("Examen", "TuNombre" ,"171225" ,false);
        System.out.println(libro1.toString());
    }
}
