
package Entidades_de_Transferencia_de_Informacion;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MensajeTest {
    
    public MensajeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setId method, of class Mensaje.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Mensaje instance = new MensajeImpl();
        instance.setId(id);
        
    }

    /**
     * Test of setIdAutor method, of class Mensaje.
     */
    @Test
    public void testSetIdAutor() {
        System.out.println("setIdAutor");
        int idAutor = 0;
        Mensaje instance = new MensajeImpl();
        instance.setIdAutor(idAutor);
        
    }

    /**
     * Test of setIdProyecto method, of class Mensaje.
     */
    @Test
    public void testSetIdProyecto() {
        System.out.println("setIdProyecto");
        int idProyecto = 0;
        Mensaje instance = new MensajeImpl();
        instance.setIdProyecto(idProyecto);
        
    }

    /**
     * Test of setComentario method, of class Mensaje.
     */
    @Test
    public void testSetComentario() {
        System.out.println("setComentario");
        String comentario = "aaa";
        Mensaje instance = new MensajeImpl();
        instance.setComentario(comentario);
        
    }

    /**
     * Test of setFecha method, of class Mensaje.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "aaaa";
        Mensaje instance = new MensajeImpl();
        instance.setFecha(fecha);
        
    }

    /**
     * Test of setHora method, of class Mensaje.
     */
    @Test
    public void testSetHora() {
        System.out.println("setHora");
        String hora = "aaaa";
        Mensaje instance = new MensajeImpl();
        instance.setHora(hora);
        
    }

    /**
     * Test of getId method, of class Mensaje.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Mensaje instance = new MensajeImpl();
        int expResult = 0;
        instance.setId(expResult);
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getIdAutor method, of class Mensaje.
     */
    @Test
    public void testGetIdAutor() {
        System.out.println("getIdAutor");
        Mensaje instance = new MensajeImpl();
        int expResult = 0;
        instance.setIdAutor(expResult);
        int result = instance.getIdAutor();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getIdProyecto method, of class Mensaje.
     */
    @Test
    public void testGetIdProyecto() {
        System.out.println("getIdProyecto");
        Mensaje instance = new MensajeImpl();
        int expResult = 0;
        instance.setIdProyecto(expResult);
        int result = instance.getIdProyecto();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getComentario method, of class Mensaje.
     */
    @Test
    public void testGetComentario() {
        System.out.println("getComentario");
        Mensaje instance = new MensajeImpl();
        String expResult = "aaa";
        instance.setComentario(expResult);
        String result = instance.getComentario();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getFecha method, of class Mensaje.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Mensaje instance = new MensajeImpl();
        String expResult = "aaa";
        instance.setFecha(expResult);
        String result = instance.getFecha();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getHora method, of class Mensaje.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        Mensaje instance = new MensajeImpl();
        String expResult = "aaa";
        instance.setHora(expResult);
        String result = instance.getHora();
        assertEquals(expResult, result);
        
    }

    public class MensajeImpl extends Mensaje {
    }
    
}
