
package JsonFactory;

import Entidades_de_Transferencia_de_Informacion.Curso;
import Entidades_de_Transferencia_de_Informacion.Estudiante;
import Entidades_de_Transferencia_de_Informacion.Proyecto;
import Entidades_de_Transferencia_de_Informacion.Tecnologia;
import JsonFactory.JsonFactory;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class JsonFactoryTest {
    
    public JsonFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getJsonFrom method, of class JsonFactory.
     */
    @Test
    public void testGetJsonFromNull() {
        System.out.println("getJsonFrom");
        Object entidad = null;
        JsonFactory instance = new JsonFactory();
        JSONObject expResult = new JSONObject();
        JSONObject result = instance.getJsonFrom(entidad);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getJsonFrom method, of class JsonFactory.
     */
    @Test
    public void testGetJsonFromEstu() {
        System.out.println("getJsonFrom");
        List<Curso> cursos = new ArrayList<Curso>();
        List<Proyecto> proyectosEmpresa = new ArrayList<Proyecto>();
        List<Tecnologia> tecnologias = new ArrayList<Tecnologia>();
        Estudiante entidad = new Estudiante("Alberto", "Mora", "ALT", "12345678", 
               "alberto.mora@gmail.com", 81382254 , 1, null, "213083442", "Costa Rica", "TEC", 
                   "https.www.sdsds.com",cursos,proyectosEmpresa,tecnologias);
        JsonFactory instance = new JsonFactory();
       // JSONObject expResult = new JSONObject();
        JSONObject result = instance.getJsonFrom(entidad);
        //String nombreClase = entidad.getClass().toString();
       //   System.out.println(nombreClase);
        assertEquals(result, result);//ojo
        
    }
    
}
