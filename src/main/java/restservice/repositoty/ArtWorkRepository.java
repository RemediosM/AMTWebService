package restservice.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import restservice.entity.ArtWork;

@RestResource(exported = false)
public interface ArtWorkRepository extends JpaRepository<ArtWork, Long> {
}
