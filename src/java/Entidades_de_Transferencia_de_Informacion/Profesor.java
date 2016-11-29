
package Entidades_de_Transferencia_de_Informacion;

import java.util.ArrayList;
import java.util.List;


public class Profesor extends Usuario{
    private String horaAtencion;
    private String universidad;
    private List<Curso> cursos = new ArrayList<Curso>();
    
    public Profesor(){}
    public Profesor(String nombre, String apellido, String usuario, String 
            contrasenia, String email, int telefono , int repositorio, byte[] 
                    fotoOLogo, String horaAtencion, String universidad,  
                    List<Curso> cursos){
        
        super(nombre, apellido, usuario, contrasenia, email, telefono, 
                repositorio, fotoOLogo);
        this.horaAtencion = horaAtencion;
        this.universidad = universidad;
        this.cursos = cursos;
        
    }

    public void setHoraAtencion(String horaAtencion) {
        this.horaAtencion = horaAtencion;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
    public void addCurso(Curso curso){
        this.cursos.add(curso);
    }

    public String getHoraAtencion() {
        return horaAtencion;
    }

    public String getUniversidad() {
        return universidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
    
}
