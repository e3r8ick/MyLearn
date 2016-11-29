/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades_de_Transferencia_de_Informacion;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AndresMaria
 */
public class LogroTest {
    
    public LogroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setIdLogro method, of class Logro.
     */
    @Test
    public void testSetIdLogro() {
        System.out.println("setIdLogro");
        int idLogro = 0;
        Logro instance = new Logro();
        instance.setIdLogro(idLogro);
        
    }

    /**
     * Test of setNombre method, of class Logro.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Logro instance = new Logro();
        instance.setNombre(nombre);
        
    }

    /**
     * Test of setValor method, of class Logro.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        float valor = 0.0F;
        Logro instance = new Logro();
        instance.setValor(valor);
        
    }

    /**
     * Test of setIdCurso method, of class Logro.
     */
    @Test
    public void testSetIdCurso() {
        System.out.println("setIdCurso");
        int idCurso = 0;
        Logro instance = new Logro();
        instance.setIdCurso(idCurso);
        
    }

    /**
     * Test of setIdEstudiaante method, of class Logro.
     */
    @Test
    public void testSetIdEstudiaante() {
        System.out.println("setIdEstudiaante");
        int idEstudiaante = 0;
        Logro instance = new Logro();
        instance.setIdEstudiaante(idEstudiaante);
        
    }

    /**
     * Test of getIdLogro method, of class Logro.
     */
    @Test
    public void testGetIdLogro() {
        System.out.println("getIdLogro");
        Logro instance = new Logro();
        int expResult = 0;
        int result = instance.getIdLogro();
        instance.setIdLogro(result);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNombre method, of class Logro.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Logro instance = new Logro();
        String expResult = "aaa";
        instance.setNombre(expResult);
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getValor method, of class Logro.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Logro instance = new Logro();
        float expResult = 0.0F;
        instance.setValor(expResult);
        float result = instance.getValor();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getIdCurso method, of class Logro.
     */
    @Test
    public void testGetIdCurso() {
        System.out.println("getIdCurso");
        Logro instance = new Logro();
        int expResult = 0;
        instance.setIdCurso(expResult);
        int result = instance.getIdCurso();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getIdEstudiaante method, of class Logro.
     */
    @Test
    public void testGetIdEstudiaante() {
        System.out.println("getIdEstudiaante");
        Logro instance = new Logro();
        int expResult = 0;
        instance.setIdEstudiaante(expResult);
        int result = instance.getIdEstudiaante();
        assertEquals(expResult, result);
        
    }
    
}
