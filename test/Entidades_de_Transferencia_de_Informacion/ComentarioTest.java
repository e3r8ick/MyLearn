
package Entidades_de_Transferencia_de_Informacion;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ComentarioTest {
    
    public ComentarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setAdjunto method, of class Comentario.
     */
    @Test
    public void testSetAdjunto() {
        System.out.println("setAdjunto");
        String adjunto = "aaa";
        Comentario instance = new Comentario();
        instance.setAdjunto(adjunto);
        
    }

    /**
     * Test of setNombreArchivo method, of class Comentario.
     */
    @Test
    public void testSetNombreArchivo() {
        System.out.println("setNombreArchivo");
        String nombreArchivo = "aaa";
        Comentario instance = new Comentario();
        instance.setNombreArchivo(nombreArchivo);
        
    }

    /**
     * Test of setRespuesta method, of class Comentario.
     */
    @Test
    public void testSetRespuesta() {
        System.out.println("setRespuesta");
        int respuesta = 0;
        Comentario instance = new Comentario();
        instance.setRespuesta(respuesta);
        
    }

    /**
     * Test of getAdjunto method, of class Comentario.
     */
    @Test
    public void testGetAdjunto() {
        System.out.println("getAdjunto");
        Comentario instance = new Comentario();
        String expResult = "aaa";
        instance.setAdjunto(expResult);
        String result = instance.getAdjunto();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNombreArchivo method, of class Comentario.
     */
    @Test
    public void testGetNombreArchivo() {
        System.out.println("getNombreArchivo");
        Comentario instance = new Comentario();
        String expResult = "aaa";
        instance.setNombreArchivo(expResult);
        String result = instance.getNombreArchivo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getRespuesta method, of class Comentario.
     */
    @Test
    public void testGetRespuesta() {
        System.out.println("getRespuesta");
        Comentario instance = new Comentario();
        int expResult = 0;
        instance.setRespuesta(expResult);
        int result = instance.getRespuesta();
        assertEquals(expResult, result);
        
    }
    
}
