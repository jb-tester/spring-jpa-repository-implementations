package com.mytests.spring.springjparepositoryimplementations.repositories;

import com.mytests.spring.springjparepositoryimplementations.data.Tab1Entity;
import org.springframework.data.repository.CrudRepository;

/**
 * *
 * <p>Created by irina on 11/17/2021.</p>
 * <p>Project: spring-jpa-repository-implementations</p>
 * *
 */
public interface Tab1Repository extends CrudRepository<Tab1Entity,Integer> , Tab1CustomRepository{

}
