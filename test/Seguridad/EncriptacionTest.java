/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seguridad;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Víctor
 */
public class EncriptacionTest {
    
    public EncriptacionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sha256 method, of class Encriptacion.
     */
    @Test
    public void testSha256MismoHash() {
        System.out.println("testSha256MismoHash");
        String result1 = Encriptacion.sha256("myPassword123");
        String temp="myPassword123";
        String result2 = Encriptacion.sha256(temp);
        
        assertEquals(result1, result2);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
