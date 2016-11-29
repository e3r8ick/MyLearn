
package Entidades_de_Transferencia_de_Informacion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Curso implements Serializable{
    private int idCurso;
    private String nombre;
    private String descripcion;
    private int numeroDeGrupo;
    private float notaMinima;
    private int estado;//'0 = En curso, 1 = Terminado',
    private String fechaDeInicio;
    private List<Estudiante> estudiantes = new ArrayList<Estudiante>();
    private List<Profesor> profesores = new ArrayList<Profesor>();
    private List<Logro> logros = new ArrayList<Logro>();
    
    public Curso(){}
    
    public Curso(String nombre, String Descripcion, int 
            numeroDeGrupo, float notaMinima, int estado, String fechaDeInicio, 
            List<Estudiante> estudiantes, List<Profesor> profesores, 
            List<Logro> logros){
        this.nombre = nombre;
        this.descripcion = Descripcion;
        this.numeroDeGrupo = numeroDeGrupo;
        this.notaMinima = notaMinima;
        this.estado = estado;
        this.fechaDeInicio = fechaDeInicio;
        this.estudiantes = estudiantes;
        this.profesores = profesores;
        this.logros = logros;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public void setNumeroDeGrupo(int numeroDeGrupo) {
        this.numeroDeGrupo = numeroDeGrupo;
    }

    public void setNotaMinima(float notaMinima) {
        this.notaMinima = notaMinima;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setFechaDeInicio(String fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void setLogros(List<Logro> logros) {
        this.logros = logros;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroDeGrupo() {
        return numeroDeGrupo;
    }

    public float getNotaMinima() {
        return notaMinima;
    }

    public int getEstado() {
        return estado;
    }

    public String getFechaDeInicio() {
        return fechaDeInicio;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public List<Logro> getLogros() {
        return logros;
    }
}
