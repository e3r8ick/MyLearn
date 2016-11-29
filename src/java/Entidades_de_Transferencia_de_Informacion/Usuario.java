
package Entidades_de_Transferencia_de_Informacion;

import java.io.Serializable;

public abstract class Usuario implements Serializable{
    private int id;
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasenia;
    private String email;
    private int telefono; //No me gusta el tipo de dato
    private int repositorio; //No me gusta el tipo de dato
    private byte[] fotoOLogo;
    
    public Usuario() {}
    public Usuario(String nombre, String apellido, String usuario, String 
            contrasenia, String email, int telefono , int repositorio, byte[] 
                    fotoOLogo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.email = email;
        this.telefono = telefono;
        this.repositorio = repositorio;
        this.fotoOLogo = fotoOLogo;
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setRepositorio(int repositorio) {
        this.repositorio = repositorio;
    }

    public void setFotoOLogo(byte[] fotoOLogo) {
        this.fotoOLogo = fotoOLogo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getRepositorio() {
        return repositorio;
    }

    public byte[] getFotoOLogo() {
        return fotoOLogo;
    }
    
    
}
