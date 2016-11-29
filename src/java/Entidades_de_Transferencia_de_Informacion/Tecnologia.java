
package Entidades_de_Transferencia_de_Informacion;

import java.io.Serializable;


public class Tecnologia implements Serializable{
    private int idTecnologia;
    private String nombre;
    
    
    public Tecnologia(){}
    
    public Tecnologia( int idTecnologia, String nombre ){
        this.idTecnologia = idTecnologia;
        this.nombre = nombre;
    }

    public void setIdTecnologia(int idTecnologia) {
        this.idTecnologia = idTecnologia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdTecnologia() {
        return idTecnologia;
    }

    public String getNombre() {
        return nombre;
    }
}
