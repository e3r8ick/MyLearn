
package Administrador_MySQL_ORM;

import org.hibernate.SessionFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SessionFactoryObjectTest {
    
    public SessionFactoryObjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getSessionFactory method, of class SessionFactoryObject.
     */
    @Test
    public void testGetSessionFactory() {
        System.out.println("getSessionFactory");
        String expResult = "org.hibernate.internal.SessionFactoryImpl";//"Administrador_MySQL_ORM.SessionFactoryObject";
        SessionFactory result0 = SessionFactoryObject.getSessionFactory();
        String result = result0.getClass().getName();
        assertEquals(expResult, result);
        
    }
    
}
