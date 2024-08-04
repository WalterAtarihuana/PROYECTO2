package org.example;

public class Desarrollador {

    private String nombre;
    private String pais;

    public Desarrollador(String nombre, String pais){

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

    public void calificacion(){
        System.out.println("Excelente juego");
    }
}
