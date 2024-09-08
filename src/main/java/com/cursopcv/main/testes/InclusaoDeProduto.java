package com.cursopcv.main.testes;

import com.cursopcv.main.model.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class InclusaoDeProduto {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("controleestoque");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Produto panela = new Produto();
        panela.setNome("Panela");
        panela.setDescricao("Panela de Pressão 10 Litros");
        panela.setQuantidade(10);
        panela.setPreco(56.80);

        Produto cama = new Produto();
        cama.setNome("Cama");
        cama.setDescricao("Cama de casal Big");
        cama.setQuantidade(5);
        cama.setPreco(450.68);

        Produto caixaSom = new Produto();
        caixaSom.setNome("Caixa Som");
        caixaSom.setDescricao("Caixa de Som JBL");
        caixaSom.setQuantidade(20);
        caixaSom.setPreco(160.00);

        em.merge(panela);
        em.merge(cama);
        em.merge(caixaSom);

        em.getTransaction().commit();

        em.close();
        emf.close();

        System.out.println("Produtos cadastrados com sucesso!");
    }
}
