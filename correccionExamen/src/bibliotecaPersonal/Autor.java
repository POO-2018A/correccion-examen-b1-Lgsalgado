package bibliotecaPersonal;

import java.util.Objects;

public class Autor {
    private String nombre;
    private String pais;
    private int id;
    public static int contador2=0;

    public Autor() {
        this.contador2++;
        this.id=this.contador2;
    }

    public Autor(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContador2() {
        return contador2;
    }

    public static void setContador2(int contador2) {
        Autor.contador2 = contador2;
    }

    @Override
    public String toString() {
        return '\n' +"Nombre: " + nombre + '\n' +
                "Pais:  " + pais + '\n'+ "Libros : "+ (id+1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            id++;
            return true;}
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(nombre, autor.nombre) &&
                Objects.equals(pais, autor.pais);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nombre, pais);
    }
}
