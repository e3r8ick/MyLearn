
package JsonFactory;

import Entidades_de_Transferencia_de_Informacion.Curso;
import Entidades_de_Transferencia_de_Informacion.Empresa;
import Entidades_de_Transferencia_de_Informacion.Estudiante;
import Entidades_de_Transferencia_de_Informacion.Pais;
import Entidades_de_Transferencia_de_Informacion.Profesor;
import Entidades_de_Transferencia_de_Informacion.Proyecto;
import Entidades_de_Transferencia_de_Informacion.Tecnologia;
import Entidades_de_Transferencia_de_Informacion.Universidad;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class JsonFactory {
    
    
    public JsonFactory(){
        
    }
    //class Entidades_de_Transferencia_de_Informacion.Comentario
    public JSONObject getJsonFrom(Object entidad){
        JSONObject j= new JSONObject();
        if(entidad == null){
            return j;
        }
        String nombreClase = entidad.getClass().toString();
        if(nombreClase.equals("class Entidades_de_Transferencia_de_Informacion.Estudiante")){
            j = getJsonEstudiante(j, (Estudiante) entidad);
            return j;
        }
        else if(nombreClase.equals("class Entidades_de_Transferencia_de_Informacion.Profesor")){
            j = getJsonProfesor(j, (Profesor) entidad);
            return j;
        }
        else if(nombreClase.equals("class Entidades_de_Transferencia_de_Informacion.Empresa")){
            j = getJsonEmpresa(j, (Empresa) entidad);
            return j;
        }
        else{
            return j;
        }
    }
    
    public JSONObject getJsonForLogin(List<Tecnologia> tecnologias, 
            List<Universidad> universidades, List<Pais> paises){
        JSONObject resp = new JSONObject();
        JSONArray list = new JSONArray();
        JSONObject tecno = getJsonListaDeTecnologias(tecnologias);
        list.add(tecno);
        JSONObject uni =  getJsonListaDeUniversidades(universidades);
        list.add(uni);
        JSONObject pai = getJsonListaDePaises(paises);
        list.add(pai);
        resp.put("formulario", list);
        return resp;
    }

    private JSONObject getJsonEstudiante(JSONObject j, Estudiante estudiante) {
        JSONArray list = new JSONArray();
        JSONObject basicos = new JSONObject();
        basicos.put("id", Integer.toString(estudiante.getId()));
        basicos.put("nombre", estudiante.getNombre());
        basicos.put("apellido", estudiante.getApellido());
        basicos.put("usuario", estudiante.getUsuario());
        basicos.put("contrasenia", estudiante.getContrasenia());
        basicos.put("email", estudiante.getContrasenia());
        basicos.put("telefono", Integer.toString(estudiante.getTelefono()));
        basicos.put("carne", estudiante.getCarne());
        basicos.put("pais", estudiante.getPais());
        basicos.put("universidad", estudiante.getUniversidad());
        basicos.put("linkHojaVida", estudiante.getLinkHojaVida());
        list.add(basicos);
        list.add(getJsonListaDeCursos(estudiante.getCursos()));
        list.add(getJsonListaDeProyectos(estudiante.getProyectos()));
        list.add(getJsonListaDeTecnologias(estudiante.getTecnologias()));
        //repositorio
        //fotoOLogo
        j.put("estudiante", list);
        return j;
    }
    
    private JSONObject getJsonProfesor(JSONObject j, Profesor profesor) {
        JSONArray list = new JSONArray();
        JSONObject basicos = new JSONObject();
        basicos.put("id", Integer.toString(profesor.getId()));
        basicos.put("nombre", profesor.getNombre());
        basicos.put("apellido", profesor.getApellido());
        basicos.put("usuario", profesor.getUsuario());
        basicos.put("contrasenia", profesor.getContrasenia());
        basicos.put("email", profesor.getContrasenia());
        basicos.put("telefono", Integer.toString(profesor.getTelefono()));
        basicos.put("horaAtencion", profesor.getHoraAtencion());
        basicos.put("universidad", profesor.getUniversidad());
        list.add(basicos);
        list.add(getJsonListaDeCursos(profesor.getCursos()));
        //repositorio
        //fotoOLogo
        j.put("profesor", list);
        return j;
    }

    private JSONObject getJsonEmpresa(JSONObject j, Empresa empresa) {
        JSONArray list = new JSONArray();
        JSONObject basicos = new JSONObject();
        basicos.put("id", Integer.toString(empresa.getId()));
        basicos.put("nombre", empresa.getNombre());
        basicos.put("apellido", empresa.getApellido());
        basicos.put("usuario", empresa.getUsuario());
        basicos.put("contrasenia", empresa.getContrasenia());
        basicos.put("email", empresa.getContrasenia());
        basicos.put("telefono", Integer.toString(empresa.getTelefono()));
        basicos.put("nombreEmpresarial", empresa.getNombreEmpresarial());
        basicos.put("pais", empresa.getPais());
        basicos.put("sitioWeb", empresa.getSitioWeb());
        list.add(basicos);
        list.add(getJsonListaDeProyectos(empresa.getProyectos()));
        //repositorio
        //fotoOLogo
        j.put("empresa", list);
        return j;
    }
    
    private JSONObject getJsonListaDeCursos(List<Curso> cursos){
        JSONArray cursosJson = new JSONArray();
        JSONObject resp  = new JSONObject();
        for(int i = 0; i <  cursos.size(); i++){
            JSONObject curso = new JSONObject();
            curso.put("id", Integer.toString(cursos.get(i).getIdCurso()));
            curso.put("nombre", cursos.get(i).getNombre());
            cursosJson.add(curso);
        }
        resp.put("cursos", cursosJson);
        return resp;
    }
    
    private JSONObject getJsonListaDeProyectos(List<Proyecto> proyectos){
        JSONArray proyectosJson = new JSONArray();
        JSONObject resp  = new JSONObject();
        for(int i = 0; i <  proyectos.size(); i++){
            JSONObject proyecto = new JSONObject();
            proyecto.put("id", Integer.toString(proyectos.get(i).getIdProyecto()));
            proyecto.put("nombre", proyectos.get(i).getNombre());
            proyectosJson.add(proyecto);
        }
        resp.put("proyectos", proyectosJson);
        return resp;
    }
    
    private JSONObject getJsonListaDeTecnologias(List<Tecnologia> tecnologias){
        JSONArray tecnologiasJson = new JSONArray();
        JSONObject resp  = new JSONObject();
        for(int i = 0; i <  tecnologias.size(); i++){
            JSONObject tecnologia = new JSONObject();
            tecnologia.put("id", Integer.toString(tecnologias.get(i).getIdTecnologia()));
            tecnologia.put("nombre", tecnologias.get(i).getNombre());
            tecnologiasJson.add(tecnologia);
        }
        resp.put("tecnologias", tecnologiasJson);
        return resp;
    }
    
    private JSONObject getJsonListaDeUniversidades(List<Universidad> universidades){
        JSONArray universidadesJson = new JSONArray();
        JSONObject resp  = new JSONObject();
        for(int i = 0; i <  universidades.size(); i++){
            JSONObject universidad = new JSONObject();
            universidad.put("id", Integer.toString(universidades.get(i).getIdUniversidad()));
            universidad.put("nombre", universidades.get(i).getNombre());
            universidadesJson.add(universidad);
        }
        resp.put("universidades", universidadesJson);
        return resp;
    }
    
    private JSONObject getJsonListaDePaises(List<Pais> paises){
        JSONArray paisesJson = new JSONArray();
        JSONObject resp  = new JSONObject();
        for(int i = 0; i <  paises.size(); i++){
            JSONObject pais = new JSONObject();
            pais.put("id", Integer.toString(paises.get(i).getIdPais()));
            pais.put("nombre", paises.get(i).getNombre());
            paisesJson.add(pais);
        }
        resp.put("paises", paisesJson);
        return resp;
    }
}
