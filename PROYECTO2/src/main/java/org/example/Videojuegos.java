package org.example;

public class Videojuegos extends Desarrollador implements Desarroladores{

    private String genero;

    public Videojuegos(String nombre, String pais, String genero){

        super(nombre, pais);

        this.genero = genero;
    }


    @Override
    public boolean validarInformacion() {
        if ("Batalla".equals(genero)) {
            System.out.println("El género es de Batalla.");
            return true;
        } else {
            System.out.println("El género no es de Batalla.");
            return false;
        }
    }

    @Override
    public String actualizarNombre(String nuevoNombre) {
        return "Su nuevo nombre es: " + nuevoNombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
