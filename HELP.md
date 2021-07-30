
Custom Repositories implementation:
the implementation classes are not treated as repositories beans.
If the  @EnableJpaRepositories#repositoryImplementationPostfix is not set, the com.mytests.spring.springjparepositoryimplementations.repositories.PersonRepositoryImpl should be considered.
If the custom postfix 'Implementation' is set, the com.mytests.spring.springjparepositoryimplementations.repositories.PersonRepositoryImplementation class should nbe detected

https://youtrack.jetbrains.com/issue/IDEA-171430