/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas.com.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author WINDOWS 8
 */
public class HibernateUtil {
     private static final SessionFactory sessionFactory;
    static{
        try{
            sessionFactory =new AnnotationConfiguration().configure().buildSessionFactory();
            
        }catch(Throwable exc){
            System.err.println("Initial SessionFactory  creation Failed :"+exc);
            throw new ExceptionInInitializerError(exc);
        }
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    
}
