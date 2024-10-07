package com.mytests.spring.springjparepositoryimplementations.repositories;

import com.mytests.spring.springjparepositoryimplementations.data.Tab1Entity;
import org.springframework.data.jpa.repository.Modifying;

import jakarta.transaction.Transactional;
import java.util.List;

/**
 * *
 * <p>Created by irina on 11/17/2021.</p>
 * <p>Project: spring-jpa-repository-implementations</p>
 * *
 */
public interface Tab1CustomRepository {

    List<Tab1Entity> getAllWithEmptyFirstnameAndLastname();

    // Check for @Modifying here
    @Modifying @Transactional
    void repair();
}
