package co.SpringRepositories2.demoSpringRepositories2.repositories;

import co.SpringRepositories2.demoSpringRepositories2.entities.ProgLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProgLangRepositories extends JpaRepository<ProgLanguage, Long> {
}
