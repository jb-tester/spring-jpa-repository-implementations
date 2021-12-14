package com.mytests.spring.springjparepositoryimplementations.repositories;

import com.mytests.spring.springjparepositoryimplementations.data.Person;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * *
 * <p>Created by irina on 30.07.2021.</p>
 * <p>Project: spring-jpa-repository-implementations</p>
 * <p> Class should be recognized as bean and shown as used: </p>
 * <a href="https://youtrack.jetbrains.com/issue/IDEA-171430">IDEA-171430</a>
 */
public class PersonRepositoryImplementation implements CustomPersonRepository {

   @Autowired
    EntityManager entityManager;
    
    @Override
    public List<Person> searchBySpecifiedAddress(String addr) {
        System.out.println("PersonRepositoryImplementation.searchBySpecifiedAddress");
        Query query = entityManager.createNativeQuery("SELECT p.* FROM Person as p " +
                "WHERE p.address LIKE ?", Person.class);
        query.setParameter(1, addr + "%");

        return query.getResultList();
    }
}
