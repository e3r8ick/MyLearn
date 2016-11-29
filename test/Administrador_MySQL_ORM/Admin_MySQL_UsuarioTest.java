
package Administrador_MySQL_ORM;

import Entidades_de_Transferencia_de_Informacion.Empresa;
import Entidades_de_Transferencia_de_Informacion.Estudiante;
import Entidades_de_Transferencia_de_Informacion.Profesor;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class Admin_MySQL_UsuarioTest {
    
    public Admin_MySQL_UsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getEstudiante method, of class Admin_MySQL_Usuario.
     */
    @Test
    public void testGetEstudiante() {
        System.out.println("getEstudiante");
        String nombreDeUsuario = "";
        String password = "";
        Admin_MySQL_Usuario instance = new Admin_MySQL_Usuario();
        Estudiante expResult = null;
        Estudiante result = instance.getEstudiante(nombreDeUsuario, password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getProfesor method, of class Admin_MySQL_Usuario.
     */
    @Test
    public void testGetProfesor() {
        System.out.println("getProfesor");
        String nombreDeUsuario = "";
        String password = "";
        Admin_MySQL_Usuario instance = new Admin_MySQL_Usuario();
        Profesor expResult = null;
        Profesor result = instance.getProfesor(nombreDeUsuario, password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getEmpresa method, of class Admin_MySQL_Usuario.
     */
    @Test
    public void testGetEmpresa() {
        System.out.println("getEmpresa");
        String nombreDeUsuario = "";
        String password = "";
        Admin_MySQL_Usuario instance = new Admin_MySQL_Usuario();
        Empresa expResult = null;
        Empresa result = instance.getEmpresa(nombreDeUsuario, password);
        assertEquals(expResult, result);
        
    }
    
}
