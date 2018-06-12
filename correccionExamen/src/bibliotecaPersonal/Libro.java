package bibliotecaPersonal;

import static java.lang.System.*;

public class Libro {
    private String titulo;
    private int anio;
    public boolean favorito;
    private Autor autor;
    public static int contador=0;

    public Libro() {
        this.contador++;
    }

    public Libro(String titulo, int anio, boolean favorito, Autor autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.favorito = favorito;
        this.autor = autor;
    }

    public Libro(String titulo, int anio, boolean favorito) {
        this.titulo = titulo;
        this.anio = anio;
        this.favorito = favorito;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Libro.contador = contador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + '\n' +
                " Año: " + anio+ '\n' +
                "favorito: " +(favorito ? "SI" : "NO") +'\n' + "Autor Datos" + autor ;
    }

}
