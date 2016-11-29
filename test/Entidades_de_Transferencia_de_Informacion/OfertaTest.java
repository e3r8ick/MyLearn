
package Entidades_de_Transferencia_de_Informacion;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class OfertaTest {
    
    public OfertaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setPrecio method, of class Oferta.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        int precio = 0;
        Oferta instance = new Oferta();
        instance.setPrecio(precio);
        
    }

    /**
     * Test of setTiempo method, of class Oferta.
     */
    @Test
    public void testSetTiempo() {
        System.out.println("setTiempo");
        String tiempo = "";
        Oferta instance = new Oferta();
        instance.setTiempo(tiempo);
        
    }

    /**
     * Test of getPrecio method, of class Oferta.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Oferta instance = new Oferta();
        int expResult = 0;
        instance.setPrecio(expResult);
        int result = instance.getPrecio();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTiempo method, of class Oferta.
     */
    @Test
    public void testGetTiempo() {
        System.out.println("getTiempo");
        Oferta instance = new Oferta();
        String expResult = "aaa";
        instance.setTiempo(expResult);
        String result = instance.getTiempo();
        assertEquals(expResult, result);
        
    }
    
}
