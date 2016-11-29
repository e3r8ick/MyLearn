/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Víctor
 */
public class ControlInicioTest {
    
    public ControlInicioTest() {
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
     * Test of ControlValidarUsuario method, of class ControlInicio.
     */
    @Test
    public void testControlValidarUsuario() {
        System.out.println("ControlValidarUsuario");
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        
        ControlInicio instance = new ControlInicio();
        ModelAndView expResult = new ModelAndView();
        expResult.setViewName("PerfilEstudiante");
        
        ModelAndView result = instance.ControlValidarUsuario(req, res);
        System.out.println(result.getViewName());
        assertEquals(expResult.getViewName(), result.getViewName());
        // TODO review the generated test code and remove the default call to fail
    }
    
}
