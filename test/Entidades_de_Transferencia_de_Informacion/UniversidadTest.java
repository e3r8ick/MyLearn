
package Entidades_de_Transferencia_de_Informacion;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class UniversidadTest {
    
    public UniversidadTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setIdUniversidad method, of class Universidad.
     */
    @Test
    public void testSetIdUniversidad() {
        System.out.println("setIdUniversidad");
        int idUniversidad = 0;
        Universidad instance = new Universidad();
        instance.setIdUniversidad(idUniversidad);
        
    }

    /**
     * Test of setNombre method, of class Universidad.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "aaa";
        Universidad instance = new Universidad();
        instance.setNombre(nombre);
        
    }

    /**
     * Test of getIdUniversidad method, of class Universidad.
     */
    @Test
    public void testGetIdUniversidad() {
        System.out.println("getIdUniversidad");
        Universidad instance = new Universidad();
        int expResult = 0;
        instance.setIdUniversidad(expResult);
        int result = instance.getIdUniversidad();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNombre method, of class Universidad.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Universidad instance = new Universidad();
        String expResult = "aaa";
        instance.setNombre(expResult);
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }
    
}
