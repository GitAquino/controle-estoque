package com.cursopcv.main.testes;

import com.cursopcv.main.model.Produto;
import com.cursopcv.main.util.ExceptionManager;
import jakarta.persistence.EntityManager;

public class AlteracaoDeProduto {

    public static void main(String[] args) {
        EntityManager em = ExceptionManager.getEntityManager();

        try {
            em.getTransaction().begin();

            Produto produto = em.find(Produto.class, 7L);

            if (produto != null) {
                produto.setPreco(345.00);
                em.merge(produto);
                em.getTransaction().commit();

                System.out.println("Preço do produto atualizado com sucesso!");
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
