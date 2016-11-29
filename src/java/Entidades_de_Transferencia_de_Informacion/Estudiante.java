
package Entidades_de_Transferencia_de_Informacion;

import java.util.ArrayList;
import java.util.List;


public class Estudiante extends Usuario{
    private String carne;
    private String pais;
    private String universidad;
    private String linkHojaVida;
    private List<Curso> cursos = new ArrayList<Curso>();
    private List<Proyecto> proyectos = new ArrayList<Proyecto>();
    private List<Tecnologia> tecnologias = new ArrayList<Tecnologia>();
    
    public Estudiante(){};
    public Estudiante(String nombre, String apellido, String usuario, String 
            contrasenia, String email, int telefono , int repositorio, byte[] 
                    fotoOLogo, String carne, String pais, String universidad, 
                    String linkHojaVida,  List<Curso> cursos, 
                    List<Proyecto> proyectosEmpresa, List<Tecnologia> tecnologias){
        
        super(nombre, apellido, usuario, contrasenia, email, telefono, 
                repositorio, fotoOLogo);
        
        this.carne = carne;
        this.pais = pais;
        this.universidad = universidad;
        this.linkHojaVida = linkHojaVida;
        this.cursos = cursos;
        this.proyectos = proyectosEmpresa;
        this.tecnologias = tecnologias;
    };

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public void setLinkHojaVida(String linkHojaVida) {
        this.linkHojaVida = linkHojaVida;
    }
    
    public void addCurso(Curso curso){
        this.cursos.add(curso);
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void setProyectos(List<Proyecto> proyectosEmpresa) {
        this.proyectos = proyectosEmpresa;
    }

    public void setTecnologias(List<Tecnologia> tecnologias) {
        this.tecnologias = tecnologias;
    }

    public String getCarne() {
        return carne;
    }

    public String getPais() {
        return pais;
    }

    public String getUniversidad() {
        return universidad;
    }

    public String getLinkHojaVida() {
        return linkHojaVida;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public List<Tecnologia> getTecnologias() {
        return tecnologias;
    }
    
}
