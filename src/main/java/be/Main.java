package be;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();

        Message message = new Message().setId().setMessage("ph");

        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(message);
        et.commit();

        em.close();
        emf.close();
    }
}
