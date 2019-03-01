package com.mitrais.jpq1.demojpa.repository;

import com.mitrais.jpq1.demojpa.model.Carrot;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

@Repository
public class CarrotRepository  {

    EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
    EntityManager entityManager = emFactory.createEntityManager();

        public List<Carrot> findAllCarrot() {
                return entityManager.createQuery(
                        "select c from Carrot c"
                ).getResultList();
        }

}
