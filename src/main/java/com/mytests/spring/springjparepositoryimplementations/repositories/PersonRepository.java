package com.mytests.spring.springjparepositoryimplementations.repositories;

import com.mytests.spring.springjparepositoryimplementations.data.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * *
 * <p>Created by irina on 30.07.2021.</p>
 * <p>Project: spring-jpa-repository-implementations</p>
 * *
 */
public interface PersonRepository extends JpaRepository<Person, Integer>, CustomPersonRepository {
    
    
}
