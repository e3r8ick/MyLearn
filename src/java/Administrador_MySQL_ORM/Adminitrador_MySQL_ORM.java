
package Administrador_MySQL_ORM;

import Entidades_de_Transferencia_de_Informacion.Estudiante;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public abstract class Adminitrador_MySQL_ORM {

    private Session sesion; 
    private Transaction tx;
    
    protected void iniciaOperacion(){
        sesion = SessionFactoryObject.getSessionFactory().openSession();
        tx = null;
        try{
            tx = sesion.beginTransaction();
        }catch (HibernateException e) {
            System.out.println("Error al iniciar sesion... o comenzar transaccion");
            e.printStackTrace(); 
        }
        
    }

    protected void terminaOperacion(){
        try{
            tx.commit();
        }
        catch (HibernateException he){
            if (tx!=null) tx.rollback();
            System.out.println("Error en commit...");
            he.printStackTrace(); 
        }
        tx = null;
        sesion.close();
    }
    
    protected void manejaExcepcion(HibernateException he) throws HibernateException{
        if (tx!=null) tx.rollback();
        System.out.println("Error en transaccion...");
        he.printStackTrace(); 
    }

    protected Session getSession(){
        return sesion;
    }
    
   
    public static Integer almacenaEntidad(Object entidad) throws HibernateException{
        Adminitrador_MySQL_ORM dummy = new Adminitrador_MySQL_ORM(){};
        Integer ID = null;
        try{
            dummy.iniciaOperacion();
            ID = (Integer) dummy.getSession().save(entidad);
            //dummy.getSession().flush();
        }
        catch (HibernateException he){
            dummy.manejaExcepcion(he);
        }
        finally{
            dummy.terminaOperacion();
        }
        return ID;
    }
 
    public static <T> T getEntidad(Serializable id, Class<T> claseEntidad) throws HibernateException{
        Adminitrador_MySQL_ORM dummy = new Adminitrador_MySQL_ORM(){};

        T objetoRecuperado = null;

        try{
            dummy.iniciaOperacion();
            objetoRecuperado = (T)dummy.getSession().get(claseEntidad, id);//cae aqui
            //Empleado employee = (Empleado)session.get(Empleado.class, EmployeeID);
            
        }
        catch (HibernateException he){
            System.out.println("Murio en get");
            dummy.manejaExcepcion(he);
        }
        finally{
            dummy.terminaOperacion();
        }

        return objetoRecuperado;
    }
    
 /**   public static Estudiante getEntidad(Serializable id) throws HibernateException{
        Adminitrador_MySQL_ORM dummy = new Adminitrador_MySQL_ORM(){};

        Estudiante objetoRecuperado = null;

        try{
            dummy.iniciaOperacion();
            objetoRecuperado = (Estudiante)dummy.getSession().get(Estudiante.class, id);//.get(Estudiante.class, id);//cae aqui
            //Empleado employee = (Empleado)session.get(Empleado.class, EmployeeID);
            
        }
        catch (HibernateException he){
            System.out.println("Murio en get estudiante");
            dummy.manejaExcepcion(he);
        }
        finally{
            dummy.terminaOperacion();
        }

        return objetoRecuperado;
    }
**/
   
    public static <T> List<T> getListaEntidades(Class<T> claseEntidad) throws HibernateException{
        Adminitrador_MySQL_ORM dummy = new Adminitrador_MySQL_ORM(){};

        List<T> listaResultado = null;

        try
        {
            dummy.iniciaOperacion();
            listaResultado = dummy.getSession().createQuery("FROM " + claseEntidad.getSimpleName()).list();
        }
        catch (HibernateException he){
            dummy.manejaExcepcion(he);
        }
        finally
        {
            dummy.terminaOperacion();
        }
        return listaResultado;
    }
    
    
}
