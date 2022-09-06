package restservice.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import restservice.entity.Style;

@RestResource(exported = false)
public interface StyleRepository extends JpaRepository<Style, Long> {
}
