package com.cursopcv.main.testes;

import com.cursopcv.main.model.Produto;
import com.cursopcv.main.util.ExceptionManager;
import jakarta.persistence.EntityManager;

public class RemocaoDeProduto {

    public static void main(String[] args) {
        EntityManager em = ExceptionManager.getEntityManager();

        try {
            em.getTransaction().begin();

            Produto produto = em.find(Produto.class, 3L);

            if (produto != null) {
                em.remove(produto);
                em.getTransaction().commit();

                System.out.println("Produto removido com sucesso!");
            } else {
                System.out.println("Produto não encontrado.");
            }
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            ExceptionManager.handleException(e);
        } finally {
            em.close();
            ExceptionManager.closeEntityManagerFactory();
        }
    }
}
