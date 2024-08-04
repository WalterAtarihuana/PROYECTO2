package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Videojuegos> nombre = new ArrayList<>();

        Videojuegos Usuario1 = new Videojuegos("Walter", "Ecuador", "walter@gmail.com");
        Videojuegos Usuario2 = new Videojuegos("Fiorella", "Ecuador", "fiorella@gmail.com");
        Videojuegos Usuario3 = new Videojuegos("Scarlet", "Canada", "Scarlet@hotmail.com");
        nombre.add(Usuario1);
        nombre.add(Usuario2);
        nombre.add(Usuario3);

        Usuario1.actualizarNombre("Ismael");
        Usuario1.validarInformacion();
        Usuario1.calificacion();

        Usuario2.actualizarNombre("Isabelle");
        Usuario2.validarInformacion();
        Usuario2.calificacion();

        Usuario3.actualizarNombre("Amaya");
        Usuario3.validarInformacion();
        Usuario3.calificacion();



        List<Videojuegos> genero = new ArrayList<>();
        Videojuegos genero1 = new Videojuegos("MArio bros", "Ecuador","Aventura");
        Videojuegos genero2 = new Videojuegos("FreeFire","Colombia", "Batalla");
        Videojuegos genero3 = new Videojuegos("Call of Duty", "Argentina", "Batalla");
        genero.add(genero1);
        genero.add(genero2);
        genero.add(genero3);

        genero1.actualizarNombre("Mario Bros");
        genero1.validarInformacion();
        genero1.calificacion();

        genero2.actualizarNombre("Free fire 6to Aniversario");
        genero2.validarInformacion();
        genero2.calificacion();

        genero3.actualizarNombre("Call of Duty Apocalitico");
        genero3.validarInformacion();
        genero3.calificacion();

        for (Videojuegos usuario : genero) {
            if ("Ecuador".equals(usuario.getPais())) {
                System.out.println(usuario.getNombre() + " - " + usuario.getPais());
            }
        }

        for (Videojuegos usuario : nombre) {
            if ("Ecuador".equals(usuario.getPais())) {
                System.out.println(usuario.getNombre() + " - " + usuario.getPais());
            }
        }
    }
}