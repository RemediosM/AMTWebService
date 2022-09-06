package restservice.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import restservice.entity.Museum;

@RestResource(exported = false)
public interface MuseumRepository extends JpaRepository<Museum, Long> {
}
