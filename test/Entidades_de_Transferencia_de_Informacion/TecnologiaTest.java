
package Entidades_de_Transferencia_de_Informacion;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TecnologiaTest {
    
    public TecnologiaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setIdTecnologia method, of class Tecnologia.
     */
    @Test
    public void testSetIdTecnologia() {
        System.out.println("setIdTecnologia");
        int idTecnologia = 0;
        Tecnologia instance = new Tecnologia();
        instance.setIdTecnologia(idTecnologia);
        
    }

    /**
     * Test of setNombre method, of class Tecnologia.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Tecnologia instance = new Tecnologia();
        instance.setNombre(nombre);
        
    }

    /**
     * Test of getIdTecnologia method, of class Tecnologia.
     */
    @Test
    public void testGetIdTecnologia() {
        System.out.println("getIdTecnologia");
        Tecnologia instance = new Tecnologia();
        int expResult = 0;
        instance.setIdTecnologia(expResult);
        int result = instance.getIdTecnologia();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNombre method, of class Tecnologia.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Tecnologia instance = new Tecnologia();
        String expResult = "aaaa";
        instance.setNombre(expResult);
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }
    
}
