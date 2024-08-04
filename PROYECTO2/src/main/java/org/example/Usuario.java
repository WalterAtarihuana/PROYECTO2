package org.example;

public class Usuario extends Desarrollador implements Desarroladores {

    private String correo;

    public Usuario(String nombre, String pais, String correo){

        super(nombre,pais);

        this.correo = correo;

    }

    @Override
    public boolean validarInformacion() {
            if(correo != null && correo.endsWith("@gmail.com")){
                System.out.println("El correo es valido");
                return true;
            }else{
                System.out.println("El correo es invalido");
                return false;
            }
    }

    @Override
    public String actualizarNombre(String nuevoNombre) {
        return "Se actualizo el nombre a: " + nuevoNombre;

    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}


