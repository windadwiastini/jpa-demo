package com.mitrais.jpq1.demojpa.repository;

import com.mitrais.jpq1.demojpa.model.Carrot;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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

        public void deleteCarrot(Integer carrotId){
            entityManager.getTransaction().begin();
            entityManager.createQuery("delete from Carrot where id=:id")
                    .setParameter("id",carrotId)
                    .executeUpdate();
            entityManager.getTransaction().commit();
        }

        public void addCarrot(boolean status){
            entityManager.getTransaction().begin();
            Carrot carrot=new Carrot();
            carrot.setFreezeStatus(status);
            entityManager.persist(carrot);
            entityManager.getTransaction().commit();
        }

        public void editCarrot(int id,boolean status){
            Carrot carrot=entityManager.find(Carrot.class,id);
            entityManager.getTransaction().begin();
            carrot.setFreezeStatus(status);
            entityManager.getTransaction().commit();
        }


}
