
package Entidades_de_Transferencia_de_Informacion;

import java.io.Serializable;


public class Universidad implements Serializable{
    private int idUniversidad;
    private String nombre;
    
    public Universidad(){}
    
    public Universidad(int idUniversidad, String nombre){
        this.idUniversidad = idUniversidad;
        this.nombre = nombre;
    }

    public void setIdUniversidad(int idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdUniversidad() {
        return idUniversidad;
    }

    public String getNombre() {
        return nombre;
    }
}
