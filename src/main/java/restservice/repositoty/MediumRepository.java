package restservice.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import restservice.entity.Medium;

@RestResource(exported = false)
public interface MediumRepository extends JpaRepository<Medium, Long> {
}
