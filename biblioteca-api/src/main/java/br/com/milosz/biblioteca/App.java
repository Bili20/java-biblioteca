package br.com.milosz.biblioteca;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.milosz.biblioteca.livro.models.entities.LivroEntity;

public class App {
    public static void main(String[] args) {
        try {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
            EntityManager entityManager = entityManagerFactory.createEntityManager();

            entityManager.getTransaction().begin();
            LocalDate date = LocalDate.of(2001, 1, 12);
            LivroEntity livro = new LivroEntity(date, "livro novo");
            entityManager.persist(livro);
            entityManager.getTransaction().commit();

            entityManager.close();
            entityManagerFactory.close();
        } catch (Exception e) {
            System.err.println("❌ Falha na conexão:");
            e.printStackTrace();
        }
    }
}