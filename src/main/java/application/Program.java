package application;

import domain.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        Pessoa p = em.find(Pessoa.class, 2);
        System.out.println(p);
        System.out.println("Ok!");
        em.close();
        emf.close();
    }
}