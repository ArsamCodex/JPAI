package be;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();

        Message message = new Message().setId(10).setMessage("arsam");

        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(message);
        et.commit();


//        User user = em.find(User.class, 17);
//        user.setUsername("Chocolate Chipolata");
//        System.out.println(user.toString());
//
//        em.refresh(user);
//        System.out.println(user.toString());

        em.close();
        emf.close();
    }
}
