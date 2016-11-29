
package Entidades_de_Transferencia_de_Informacion;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class LogroOptenidoTest {
    
    public LogroOptenidoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setIdLogroObtenido method, of class LogroOptenido.
     */
    @Test
    public void testSetIdLogroObtenido() {
        System.out.println("setIdLogroObtenido");
        int idLogroObtenido = 0;
        LogroOptenido instance = new LogroOptenido();
        instance.setIdLogroObtenido(idLogroObtenido);
        
    }

    /**
     * Test of setIdCurso method, of class LogroOptenido.
     */
    @Test
    public void testSetIdCurso() {
        System.out.println("setIdCurso");
        int idCurso = 0;
        LogroOptenido instance = new LogroOptenido();
        instance.setIdCurso(idCurso);
        
    }

    /**
     * Test of setIdEstudiante method, of class LogroOptenido.
     */
    @Test
    public void testSetIdEstudiante() {
        System.out.println("setIdEstudiante");
        int idEstudiante = 0;
        LogroOptenido instance = new LogroOptenido();
        instance.setIdEstudiante(idEstudiante);
        
    }

    /**
     * Test of setIdLogro method, of class LogroOptenido.
     */
    @Test
    public void testSetIdLogro() {
        System.out.println("setIdLogro");
        int idLogro = 0;
        LogroOptenido instance = new LogroOptenido();
        instance.setIdLogro(idLogro);
        
    }

    /**
     * Test of setEstado method, of class LogroOptenido.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        boolean estado = false;
        LogroOptenido instance = new LogroOptenido();
        instance.setEstado(estado);
        
    }

    /**
     * Test of getIdLogroObtenido method, of class LogroOptenido.
     */
    @Test
    public void testGetIdLogroObtenido() {
        System.out.println("getIdLogroObtenido");
        LogroOptenido instance = new LogroOptenido();
        int expResult = 0;
        instance.setIdLogroObtenido(expResult);
        int result = instance.getIdLogroObtenido();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getIdCurso method, of class LogroOptenido.
     */
    @Test
    public void testGetIdCurso() {
        System.out.println("getIdCurso");
        LogroOptenido instance = new LogroOptenido();
        int expResult = 0;
        instance.setIdCurso(expResult);
        int result = instance.getIdCurso();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getIdEstudiante method, of class LogroOptenido.
     */
    @Test
    public void testGetIdEstudiante() {
        System.out.println("getIdEstudiante");
        LogroOptenido instance = new LogroOptenido();
        int expResult = 0;
        instance.setIdEstudiante(expResult);
        int result = instance.getIdEstudiante();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getIdLogro method, of class LogroOptenido.
     */
    @Test
    public void testGetIdLogro() {
        System.out.println("getIdLogro");
        LogroOptenido instance = new LogroOptenido();
        int expResult = 0;
        instance.setIdLogro(expResult);
        int result = instance.getIdLogro();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEstado method, of class LogroOptenido.
     */
    @Test
    public void testIsEstado() {
        System.out.println("isEstado");
        LogroOptenido instance = new LogroOptenido();
        boolean expResult = false;
        instance.setEstado(expResult);
        boolean result = instance.isEstado();
        assertEquals(expResult, result);
        
    }
    
}
