
package Entidades_de_Transferencia_de_Informacion;

import java.io.Serializable;


public abstract class Mensaje implements Serializable{
    private int id;
    private int idAutor;
    private int idProyecto;
    private String comentario;
    private String fecha;
    private String hora;
    
    public Mensaje(){}
    
    public Mensaje(int id, int idAutor, int idProyecto, String comentario,
            String fecha, String hora){
        this.id = id;
        this.idAutor = idAutor;
        this.idProyecto = idProyecto;
        this.comentario = comentario;
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public String getComentario() {
        return comentario;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
}
