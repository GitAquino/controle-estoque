package com.cursopcv.main.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ExceptionManager {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("controleestoque");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public static void closeEntityManagerFactory() {
        emf.close();
    }

    public static void handleException(Exception e) {
        System.err.println("Ocorreu um erro: " + e.getMessage());
        e.printStackTrace();
    }
}
