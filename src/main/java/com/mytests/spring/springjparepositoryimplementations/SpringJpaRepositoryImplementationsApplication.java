package com.mytests.spring.springjparepositoryimplementations;

import com.mytests.spring.springjparepositoryimplementations.data.Person;
import com.mytests.spring.springjparepositoryimplementations.repositories.PersonRepository;
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
    public static void main(String[] args) {
        SpringApplication.run(SpringJpaRepositoryImplementationsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (Person person : repo.searchBySpecifiedAddress("Russia")) {
            System.out.println(person.toString());
        }
    }
}
