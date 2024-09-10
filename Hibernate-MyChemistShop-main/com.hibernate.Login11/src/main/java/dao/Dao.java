package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import Conne.Connec;
import Model.Login;

public class Dao implements DaoInter {

    private SessionFactory factory;

    public Dao() {
        factory = Connec.getSessionFact();
    }

    @Override
    public boolean signIn(int userId, String password) {
        Session session = factory.openSession();
        String hql = "from Login L where L.userId = :userId and L.userPass = :password";
        Query<Login> query = session.createQuery(hql, Login.class);
        query.setParameter("userId", userId);
        query.setParameter("password", password);

        Login login = query.uniqueResult();  // Get a single result if it exists
        session.close();

        return login != null;
    }

    @Override
    public boolean signUp(int userId, String password, String email) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        // Check if userId already exists
        String checkHql = "from Login L where L.userId = :userId";
        Query<Login> checkQuery = session.createQuery(checkHql, Login.class);
        checkQuery.setParameter("userId", userId);

        if (!checkQuery.list().isEmpty()) {
            System.out.println("User with ID " + userId + " already exists.");
            session.close();
            return false;  // User already exists
        }

        // If user does not exist, proceed with sign-up
        Login newLogin = new Login(userId, password, email);  // Create a new Login object
        session.save(newLogin);  // Save the object to the database
        
        tx.commit();
        session.close();

        return true;  // User successfully signed up
    }


    @Override
    public boolean removeAccount(int userId) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        String hql = "delete from Login L where L.userId = :userId";
        Query<?> query = session.createQuery(hql);
        query.setParameter("userId", userId);

        int result = query.executeUpdate();
        tx.commit();
        session.close();

        return result > 0;
    }

    @Override
    public boolean updatePassword(int userId, String newPassword) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        String hql = "update Login L set L.userPass = :newPassword where L.userId = :userId";
        Query<?> query = session.createQuery(hql);
        query.setParameter("newPassword", newPassword);
        query.setParameter("userId", userId);

        int result = query.executeUpdate();
        tx.commit();
        session.close();

        return result > 0;
    }
}