package com.mitrais.jpq1.demojpa.repository;

import com.mitrais.jpq1.demojpa.model.Carrot;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class CarrotRepository  {

    EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("carrot");
    EntityManager entityManager = emFactory.createEntityManager();

        public List findAllCarrot() {
                return entityManager.createQuery(
                        "select c from Carrot c"
                ).getResultList();
        }

        public List getCarrot(){
            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Carrot> carrotCriteriaQuery = criteriaBuilder.createQuery(Carrot.class);
            Root<Carrot> carrotRoot = carrotCriteriaQuery.from(Carrot.class);
            carrotCriteriaQuery.select(carrotRoot);
            TypedQuery<Carrot> carrotTypedQuery = entityManager.createQuery(carrotCriteriaQuery);
            return carrotTypedQuery.getResultList();
        }


        public void addCarrot(Carrot carrot){
            entityManager.getTransaction().begin();
            Carrot carrot1 = new Carrot();
            carrot1.setFreezeStatus(carrot.getFreezeStatus());
            carrot1.setBasketId(carrot.getBasketId());
            entityManager.persist(carrot);
            entityManager.getTransaction().commit();
        }

        public void editCarrot(int id,boolean status){
            Carrot carrot = entityManager.find(Carrot.class,id);
            entityManager.getTransaction().begin();
            carrot.setFreezeStatus(status);
            entityManager.getTransaction().commit();
        }

        public void deleteCarrot(Integer carrotId){
            entityManager.getTransaction().begin();
            entityManager.createQuery("delete from Carrot where id=:id")
                    .setParameter("id",carrotId)
                    .executeUpdate();
            entityManager.getTransaction().commit();
        }
}
