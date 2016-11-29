
package Administrador_MySQL_ORM;

import Entidades_de_Transferencia_de_Informacion.Empresa;
import Entidades_de_Transferencia_de_Informacion.Estudiante;
import Entidades_de_Transferencia_de_Informacion.Profesor;
import java.io.Serializable;
import org.hibernate.HibernateException;
import org.hibernate.Query;


public class Admin_MySQL_Usuario extends Adminitrador_MySQL_ORM{
    
    
    public Admin_MySQL_Usuario(){
        
    }
    
    public Estudiante getEstudiante(String nombreDeUsuario, String contrasenia) throws HibernateException{
        Estudiante estudiante = null;

        try{
            iniciaOperacion();
            Query query = getSession().createQuery("FROM Estudiante u WHERE u. usuario = :nombreEstudiante AND u. contrasenia = :password");
            query.setParameter("nombreEstudiante", nombreDeUsuario);
            query.setParameter("password", contrasenia);

            estudiante = (Estudiante)query.uniqueResult();
        }
        catch (HibernateException he){
            manejaExcepcion(he);
        }
        finally{
            terminaOperacion();
        }

        return estudiante;
    }
    
    public Profesor getProfesor(String nombreDeUsuario, String contrasenia) throws HibernateException{
        Profesor profesor = null;

        try{
            iniciaOperacion();
            Query query = getSession().createQuery("FROM Profesor u WHERE u. usuario = :nombreEstudiante AND u. contrasenia = :password");
            query.setParameter("nombreEstudiante", nombreDeUsuario);
            query.setParameter("password", contrasenia);

            profesor = (Profesor)query.uniqueResult();
        }
        catch (HibernateException he){
            manejaExcepcion(he);
        }
        finally{
            terminaOperacion();
        }

        return profesor;
    }
    
    public Empresa getEmpresa(String nombreDeUsuario, String contrasenia) throws HibernateException{
        Empresa empresa = null;

        try{
            iniciaOperacion();
            Query query = getSession().createQuery("FROM Empresa u WHERE u. usuario = :nombreEstudiante AND u. contrasenia = :password");
            query.setParameter("nombreEstudiante", nombreDeUsuario);
            query.setParameter("password", contrasenia);

            empresa = (Empresa)query.uniqueResult();
        }
        catch (HibernateException he){
            manejaExcepcion(he);
        }
        finally{
            terminaOperacion();
        }

        return empresa;
    }
}
 