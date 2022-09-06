package restservice.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import restservice.entity.Author;

@RestResource(exported = false)
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
