package com.mitrais.jpq1.demojpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoJpaApplicationTests {
	private static final String PERSISTENCE_UNIT_NAME="carrot";
	private static EntityManagerFactory factory;

	@Test
	public void contextLoads() {
		factory= Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager entityManager=factory.createEntityManager();
	}

}
