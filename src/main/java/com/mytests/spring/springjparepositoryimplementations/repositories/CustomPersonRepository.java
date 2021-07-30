package com.mytests.spring.springjparepositoryimplementations.repositories;

import com.mytests.spring.springjparepositoryimplementations.data.Person;

import java.util.List;

/**
 * *
 * <p>Created by irina on 30.07.2021.</p>
 * <p>Project: spring-jpa-repository-implementations</p>
 * *
 */
public interface CustomPersonRepository {
    List<Person> searchBySpecifiedAddress(String addr);
}
