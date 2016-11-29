
package Entidades_de_Transferencia_de_Informacion;

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ProfesorTest {
    
    public ProfesorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    /**
     * Test of setIdProfesor method, of class Profesor.
     
    @Test
    public void testSetIdProfesor() {
        System.out.println("setId");
        int id = 0;
        Profesor instance = new Profesor();
        instance.setIdProfesor(id);
        
    } */
   
    
    /**
     * Test of setHoraAtencion method, of class Profesor.
     */
    @Test
    public void testSetHoraAtencion() {
        System.out.println("setHoraAtencion");
        String horaAtencion = "aaaaaaaaaaaaaa  + 11!!!";
        Profesor instance = new Profesor();
        System.out.println(instance.getClass().getName());
        instance.setHoraAtencion(horaAtencion);
        
    }

    /**
     * Test of setUniversidad method, of class Profesor.
     */
    @Test
    public void testSetUniversidad() {
        System.out.println("setUniversidad");
        String universidad = "aaaaaaaaaaaaaa  + 11";
        Profesor instance = new Profesor();
        instance.setUniversidad(universidad);
     
    }
    /**
     * Test of addCurso method, of class Profesor.
     */
    @Test
    public void testAddCurso() {
        System.out.println("addCurso");
        Curso curso = new Curso();
        Profesor instance = new Profesor();
        instance.addCurso(curso);
    }
    /**
     * Test of setCursos method, of class Profesor.
     */
    @Test
    public void testSetCursos() {
        System.out.println("setCursos");
        List<Curso> cursos = new ArrayList<Curso>();
        Profesor instance = new Profesor();
        instance.setCursos(cursos);
    }
    /**
     * Test of getId method, of class Profesor.
     
    @Test
    public void testGetIdProfesor() {
        System.out.println("getId");
        Profesor instance = new Profesor();
        int expResult = 0;
        instance.setIdProfesor(expResult);
        int result = instance.getIdProfesor();
        assertEquals(expResult, result);
        
    }*/

    /**
     * Test of getHoraAtencion method, of class Profesor.
     */
    @Test
    public void testGetHoraAtencion() {
        System.out.println("getHoraAtencion");
        Profesor instance = new Profesor();
        String expResult = "aaaaa";
        instance.setHoraAtencion("aaaaa");
        String result = instance.getHoraAtencion();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getUniversidad method, of class Profesor.
     */
    @Test
    public void testGetUniversidad() {
        System.out.println("getUniversidad");
        Profesor instance = new Profesor();
        String expResult = "aaaaa";
        instance.setUniversidad("aaaaa");
        String result = instance.getUniversidad();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getCursos method, of class Profesor.
     */
    @Test
    public void testGetCursos() {
        System.out.println("getCursos");
        Profesor instance = new Profesor();
        List<Curso> expResult = new ArrayList<Curso>();
        instance.setCursos(expResult);
        List<Curso> result = instance.getCursos();
        assertEquals(expResult, result);
        
    }
}
