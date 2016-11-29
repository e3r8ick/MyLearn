
package Entidades_de_Transferencia_de_Informacion;

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ProyectoTest {
    
    public ProyectoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setIdProyecto method, of class Proyecto.
     */
    @Test
    public void testSetIdProyecto() {
        System.out.println("setIdProyecto");
        int idProyecto = 0;
        Proyecto instance = new Proyecto();
        instance.setIdProyecto(idProyecto);
        
    }

    /**
     * Test of setIdEstudiante method, of class Proyecto.
     */
    @Test
    public void testSetIdEstudiante() {
        System.out.println("setIdEstudiante");
        int idEstudiante = 0;
        Proyecto instance = new Proyecto();
        instance.setIdEstudiante(idEstudiante);
        
    }

    /**
     * Test of setIdProfesor method, of class Proyecto.
     */
    @Test
    public void testSetIdProfesor() {
        System.out.println("setIdProfesor");
        int idProfesor = 0;
        Proyecto instance = new Proyecto();
        instance.setIdProfesor(idProfesor);
        
    }

    /**
     * Test of setIdEmpresa method, of class Proyecto.
     */
    @Test
    public void testSetIdEmpresa() {
        System.out.println("setIdEmpresa");
        int idEmpresa = 0;
        Proyecto instance = new Proyecto();
        instance.setIdEmpresa(idEmpresa);
        
    }
    
    /**
     * Test of setIdCurso method, of class Proyecto.
     */
    @Test
    public void testSetIdCurso() {
        System.out.println("setIdCurso");
        int idCurso = 0;
        Proyecto instance = new Proyecto();
        instance.setIdCurso(idCurso);
        
    }
    
    /**
     * Test of setNombre method, of class Proyecto.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "aaa";
        Proyecto instance = new Proyecto();
        instance.setNombre(nombre);
        
    }

    /**
     * Test of setDecripcion method, of class Proyecto.
     */
    @Test
    public void testSetDecripcion() {
        System.out.println("setDecripcion");
        String Decripcion = "aaa";
        Proyecto instance = new Proyecto();
        instance.setDescripcion(Decripcion);
        
    }

    /**
     * Test of setEstado method, of class Proyecto.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        int Estado = 0;
        Proyecto instance = new Proyecto();
        instance.setEstado(Estado);
        
    }

    /**
     * Test of setTipo method, of class Proyecto.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        int Tipo = 0;
        Proyecto instance = new Proyecto();
        instance.setTipo(Tipo);
        
    }

    /**
     * Test of setFechaInicio method, of class Proyecto.
     */
    @Test
    public void testSetFechaInicio() {
        System.out.println("setFechaInicio");
        String FechaInicio = "aaa";
        Proyecto instance = new Proyecto();
        instance.setFechaInicio(FechaInicio);
        
    }

    /**
     * Test of setFechaFinal method, of class Proyecto.
     */
    @Test
    public void testSetFechaFinal() {
        System.out.println("setFechaFinal");
        String FechaFinal = "aaa";
        Proyecto instance = new Proyecto();
        instance.setFechaFinal(FechaFinal);
        
    }
    
    /**
     * Test of setFechaLimiteOferta method, of class Proyecto.
     */
    @Test
    public void testSetFechaLimiteOferta() {
        System.out.println("setFechaLimiteOferta");
        String FechaFinal = "aaa";
        Proyecto instance = new Proyecto();
        instance.setFechaLimiteOferta(FechaFinal);
        
    }

    /**
     * Test of setPresupuesto method, of class Proyecto.
     */
    @Test
    public void testSetPresupuesto() {
        System.out.println("setPresupuesto");
        int Presupuesto = 0;
        Proyecto instance = new Proyecto();
        instance.setPresupuesto(Presupuesto);
        
    }

    /**
     * Test of setCalificacion method, of class Proyecto.
     */
    @Test
    public void testSetCalificacion() {
        System.out.println("setCalificacion");
        float Calificacion = 0.0F;
        Proyecto instance = new Proyecto();
        instance.setCalificacion(Calificacion);
        
    }

    /**
     * Test of setProblematica method, of class Proyecto.
     */
    @Test
    public void testSetProblematica() {
        System.out.println("setProblematica");
        String Problematica = "aaaa";
        Proyecto instance = new Proyecto();
        instance.setProblematica(Problematica);
        
    }

    /**
     * Test of setAdjunto method, of class Proyecto.
     */
    @Test
    public void testSetAdjunto() {
        System.out.println("setAdjunto");
        String Adjunto = "aaa";
        Proyecto instance = new Proyecto();
        instance.setAdjunto(Adjunto);
        
    }
    
    /**
     * Test of setComentarios method, of class Estudiante.
     */
    @Test
    public void testSetComentarios() {
        System.out.println("setComentarios");
        List<Comentario> comentarios = new ArrayList<Comentario>();
        Proyecto instance = new Proyecto();
        instance.setComentarios(comentarios);
    }
    
    /**
     * Test of setOfertas method, of class Estudiante.
     */
    @Test
    public void testSetOfertas() {
        System.out.println("setOfertas");
        List<Oferta> oferta = new ArrayList<Oferta>();
        Proyecto instance = new Proyecto();
        instance.setOfertas(oferta);
    }
    
    /**
     * Test of setTecnologias method, of class Estudiante.
     */
    @Test
    public void testSetTecnologias() {
        System.out.println("setTecnologias");
        List<Tecnologia> tecno = new ArrayList<Tecnologia>();
        Proyecto instance = new Proyecto();
        instance.setTecnologias(tecno);
    }
    
    /**
     * Test of getIdProyecto method, of class Proyecto.
     */
    @Test
    public void testGetIdProyecto() {
        System.out.println("getIdProyecto");
        Proyecto instance = new Proyecto();
        int expResult = 0;
        instance.setIdProyecto(expResult);
        int result = instance.getIdProyecto();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getIdEstudiante method, of class Proyecto.
     */
    @Test
    public void testGetIdEstudiante() {
        System.out.println("getIdEstudiante");
        Proyecto instance = new Proyecto();
        int expResult = 0;
        int result = instance.getIdEstudiante();
        instance.setIdEstudiante(result);
        assertEquals(expResult, result);
        ;
    }

    /**
     * Test of getIdProfesor method, of class Proyecto.
     */
    @Test
    public void testGetIdProfesor() {
        System.out.println("getIdProfesor");
        Proyecto instance = new Proyecto();
        int expResult = 0;
        instance.setIdProfesor(expResult);
        int result = instance.getIdProfesor();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getIdEmpresa method, of class Proyecto.
     */
    @Test
    public void testGetIdEmpresa() {
        System.out.println("getIdEmpresa");
        Proyecto instance = new Proyecto();
        int expResult = 0;
        instance.setIdEmpresa(expResult);
        int result = instance.getIdEmpresa();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getIdCurso method, of class Proyecto.
     */
    @Test
    public void testGetIdCurso() {
        System.out.println("getIdCurso");
        Proyecto instance = new Proyecto();
        int expResult = 0;
        instance.setIdCurso(expResult);
        int result = instance.getIdCurso();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getDecripcion method, of class Proyecto.
     */
    @Test
    public void testGetDecripcion() {
        System.out.println("getDecripcion");
        Proyecto instance = new Proyecto();
        String expResult = "aaa";
        instance.setDescripcion(expResult);
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getEstado method, of class Proyecto.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Proyecto instance = new Proyecto();
        int expResult = 0;
        instance.setEstado(expResult);
        int result = instance.getEstado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTipo method, of class Proyecto.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Proyecto instance = new Proyecto();
        int expResult = 0;
        instance.setTipo(expResult);
        int result = instance.getTipo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getFechaInicio method, of class Proyecto.
     */
    @Test
    public void testGetFechaInicio() {
        System.out.println("getFechaInicio");
        Proyecto instance = new Proyecto();
        String expResult = "aaa";
        instance.setFechaInicio(expResult);
        String result = instance.getFechaInicio();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getFechaFinal method, of class Proyecto.
     */
    @Test
    public void testGetFechaFinal() {
        System.out.println("getFechaFinal");
        Proyecto instance = new Proyecto();
        String expResult = "aaa";
        instance.setFechaFinal(expResult);
        String result = instance.getFechaFinal();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getFechaLimiteOferta method, of class Proyecto.
     */
    @Test
    public void testGetFechaLimiteOferta() {
        System.out.println("getFechaLimiteOferta");
        Proyecto instance = new Proyecto();
        String expResult = "aaa";
        instance.setFechaLimiteOferta(expResult);
        String result = instance.getFechaLimiteOferta();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPresupuesto method, of class Proyecto.
     */
    @Test
    public void testGetPresupuesto() {
        System.out.println("getPresupuesto");
        Proyecto instance = new Proyecto();
        int expResult = 0;
        instance.setPresupuesto(expResult);
        int result = instance.getPresupuesto();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCalificacion method, of class Proyecto.
     */
    @Test
    public void testGetCalificacion() {
        System.out.println("getCalificacion");
        Proyecto instance = new Proyecto();
        float expResult = 0.0F;
        instance.setCalificacion(expResult);
        float result = instance.getCalificacion();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getProblematica method, of class Proyecto.
     */
    @Test
    public void testGetProblematica() {
        System.out.println("getProblematica");
        Proyecto instance = new Proyecto();
        String expResult = "aaa";
        instance.setProblematica(expResult);
        String result = instance.getProblematica();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAdjunto method, of class Proyecto.
     */
    @Test
    public void testGetAdjunto() {
        System.out.println("getAdjunto");
        Proyecto instance = new Proyecto();
        String expResult = "aaa";
        instance.setAdjunto(expResult);
        String result = instance.getAdjunto();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getComentarios method, of class Proyecto.
     */
    @Test
    public void testGetComentarios() {
        System.out.println("getComentarios");
        Proyecto instance = new Proyecto();
        List<Comentario>  expResult = new ArrayList<Comentario>();
        instance.setComentarios(expResult);
        List<Comentario>  result = instance.getComentarios();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getOfertas method, of class Proyecto.
     */
    @Test
    public void testGetOfertas() {
        System.out.println("getOfertas");
        Proyecto instance = new Proyecto();
        List<Oferta>  expResult = new ArrayList<Oferta>();
        instance.setOfertas(expResult);
        List<Oferta> result = instance.getOfertas();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getTecnologias method, of class Proyecto.
     */
    @Test
    public void testGetTecnologias() {
        System.out.println("getTecnologias");
        Proyecto instance = new Proyecto();
        List<Tecnologia>  expResult = new ArrayList<Tecnologia>();
        instance.setTecnologias(expResult);
        List<Tecnologia> result = instance.getTecnologias();
        assertEquals(expResult, result);
        
    }
    
}
