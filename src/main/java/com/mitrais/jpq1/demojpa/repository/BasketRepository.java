package com.mitrais.jpq1.demojpa.repository;

import com.mitrais.jpq1.demojpa.model.Basket;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

@Repository
public class BasketRepository {
    EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("carrot");
    EntityManager entityManager = emFactory.createEntityManager();

    public List findAllBaskets() {
        return entityManager.createQuery(
                "select b from Basket b"
        ).getResultList();
    }

    public void addBasket(Basket basket){
        entityManager.getTransaction().begin();
        Basket newBasket = new Basket();
        newBasket.setName(basket.getName());
        newBasket.setEmployee_id(basket.getEmployee_id());
        entityManager.persist(newBasket);
        entityManager.getTransaction().commit();
    }
}
