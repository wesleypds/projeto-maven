package com.exemplo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.exemplo.dominio.Pessoa;

public class App 
{
    public static void main( String[] args ) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Salva pessoas no banco
        Pessoa p1 = new Pessoa(null, "Camila Pereira", "camila@gmail.com");
        Pessoa p2 = new Pessoa(null, "Wesley Pereira", "wesley@gmail.com");
        Pessoa p3 = new Pessoa(null, "Neusa Pereira", "neusa@gmail.com");
        
        entityManager.getTransaction().begin();
        entityManager.persist(p1);
        entityManager.persist(p2);
        entityManager.persist(p3);
        entityManager.getTransaction().commit();
        
        // Busca uma pessoa no banco
        Pessoa pessoa = entityManager.find(Pessoa.class, 2);

        // Deleta uma pessoa no banco
        entityManager.getTransaction().begin();
        entityManager.remove(pessoa);
        entityManager.getTransaction().commit();

        System.out.println(pessoa);

        entityManager.close();
        entityManagerFactory.close();
    }
}
