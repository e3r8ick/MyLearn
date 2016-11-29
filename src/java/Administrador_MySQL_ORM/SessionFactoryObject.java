
package Administrador_MySQL_ORM;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SessionFactoryObject {
 
    private static SessionFactory factory;   

    static 
    { 
        try 
        { 
           factory = new Configuration().configure().buildSessionFactory();
        } catch (HibernateException he)//(Throwable ex) 
        { 
           System.err.println("Ocurrió un error en la inicialización de la SessionFactory: " + he);//ex); 
           he.printStackTrace();//throw new ExceptionInInitializerError(ex); 
        } 
    }  

    public static SessionFactory getSessionFactory() 
    { 
        return factory; 
    } 
}
