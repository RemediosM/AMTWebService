package restservice.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import restservice.entity.City;

@RestResource(exported = false)
public interface CityRepository extends JpaRepository<City, Long> {
}
