
package Entidades_de_Transferencia_de_Informacion;

import java.io.Serializable;


public class LogroOptenido implements Serializable{
    private int idLogroObtenido;
    private int idCurso;
    private int idEstudiante;
    private int idLogro;
    private boolean estado;
    
    public LogroOptenido(){}
    public LogroOptenido( int idCurso, int idEstudiante, 
            int idLogro, boolean estado){
        this.idCurso = idCurso;
        this.idEstudiante = idEstudiante;
        this.idLogro = idLogro;
        this.estado = estado;
        
    }

    public void setIdLogroObtenido(int idLogroObtenido) {
        this.idLogroObtenido = idLogroObtenido;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public void setIdLogro(int idLogro) {
        this.idLogro = idLogro;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdLogroObtenido() {
        return idLogroObtenido;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public int getIdLogro() {
        return idLogro;
    }

    public boolean isEstado() {
        return estado;
    }
    
    
}
