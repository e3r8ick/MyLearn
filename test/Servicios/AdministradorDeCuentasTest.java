/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades_de_Transferencia_de_Informacion.Tupla;
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
public class AdministradorDeCuentasTest {
    private AdministradorDeCuentas adminCuent;
    public AdministradorDeCuentasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        adminCuent = new AdministradorDeCuentas();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test para probar que se validen los usuarios estudiante en la base de datos  
    */
    @Test
    public void testValidarEstudianteNoExiste() {
       Tupla result;
       String expected="no existe";
 
       result = adminCuent.validarUsuario("Victor", "4546");
       
       
       assertEquals(expected,result.getTipo());
    }
    @Test
    public void testValidarEstudianteSiExiste() {
       Tupla result;
       String expected = "estudiante";
       result = adminCuent.validarUsuario("andress", "abc123");
       assertEquals(expected,result.getTipo());
    }
    
    
}
