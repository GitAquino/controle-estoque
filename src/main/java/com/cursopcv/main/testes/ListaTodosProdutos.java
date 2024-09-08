package com.cursopcv.main.testes;

import com.cursopcv.main.model.Produto;
import com.cursopcv.main.util.ExceptionManager;
import jakarta.persistence.EntityManager;
import java.util.List;

public class ListaTodosProdutos {

    public static void main(String[] args) {
        EntityManager em = ExceptionManager.getEntityManager();

        try {
            em.getTransaction().begin();

            List<Produto> produtos = em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();

            for (Produto produto : produtos) {
                System.out.println("Código(ID): " + produto.getCod() +", Produto: " + produto.getNome() + ", Descrição: " + produto.getDescricao() + ", Quantidade: " + produto.getQuantidade() + ", Preço: " + produto.getPreco());
            }

            em.getTransaction().commit();
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
