
package Entidades_de_Transferencia_de_Informacion;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TuplaTest {
    
    public TuplaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setId method, of class Tupla.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Tupla instance = new Tupla();
        instance.setId(id);
        
    }

    /**
     * Test of setTipo method, of class Tupla.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Tupla instance = new Tupla();
        instance.setTipo(tipo);
        
    }

    /**
     * Test of getId method, of class Tupla.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Tupla instance = new Tupla();
        int expResult = 0;
        instance.setId(expResult);
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTipo method, of class Tupla.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Tupla instance = new Tupla();
        String expResult = "";
        instance.setTipo(expResult);
        String result = instance.getTipo();
        assertEquals(expResult, result);
        
    }
    
}
