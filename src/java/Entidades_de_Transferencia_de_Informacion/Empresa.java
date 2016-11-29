
package Entidades_de_Transferencia_de_Informacion;

import java.util.ArrayList;
import java.util.List;


public class Empresa extends Usuario{
    private String nombreEmpresarial;
    private String pais;
    private String sitioWeb;
    private List<Proyecto> proyectos = new ArrayList<Proyecto>();
    
    public Empresa(){}
    public Empresa(String nombre, String apellido, String usuario, String 
            contrasenia, String email, int telefono , int repositorio, byte[] 
                    fotoOLogo, String nombreEmpresarial, String pais, String 
                            sitioWeb, List<Proyecto> proyectos){
        
        super(nombre, apellido, usuario, contrasenia, email, telefono, 
                repositorio, fotoOLogo);
        
        this.nombreEmpresarial =  nombreEmpresarial;
        this.pais = pais;
        this.sitioWeb = sitioWeb;
        this.proyectos = proyectos;
        
    }

    public void setNombreEmpresarial(String nombreEmpresarial) {
        this.nombreEmpresarial = nombreEmpresarial;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public String getNombreEmpresarial() {
        return nombreEmpresarial;
    }

    public String getPais() {
        return pais;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }
    
}
