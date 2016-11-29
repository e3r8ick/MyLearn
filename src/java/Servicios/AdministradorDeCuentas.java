/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Administrador_MySQL_ORM.Admin_MySQL_Usuario;
import Administrador_MySQL_ORM.Adminitrador_MySQL_ORM;
import Entidades_de_Transferencia_de_Informacion.Curso;
import Entidades_de_Transferencia_de_Informacion.Empresa;
import Entidades_de_Transferencia_de_Informacion.Estudiante;
import Entidades_de_Transferencia_de_Informacion.Pais;
import Entidades_de_Transferencia_de_Informacion.Profesor;
import Entidades_de_Transferencia_de_Informacion.Proyecto;
import Entidades_de_Transferencia_de_Informacion.Tecnologia;
import Entidades_de_Transferencia_de_Informacion.Tupla;
import Entidades_de_Transferencia_de_Informacion.Universidad;
import JsonFactory.JsonFactory;
import org.springframework.stereotype.Service;
import Seguridad.Encriptacion;
import java.util.List;
import org.json.simple.JSONObject;

/**
 *
 * @author Víctor
 */
@Service
public class AdministradorDeCuentas {
    public JSONObject obtenerInfoDeCrearCuenta(){
        JSONObject resp = new JSONObject();
        JsonFactory factory = new JsonFactory();
        List tecnologias = Adminitrador_MySQL_ORM.getListaEntidades(Tecnologia.class);
        List universides = Adminitrador_MySQL_ORM.getListaEntidades(Universidad.class);
        List paises = Adminitrador_MySQL_ORM.getListaEntidades(Pais.class);
        resp = factory.getJsonForLogin(tecnologias, universides, paises);
        return resp;
    }
    
    public Tupla validarUsuario(String usuario,String contrasenia){
        Tupla resp = new Tupla();
        Estudiante estudiante = null;
        estudiante = validarEstudiante(usuario, contrasenia);
        if(estudiante != null){
            resp.setId(estudiante.getId());
            resp.setTipo("estudiante");
            return resp;
        }
        Profesor profesor = null;
        profesor = validarProfesor(usuario, contrasenia); 
        if(profesor != null){
            resp.setId(profesor.getId());
            resp.setTipo("profesor");
            return resp;
        }
        Empresa empresa = null;
        empresa = validarEmpresa(usuario, contrasenia);
        if(empresa != null){
            resp.setId(empresa.getId());
            resp.setTipo("empresa");
            return resp;
        }
        else 
            resp.setId(-1);
            resp.setTipo("no existe");
            return resp;
    }
    
    public JSONObject obtenerInfoDePerfil(Tupla tupla){
        Admin_MySQL_Usuario admin = new Admin_MySQL_Usuario();
        JSONObject resp = new JSONObject();
        JsonFactory factory = new JsonFactory();
        if(tupla.getTipo().equals("estudiante")){
            Estudiante estudiante = null;
            estudiante = Adminitrador_MySQL_ORM.getEntidad(tupla.getId(), Estudiante.class);
            resp = factory.getJsonFrom(estudiante);
            return resp;
        }
        else if(tupla.getTipo().equals("profesor")){
            Profesor profesor = null;
            profesor = Adminitrador_MySQL_ORM.getEntidad(tupla.getId(), Profesor.class);
            resp = factory.getJsonFrom(profesor);
            return resp;
        }
        else if(tupla.getTipo().equals("empresa")){
            Empresa empresa = null;
            empresa = Adminitrador_MySQL_ORM.getEntidad(tupla.getId(), Empresa.class);
            resp = factory.getJsonFrom(empresa);
            return resp;
        }
        else{
            return resp;
        }
    }
    
    public void crearCuentaDeEstudiante(String nombre, String apellido, String usuario, String 
            contrasenia, String email, int telefono , int repositorio, byte[] 
                    fotoOLogo, String carne, String pais, String universidad, 
                    String linkHojaVida,  List<Curso> cursos, 
                    List<Proyecto> proyectosEmpresa, List<Tecnologia> tecnologias){
        Estudiante estudiante = new Estudiante(nombre, apellido, usuario, 
            contrasenia, email, telefono , repositorio, 
                    fotoOLogo, carne, pais, universidad, 
                    linkHojaVida,   cursos, 
                     proyectosEmpresa, tecnologias);
        Adminitrador_MySQL_ORM.almacenaEntidad(estudiante);
        
    }
    
    public void crearCuentaDeProfesor(String nombre, String apellido, String usuario, String 
            contrasenia, String email, int telefono , int repositorio, byte[] 
                    fotoOLogo, String horaAtencion, String universidad,  
                    List<Curso> cursos){
        Profesor profesor = new Profesor(nombre, apellido, usuario, 
            contrasenia, email, telefono , repositorio, 
                    fotoOLogo, horaAtencion, universidad,  
                    cursos);
        Adminitrador_MySQL_ORM.almacenaEntidad(profesor);
        
    }
    
    public void crearCuentaDeEmpresa(String nombre, String apellido, String usuario, String 
            contrasenia, String email, int telefono , int repositorio, byte[] 
                    fotoOLogo, String nombreEmpresarial, String pais, String 
                            sitioWeb, List<Proyecto> proyectos){
        Empresa empresa = new Empresa(nombre, apellido, usuario, 
            contrasenia, email, telefono , repositorio,  
                    fotoOLogo, nombreEmpresarial, pais, 
                            sitioWeb, proyectos);
        Adminitrador_MySQL_ORM.almacenaEntidad(empresa);
    }
    
    public Estudiante validarEstudiante(String usuario,String contrasenia){
        Admin_MySQL_Usuario valor = new Admin_MySQL_Usuario();
        Estudiante estudiante = null;
        contrasenia = hashContrasenia(contrasenia);
   
        try{
            estudiante = valor.getEstudiante(usuario, contrasenia);
        }catch (Exception e){
            return null;
        }   
        if (estudiante==null){
            return null;
        }
        else
            return estudiante;
    }
    
    public Profesor validarProfesor(String usuario,String contrasenia){
        Admin_MySQL_Usuario valor = new Admin_MySQL_Usuario();
        Profesor profesor = null;
        contrasenia = hashContrasenia(contrasenia);
   
        try{
            profesor = valor.getProfesor(usuario, contrasenia);
        }catch (Exception e){
            return null;
        }   
        if (profesor==null){
            return null;
        }
        else
            return profesor;
    }
    
    public Empresa validarEmpresa(String usuario,String contrasenia){
        Admin_MySQL_Usuario valor = new Admin_MySQL_Usuario();
        Empresa empresa = null;
        contrasenia = hashContrasenia(contrasenia);
   
        try{
            empresa = valor.getEmpresa(usuario, contrasenia);
        }catch (Exception e){
            return null;
        }   
        if (empresa==null){
            return null;
        }
        else
            return empresa;
    }
    
    private String hashContrasenia(String contrasenia){
        
        String hash=contrasenia;//metodo para hashear el valor introducido por el usuario
        hash = Encriptacion.sha256(contrasenia);
        return hash;
    }
}
 
