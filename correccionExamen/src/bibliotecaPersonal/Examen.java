package bibliotecaPersonal;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Examen {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        Libro[] libros = new Libro[10];
        Libro[] librosFavoritos = new Libro[10];
        Autor[] autores = new Autor[4];

        autores[0] = new Autor("A1", "P1");
        autores[1] = new Autor("A2", "P2");
        autores[2] = new Autor("A3", "P3");
        autores[3] = new Autor("A4", "P4");

        do {
            System.out.println("**************BIBLIOTECA PERSONAL**************");
            System.out.println();
            System.out.println("1.-INGRESAR NUEVO LIBRO A BIBLIOTECA: ");
            System.out.println("2.-IMPRIMIR LISTA DE TODOS LOS LIBROS FAVORITOS ");
            System.out.println("3.-CONTAR LIBROS DE AUTOR");
            System.out.println("4.-SALIR");
            opcion = scan.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("CUANTOS LIBROS DESEA INGRESAR: ");
                    System.out.println("RECUERDE SOLO PUEDE INGRESAR HASTA 10 LIBROS");
                    int x=scan.nextInt();
                        for (int i = 0; i < x; i++) {
                            scan.nextLine();
                            System.out.println("LIBRO " + (i + 1));
                            System.out.println("INGRESE EL TITULO: ");
                            String titulo = scan.nextLine();
                            //scan.nextLine();
                            System.out.println("INGRESE AÑO: ");
                            int anioLibro = scan.nextInt();
                            // System.out.println();
                            scan.nextLine();
                            System.out.println("SU LIBRO ES FAVORITO :");
                            System.out.println("INGRESE SI/NO");
                            String siOno=scan.nextLine();
                                    boolean libroFavorito=false;
                                    if(siOno.equals("si")||siOno.equals("SI")){
                                        libroFavorito=true;
                                        libros[i]=new Libro(titulo,anioLibro,libroFavorito);
                                        librosFavoritos[i]=libros[i];
                                    }

                            System.out.println("Seleccione el autor");
                            System.out.println("1. " + autores[0].getNombre());
                            System.out.println("2. " + autores[1].getNombre());
                            System.out.println("3. " + autores[2].getNombre());
                            System.out.println("4. " + autores[3].getNombre());

                            int opcionAutor = scan.nextInt();
                            scan.nextLine();

                            Autor autorLibro = autores[(opcionAutor - 1)];
                            Libro nuevoLibro = new Libro(titulo, anioLibro, libroFavorito, autorLibro);
                            libros [i]=new Libro(titulo,anioLibro,libroFavorito,autorLibro);

                            System.out.println(libros[i]);

                        }
                        break;

                case 2:
                    System.out.println("USTED SELECCIONO IMPRIMIR LOS LIBROS FAVORITOS");
                    System.out.println("SU LISTA ES: ");
                    for (int j=0;j<libros.length;j++){
                        if(libros[j]!=null) {
                            System.out.println(librosFavoritos[j]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("USTED SELECCIONO CONTAR LIBROS");
                    for (int i=0;i<libros.length;i++){
                        if(libros[i]!=null){
                            System.out.println(libros[i].getAutor());
                        }

                    }
                    break;
                case 4:
                    System.out.println("GRACIAS");
                    break;
                default:
                    System.out.println("OPCION INCORRECTA INGRESE UNA OPCION VALIDA");
                    System.out.println();

                    break;
            }
        }while (opcion != 4) ;
    }
}

