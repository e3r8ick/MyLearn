
package Entidades_de_Transferencia_de_Informacion;

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class EstudianteTest {
    
    public EstudianteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Test of setIdProfesor method, of class Estudiante.
     
    @Test
    public void testSetIdEstudiante() {
        System.out.println("setId");
        int id = 0;
        Estudiante instance = new Estudiante();
        instance.setIdEstudiante(id);
        
    }*/
    
    /**
     * Test of setCarne method, of class Estudiante.
     */
    @Test
    public void testSetCarne() {
        System.out.println("setCarne");
        String carne = "aaaaa";
        Estudiante instance = new Estudiante();
        instance.setCarne(carne);
        
    }

    /**
     * Test of setPais method, of class Estudiante.
     */
    @Test
    public void testSetPais() {
        System.out.println("setPais");
        String pais = "aaaaa";
        Estudiante instance = new Estudiante();
        instance.setPais(pais);
        
    }

    /**
     * Test of setUniversidad method, of class Estudiante.
     */
    @Test
    public void testSetUniversidad() {
        System.out.println("setUniversidad");
        String universidad = "aaaaa";
        Estudiante instance = new Estudiante();
        instance.setUniversidad(universidad);
        
    }

    /**
     * Test of setLinkHojaVida method, of class Estudiante.
     */
    @Test
    public void testSetLinkHojaVida() {
        System.out.println("setLinkHojaVida");
        String linkHojaVida = "aaaaa";
        Estudiante instance = new Estudiante();
        instance.setLinkHojaVida(linkHojaVida);
        
    }
    
    /**
     * Test of addCurso method, of class Estudiante.
     */
    @Test
    public void testAddCurso() {
        System.out.println("addCurso");
        Curso curso = new Curso();
        Estudiante instance = new Estudiante();
        instance.addCurso(curso);
    }
    /**
     * Test of setCursos method, of class Estudiante.
     */
    @Test
    public void testSetCursos() {
        System.out.println("setCursos");
        List<Curso> cursos = new ArrayList<Curso>();
        Estudiante instance = new Estudiante();
        instance.setCursos(cursos);
    }
    
    /**
     * Test of setProyectos method, of class Estudiante.
     */
    @Test
    public void testSetProyectos() {
        System.out.println("setProyectos");
        List<Proyecto> proyectos = new ArrayList<Proyecto>();
        Estudiante instance = new Estudiante();
        instance.setProyectos(proyectos);
    }
    
    /**
     * Test of setTecnologias method, of class Estudiante.
     */
    @Test
    public void testSetTecnologias() {
        System.out.println("setTecnologias");
        List<Tecnologia> tecnologias = new ArrayList<Tecnologia>();
        Estudiante instance = new Estudiante();
        instance.setTecnologias(tecnologias);
    }
    
    /**
     * Test of getId method, of class Estudiante.
     
    @Test
    public void testGetIdEstudiante() {
        System.out.println("getId");
        Estudiante instance = new Estudiante();
        int expResult = 0;
        instance.setIdEstudiante(expResult);
        int result = instance.getIdEstudiante();
        assertEquals(expResult, result);
        
    }*/

    /**
     * Test of getCarne method, of class Estudiante.
     */
    @Test
    public void testGetCarne() {
        System.out.println("getCarne");
        Estudiante instance = new Estudiante();
        String expResult = "aaaa";
        instance.setCarne(expResult);
        String result = instance.getCarne();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPais method, of class Estudiante.
     */
    @Test
    public void testGetPais() {
        System.out.println("getPais");
        Estudiante instance = new Estudiante();
        String expResult = "aaaa";
        instance.setPais(expResult);
        String result = instance.getPais();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getUniversidad method, of class Estudiante.
     */
    @Test
    public void testGetUniversidad() {
        System.out.println("getUniversidad");
        Estudiante instance = new Estudiante();
        String expResult = "aaaaa";
        instance.setUniversidad(expResult);
        String result = instance.getUniversidad();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getLinkHojaVida method, of class Estudiante.
     */
    @Test
    public void testGetLinkHojaVida() {
        System.out.println("getLinkHojaVida");
        Estudiante instance = new Estudiante();
        String expResult = "aaaa";
        instance.setLinkHojaVida(expResult);
        String result = instance.getLinkHojaVida();
        assertEquals(expResult, result);
        
    }
    /**
     * Test of getCursos method, of class Estudiante.
     */
    @Test
    public void testGetCursos() {
        System.out.println("getCursos");
        Estudiante instance = new Estudiante();
        List<Curso> expResult = new ArrayList<Curso>();
        instance.setCursos(expResult);
        List<Curso> result = instance.getCursos();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getProyectosEmpresa method, of class Estudiante.
     */
    @Test
    public void testGetProyectosEmpresas() {
        System.out.println("getProyectosEmpresa");
        Estudiante instance = new Estudiante();
        List<Proyecto> expResult = new ArrayList<Proyecto>();
        instance.setProyectos(expResult);
        List<Proyecto> result = instance.getProyectos();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getTecnologias method, of class Estudiante.
     */
    @Test
    public void testGetTecnologias() {
        System.out.println("getTecnologias");
        Estudiante instance = new Estudiante();
        List<Tecnologia> expResult = new ArrayList<Tecnologia>();
        instance.setTecnologias(expResult);
        List<Tecnologia> result = instance.getTecnologias();
        assertEquals(expResult, result);
        
    }
}
