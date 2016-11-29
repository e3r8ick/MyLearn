
package Entidades_de_Transferencia_de_Informacion;

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class EmpresaTest {
    
    public EmpresaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    /**
     * Test of setIdProfesor method, of class Empresa.
     
    @Test
    public void testSetIdEmpresa() {
        System.out.println("setId");
        int id = 0;
        Empresa instance = new Empresa();
        instance.setIdEmpresa(id);
        
    }*/
    
    /**
     * Test of setNombreEmpresarial method, of class Empresa.
     */
    @Test
    public void testSetNombreEmpresarial() {
        System.out.println("setNombreEmpresarial");
        String nombreEmpresarial = "aaaa";
        Empresa instance = new Empresa();
        instance.setNombreEmpresarial(nombreEmpresarial);
    }

    /**
     * Test of setPais method, of class Empresa.
     */
    @Test
    public void testSetPais() {
        System.out.println("setPais");
        String pais = "aaaaa";
        Empresa instance = new Empresa();
        instance.setPais(pais);
  
    }

    /**
     * Test of setSitioWeb method, of class Empresa.
     */
    @Test
    public void testSetSitioWeb() {
        System.out.println("setSitioWeb");
        String sitioWeb = "aaaaa";
        Empresa instance = new Empresa();
        instance.setSitioWeb(sitioWeb);
        
    }
    
    /**
     * Test of setProyectos method, of class Empresa.
     */
    @Test
    public void testSetProyectos() {
        System.out.println("setProyectos");
        List<Proyecto> proyectos = new ArrayList<Proyecto>();
        Empresa instance = new Empresa();
        instance.setProyectos(proyectos);
    }
    /**
     * Test of getId method, of class Empresa.
     
    @Test
    public void testGetIdEmpresa() {
        System.out.println("getId");
        Empresa instance = new Empresa();
        int expResult = 0;
        instance.setIdEmpresa(expResult);
        int result = instance.getIdEmpresa();
        assertEquals(expResult, result);
        
    }*/    /**
     * Test of getNombreEmpresarial method, of class Empresa.
     */
    @Test
    public void testGetNombreEmpresarial() {
        System.out.println("getNombreEmpresarial");
        Empresa instance = new Empresa();
        String expResult = "aaaa";
        instance.setNombreEmpresarial(expResult);
        String result = instance.getNombreEmpresarial();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPais method, of class Empresa.
     */
    @Test
    public void testGetPais() {
        System.out.println("getPais");
        Empresa instance = new Empresa();
        String expResult = "aaaa";
        instance.setPais(expResult);
        String result = instance.getPais();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSitioWeb method, of class Empresa.
     */
    @Test
    public void testGetSitioWeb() {
        System.out.println("getSitioWeb");
        Empresa instance = new Empresa();
        String expResult = "aaaa";
        instance.setSitioWeb(expResult);
        String result = instance.getSitioWeb();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getProyectos method, of class Empresa.
     */
    @Test
    public void testGetProyectos() {
        System.out.println("getProyectos");
        Empresa instance = new Empresa();
        List<Proyecto> expResult = new ArrayList<Proyecto>();
        instance.setProyectos(expResult);
        List<Proyecto> result = instance.getProyectos();
        assertEquals(expResult, result);
        
    }
}
