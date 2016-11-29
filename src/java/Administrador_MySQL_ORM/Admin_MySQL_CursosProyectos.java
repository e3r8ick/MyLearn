
package Administrador_MySQL_ORM;

import Entidades_de_Transferencia_de_Informacion.Curso;
import Entidades_de_Transferencia_de_Informacion.Proyecto;
import org.hibernate.HibernateException;
import org.hibernate.Query;


public class Admin_MySQL_CursosProyectos extends Adminitrador_MySQL_ORM{
   
    
    public Admin_MySQL_CursosProyectos(){
        
    }
    
    public Curso getCurso(String nombreDeCurso, int numeroDeGrupo) throws HibernateException{
        Curso curso = null;

        try{
            iniciaOperacion();
            Query query = getSession().createQuery("FROM Curso u WHERE u.nombre = :Nombre AND u.numeroDeGrupo = :NumeroGrupo");
            query.setParameter("Nombre", nombreDeCurso);
            query.setParameter("NumeroGrupo", numeroDeGrupo);

            curso = (Curso)query.uniqueResult();
        }
        catch (HibernateException he){
            manejaExcepcion(he);
        }
        finally{
            terminaOperacion();
        }

        return curso;
    }
    
    public Proyecto getProyectoDeCurso(int idCurso) throws HibernateException{
        Proyecto proyecto = null;

        try{
            iniciaOperacion();
            Query query = getSession().createQuery("FROM Proyecto u WHERE u.idCurso = :idCurso");
            query.setParameter("idCurso", idCurso);

            proyecto = (Proyecto)query.uniqueResult();
        }
        catch (HibernateException he){
            manejaExcepcion(he);
        }
        finally{
            terminaOperacion();
        }

        return proyecto;
    }
    
    public Proyecto getProyectoDeEmpresa(String nombre) throws HibernateException{
        Proyecto proyecto = null;

        try{
            iniciaOperacion();
            Query query = getSession().createQuery("FROM Proyecto u WHERE u.nombre = :nombre");
            query.setParameter("nombre", nombre);

            proyecto = (Proyecto)query.uniqueResult();
        }
        catch (HibernateException he){
            manejaExcepcion(he);
        }
        finally{
            terminaOperacion();
        }

        return proyecto;
    }
}
