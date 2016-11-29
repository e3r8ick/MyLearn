
package Entidades_de_Transferencia_de_Informacion;

import java.io.Serializable;


public class Pais implements Serializable{
    private int idPais;
    private String nombre;
    
    public Pais(){}
    
    public Pais( int idPais, String nombre){
        this.idPais = idPais;
        this.nombre = nombre;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPais() {
        return idPais;
    }

    public String getNombre() {
        return nombre;
    }
}
