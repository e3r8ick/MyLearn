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
public class UsuarioTest {
    
    public UsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Test of setIdProfesor method, of class Usuario.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Usuario instance = new UsuarioImpl();
        instance.setId(id);
        
    } 

    /**
     * Test of setNombre method, of class Usuario.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "sasas";
        Usuario instance = new UsuarioImpl();
        instance.setNombre(nombre);
        
    }

    /**
     * Test of setApellido method, of class Usuario.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "asasss";
        Usuario instance = new UsuarioImpl();
        instance.setApellido(apellido);
        
    }

    /**
     * Test of setUsuario method, of class Usuario.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String usuario = "assasa";
        Usuario instance = new UsuarioImpl();
        instance.setUsuario(usuario);
        
    }

    /**
     * Test of setContrasenia method, of class Usuario.
     */
    @Test
    public void testSetContrasenia() {
        System.out.println("setContrasenia");
        String contrasenia = "asasas";
        Usuario instance = new UsuarioImpl();
        instance.setContrasenia(contrasenia);
        
    }

    /**
     * Test of setEmail method, of class Usuario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "asasas";
        Usuario instance = new UsuarioImpl();
        instance.setEmail(email);
        
    }

    /**
     * Test of setTelefono method, of class Usuario.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        int telefono = 0;
        Usuario instance = new UsuarioImpl();
        instance.setTelefono(telefono);
        
    }

    /**
     * Test of setRepositorio method, of class Usuario.
     */
    @Test
    public void testSetRepositorio() {
        System.out.println("setRepositorio");
        int repositorio = 0;
        Usuario instance = new UsuarioImpl();
        instance.setRepositorio(repositorio);
        
    }

    /**
     * Test of setFotoOLogo method, of class Usuario.
     */
    @Test
    public void testSetFotoOLogo() {
        System.out.println("setFotoOLogo");
        byte[] fotoOLogo = null;
        Usuario instance = new UsuarioImpl();
        instance.setFotoOLogo(fotoOLogo);
        
    }
    /**
     * Test of getId method, of class Usuario.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Usuario instance = new UsuarioImpl();
        int expResult = 0;
        instance.setId(expResult);
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getNombre method, of class Usuario.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Usuario instance = new UsuarioImpl();
        String expResult = "aaaaa";
        instance.setNombre(expResult);
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getApellido method, of class Usuario.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Usuario instance = new UsuarioImpl();
        String expResult = "aaaa";
        instance.setApellido(expResult);
        String result = instance.getApellido();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getUsuario method, of class Usuario.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Usuario instance = new UsuarioImpl();
        String expResult = "aaaa";
        instance.setUsuario(expResult);
        String result = instance.getUsuario();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getContrasenia method, of class Usuario.
     */
    @Test
    public void testGetContrasenia() {
        System.out.println("getContrasenia");
        Usuario instance = new UsuarioImpl();
        String expResult = "aaaa";
        instance.setContrasenia(expResult);
        String result = instance.getContrasenia();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getEmail method, of class Usuario.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Usuario instance = new UsuarioImpl();
        String expResult = "aaaa";
        instance.setEmail(expResult);
        String result = instance.getEmail();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getTelefono method, of class Usuario.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Usuario instance = new UsuarioImpl();
        int expResult = 0;
        instance.setTelefono(expResult);
        int result = instance.getTelefono();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getRepositorio method, of class Usuario.
     */
    @Test
    public void testGetRepositorio() {
        System.out.println("getRepositorio");
        Usuario instance = new UsuarioImpl();
        int expResult = 0;
        instance.setRepositorio(expResult);
        int result = instance.getRepositorio();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getFotoOLogo method, of class Usuario.
     */
    @Test
    public void testGetFotoOLogo() {
        System.out.println("getFotoOLogo");
        Usuario instance = new UsuarioImpl();
        byte[] expResult = null;
        instance.setFotoOLogo(expResult);
        byte[] result = instance.getFotoOLogo();
        assertArrayEquals(expResult, result);
        
    }

    public class UsuarioImpl extends Usuario {
    }
    
}
