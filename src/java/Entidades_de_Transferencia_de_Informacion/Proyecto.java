
package Entidades_de_Transferencia_de_Informacion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Proyecto implements Serializable{
    private int idProyecto;
    private int idEstudiante;
    private int idProfesor;
    private int idEmpresa;
    private int idCurso;
    private String nombre;
    private String descripcion;
    private int estado;//'0 = En OFerta, 1 = Activo, 2 = Terminado'
    private int tipo;//'0 = Curso, 1 = Empresa'
    private String fechaInicio;
    private String fechaFinal;
    private String fechaLimiteOferta;
    private int presupuesto;// 'Es lo que va a invertir la empresa'
    private float calificacion; 
    private String problematica;//'Solo para proyectos de curso'
    private String adjunto;
    private List<Comentario> comentarios = new ArrayList<Comentario>();
    private List<Oferta> ofertas = new ArrayList<Oferta>();
    private List<Tecnologia> tecnologias = new ArrayList<Tecnologia>();
    
    public Proyecto(){}
    
    public Proyecto( int idEstudiante, int idProfesor, int idEmpresa, int idCurso,
            String nombre, String Decripcion, int Estado, int Tipo, String FechaInicio, 
            String  FechaFinal, String fechaLimiteOferta, int Presupuesto, float 
                    Calificacion, String Problematica, String Adjunto, 
                    List<Comentario> comentarios, List<Oferta> ofertas, 
                    List<Tecnologia> tecnologias){
        
        this.idProyecto = idProyecto;
        this.idEstudiante = idEstudiante;
        this.idProfesor = idProfesor;
        this.idEmpresa = idEmpresa;
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.descripcion = Decripcion;
        this.estado = Estado;
        this.tipo = Tipo;
        this.fechaInicio = FechaInicio;
        this.fechaFinal = FechaFinal;
        this.fechaLimiteOferta = fechaLimiteOferta;
        this.presupuesto = Presupuesto;
        this.calificacion = Calificacion; 
        this.problematica = Problematica;
        this.adjunto = Adjunto;
        this.comentarios = comentarios;
        this.ofertas = ofertas;
        this.tecnologias = tecnologias;
    }
    ///Agregar archivos de mapeo

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String Decripcion) {
        this.descripcion = Decripcion;
    }

    public void setEstado(int Estado) {
        this.estado = Estado;
    }

    public void setTipo(int Tipo) {
        this.tipo = Tipo;
    }

    public void setFechaInicio(String FechaInicio) {
        this.fechaInicio = FechaInicio;
    }

    public void setFechaFinal(String FechaFinal) {
        this.fechaFinal = FechaFinal;
    }

    public void setFechaLimiteOferta(String fechaLimiteOferta) {
        this.fechaLimiteOferta = fechaLimiteOferta;
    }

    public void setPresupuesto(int Presupuesto) {
        this.presupuesto = Presupuesto;
    }

    public void setCalificacion(float Calificacion) {
        this.calificacion = Calificacion;
    }

    public void setProblematica(String Problematica) {
        this.problematica = Problematica;
    }

    public void setAdjunto(String Adjunto) {
        this.adjunto = Adjunto;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public void setOfertas(List<Oferta> ofertas) {
        this.ofertas = ofertas;
    }

    public void setTecnologias(List<Tecnologia> tecnologias) {
        this.tecnologias = tecnologias;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public int getIdEmpresa() {
        return idEmpresa;
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

    public int getEstado() {
        return estado;
    }

    public int getTipo() {
        return tipo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public String getFechaLimiteOferta() {
        return fechaLimiteOferta;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public String getProblematica() {
        return problematica;
    }

    public String getAdjunto() {
        return adjunto;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public List<Oferta> getOfertas() {
        return ofertas;
    }

    public List<Tecnologia> getTecnologias() {
        return tecnologias;
    }
}
