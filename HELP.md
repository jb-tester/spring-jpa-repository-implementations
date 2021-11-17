
**Custom Repositories implementation:**
<br>
the implementation classes are not treated as repositories beans:
- If the  @EnableJpaRepositories#repositoryImplementationPostfix is not set, the com.mytests.spring.springjparepositoryimplementations.repositories.PersonRepositoryImpl should be considered.
- If the custom postfix 'Implementation' is set, the com.mytests.spring.springjparepositoryimplementations.repositories.PersonRepositoryImplementation class should be detected

https://youtrack.jetbrains.com/issue/IDEA-171430


The custom repository fragment implementation is shown as unused and is not recognized as bean:

https://youtrack.jetbrains.com/issue/IDEA-282697