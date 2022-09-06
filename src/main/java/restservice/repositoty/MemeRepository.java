package restservice.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import restservice.entity.Meme;

@RestResource(exported = false)
public interface MemeRepository extends JpaRepository<Meme, Long> {
}
