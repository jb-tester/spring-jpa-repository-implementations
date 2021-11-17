package com.mytests.spring.springjparepositoryimplementations;

import com.mytests.spring.springjparepositoryimplementations.data.Person;
import com.mytests.spring.springjparepositoryimplementations.data.Tab1Entity;
import com.mytests.spring.springjparepositoryimplementations.repositories.PersonRepository;
import com.mytests.spring.springjparepositoryimplementations.repositories.Tab1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryImplementationPostfix = "Implementation")
public class SpringJpaRepositoryImplementationsApplication implements CommandLineRunner {
     @Autowired
    PersonRepository repo;
     @Autowired
    Tab1Repository trepo;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaRepositoryImplementationsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("++++++++++++++++++++");
        for (Person person : repo.searchBySpecifiedAddress("Russia")) {
            System.out.println(person.toString());
        }
        System.out.println("++++++++++++++++++++");

        trepo.repair();
        System.out.println("++ broken Tab1 entries: ");
        for (Tab1Entity tab1 : trepo.getAllWithEmptyFirstnameAndLastname()) {
            System.out.println(tab1.toString());
        }
        System.out.println("++ all Tab1 entries: ");
        for (Tab1Entity tab1 : trepo.findAll()) {
            System.out.println(tab1.toString());
        }
    }
}
