
package Entidades_de_Transferencia_de_Informacion;

import java.io.Serializable;

public class Logro implements Serializable{
    private int idLogro;
    private String nombre;
    private float valor;
    private int idCurso;
    private int idEstudiaante; //..........
    
    public Logro(){}
    
    public Logro( int idLogro, String nombre, float valor, int idCurso,
            int idEstudiaante){
        this.idLogro = idLogro;
        this.nombre = nombre;
        this.valor = valor;
        this.idCurso = idCurso;
        this.idEstudiaante = idEstudiaante;
    }

    public void setIdLogro(int idLogro) {
        this.idLogro = idLogro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public void setIdEstudiaante(int idEstudiaante) {
        this.idEstudiaante = idEstudiaante;
    }

    public int getIdLogro() {
        return idLogro;
    }

    public String getNombre() {
        return nombre;
    }

    public float getValor() {
        return valor;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public int getIdEstudiaante() {
        return idEstudiaante;
    }
}
