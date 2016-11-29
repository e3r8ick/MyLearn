
package Entidades_de_Transferencia_de_Informacion;

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CursoTest {
    
    public CursoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setIdCurso method, of class Curso.
     */
    @Test
    public void testSetIdCurso() {
        System.out.println("setIdCurso");
        int idCurso = 0;
        Curso instance = new Curso();
        instance.setIdCurso(idCurso);
        
    }

    /**
     * Test of setNombre method, of class Curso.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "aaaa";
        Curso instance = new Curso();
        instance.setNombre(nombre);
        
    }

    /**
     * Test of setDescripcion method, of class Curso.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String Descripcion = "aaaaa";
        Curso instance = new Curso();
        instance.setDescripcion(Descripcion);
        
    }

    /**
     * Test of setNumeroDeGrupo method, of class Curso.
     */
    @Test
    public void testSetNumeroDeGrupo() {
        System.out.println("setNumeroDeGrupo");
        int numeroDeGrupo = 0;
        Curso instance = new Curso();
        instance.setNumeroDeGrupo(numeroDeGrupo);
        
    }

    /**
     * Test of setNotaMinima method, of class Curso.
     */
    @Test
    public void testSetNotaMinima() {
        System.out.println("setNotaMinima");
        float notaMinima = 0.0F;
        Curso instance = new Curso();
        instance.setNotaMinima(notaMinima);
        
    }

    /**
     * Test of setEstado method, of class Curso.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        int estado = 0;
        Curso instance = new Curso();
        instance.setEstado(estado);
        
    }

    /**
     * Test of setFechaDeInicio method, of class Curso.
     */
    @Test
    public void testSetFechaDeInicio() {
        System.out.println("setFechaDeInicio");
        String fechaDeInicio = "aaaa";
        Curso instance = new Curso();
        instance.setFechaDeInicio(fechaDeInicio);
        
    }
    
    /**
     * Test of setEstudiantes method, of class Curso.
     */
    @Test
    public void testSetEstudiantes() {
        System.out.println("setEstudiantes");
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        Curso instance = new Curso();
        instance.setEstudiantes(estudiantes);
        
    }
    
    /**
     * Test of setProfesores method, of class Curso.
     */
    @Test
    public void testSetProfesores() {
        System.out.println("setProfesores");
        List<Profesor> profesores = new ArrayList<Profesor>();
        Curso instance = new Curso();
        instance.setProfesores(profesores);
        
    }
    
    /**
     * Test of setLogros method, of class Curso.
     */
    @Test
    public void testSetLogros() {
        System.out.println("setLogros");
        List<Logro> logros = new ArrayList<Logro>();
        Curso instance = new Curso();
        instance.setLogros(logros);
        
    }
    
    
    /**
     * Test of getIdCurso method, of class Curso.
     */
    @Test
    public void testGetIdCurso() {
        System.out.println("getIdCurso");
        Curso instance = new Curso();
        int expResult = 0;
        instance.setIdCurso(expResult);
        int result = instance.getIdCurso();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNombre method, of class Curso.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Curso instance = new Curso();
        String expResult = "aaa";
        instance.setNombre(expResult);
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDescripcion method, of class Curso.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Curso instance = new Curso();
        String expResult = "aaaa";
        instance.setDescripcion(expResult);
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getNumeroDeGrupo method, of class Curso.
     */
    @Test
    public void testGetNumeroDeGrupo() {
        System.out.println("getNumeroDeGrupo");
        Curso instance = new Curso();
        int expResult = 0;
        instance.setNumeroDeGrupo(expResult);
        int result = instance.getNumeroDeGrupo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNotaMinima method, of class Curso.
     */
    @Test
    public void testGetNotaMinima() {
        System.out.println("getNotaMinima");
        Curso instance = new Curso();
        float expResult = 0.0F;
        float result = instance.getNotaMinima();
        instance.setNotaMinima(result);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getEstado method, of class Curso.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Curso instance = new Curso();
        int expResult = 0;
        instance.setEstado(expResult);
        int result = instance.getEstado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getFechaDeInicio method, of class Curso.
     */
    @Test
    public void testGetFechaDeInicio() {
        System.out.println("getFechaDeInicio");
        Curso instance = new Curso();
        String expResult = "aaa";
        instance.setFechaDeInicio(expResult);
        String result = instance.getFechaDeInicio();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getEstudiantes method, of class Curso.
     */
    @Test
    public void testGetEstudiantes() {
        System.out.println("getEstudiantes");
        Curso instance = new Curso();
        List<Estudiante> result = new ArrayList<Estudiante>();
        instance.setEstudiantes(result);
        List<Estudiante> expResult = instance.getEstudiantes();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getProfesores method, of class Curso.
     */
    @Test
    public void testGetProfesores() {
        System.out.println("getProfesores");
        Curso instance = new Curso();
        List<Profesor> result = new ArrayList<Profesor>();
        instance.setProfesores(result);
        List<Profesor> expResult = instance.getProfesores();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getLogros method, of class Curso.
     */
    @Test
    public void testGetLogros() {
        System.out.println("getLogros");
        Curso instance = new Curso();
        List<Logro> result = new ArrayList<Logro>();
        instance.setLogros(result);
        List<Logro> expResult = instance.getLogros();
        assertEquals(expResult, result);
        
    }
}
