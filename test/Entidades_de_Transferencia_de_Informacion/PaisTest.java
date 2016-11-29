
package Entidades_de_Transferencia_de_Informacion;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PaisTest {
    
    public PaisTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setIdPais method, of class Pais.
     */
    @Test
    public void testSetIdPais() {
        System.out.println("setIdPais");
        int idPais = 0;
        Pais instance = new Pais();
        instance.setIdPais(idPais);
        
    }

    /**
     * Test of setNombre method, of class Pais.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Pais instance = new Pais();
        instance.setNombre(nombre);
        
    }

    /**
     * Test of getIdPais method, of class Pais.
     */
    @Test
    public void testGetIdPais() {
        System.out.println("getIdPais");
        Pais instance = new Pais();
        int expResult = 0;
        instance.setIdPais(expResult);
        int result = instance.getIdPais();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNombre method, of class Pais.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Pais instance = new Pais();
        String expResult = "aaa";
        instance.setNombre(expResult);
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }
    
}
