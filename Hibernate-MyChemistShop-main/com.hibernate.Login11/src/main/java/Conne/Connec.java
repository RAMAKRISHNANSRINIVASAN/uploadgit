package Conne;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import Model.Login;

public class Connec {

    private static SessionFactory fac;

    public Connec() {
        fac = new Configuration().configure("hiber.cfg.xml").addAnnotatedClass(Login.class).buildSessionFactory();
    }

    public static SessionFactory getSessionFact() {
        if (fac == null) {
            new Connec();
        }
        return fac;
    }
}
