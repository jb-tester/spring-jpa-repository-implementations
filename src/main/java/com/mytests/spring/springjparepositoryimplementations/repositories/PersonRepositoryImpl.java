package com.mytests.spring.springjparepositoryimplementations.repositories;

import com.mytests.spring.springjparepositoryimplementations.data.Person;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * *
 * <p>Created by irina on 30.07.2021.</p>
 * <p>Project: spring-jpa-repository-implementations</p>
 * *
 */
public class PersonRepositoryImpl implements CustomPersonRepository {

    @Autowired
    EntityManager entityManager;
    
    @Override
    public List<Person> searchBySpecifiedAddress(String addr) {
        System.out.println("PersonRepositoryImpl.searchBySpecifiedAddress");
        Query query = entityManager.createNativeQuery("SELECT p.* FROM Person as p " +
                "WHERE p.address NOT LIKE ?", Person.class);
        query.setParameter(1, addr + "%");

        return query.getResultList();
    }
}
