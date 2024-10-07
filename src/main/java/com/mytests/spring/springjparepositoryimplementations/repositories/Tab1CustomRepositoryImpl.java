package com.mytests.spring.springjparepositoryimplementations.repositories;

import com.mytests.spring.springjparepositoryimplementations.data.Tab1Entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 * *
 * <p>Created by irina on 11/17/2021.</p>
 * <p>Project: spring-jpa-repository-implementations</p>
 *
 * <p></p>class is not recognized as bean and is shown as not used:</p>
 * <p><a href="https://youtrack.jetbrains.com/issue/IDEA-282697">IDEA-282697</a> - fixed </p>
 *
 * <p>This class should be recognized with default @EnableJpaRepositories#repositoryImplementationPostfix == Impl only:</p>
 *  <p><a href="https://youtrack.jetbrains.com/issue/IDEA-284883">IDEA-284883</a></p>
 * *
 */

public class Tab1CustomRepositoryImpl implements Tab1CustomRepository {
    final
    EntityManager entityManager;

    public Tab1CustomRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Tab1Entity> getAllWithEmptyFirstnameAndLastname() {
        System.out.println("Tab1CustomRepositoryImpl.getAllWithEmptyFirstnameAndLastname");
        Query q = entityManager.createNativeQuery("SELECT * FROM tab1  WHERE (firstname IS NULL OR firstname = '') AND (lastname IS NULL OR lastname = '')", Tab1Entity.class);
        List<Tab1Entity> resultList = q.getResultList();
        return resultList;
    }

    @Override
    public void repair() {
        Query q = entityManager.createNativeQuery("update tab1 " +
                "set tab1.firstname = tab1.name, tab1.lastname = tab1.lastname " +
                "where (firstname IS NULL OR firstname = '') AND (lastname IS NULL OR lastname = '')");
        q.executeUpdate();
    }
}
