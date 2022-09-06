package restservice.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import restservice.entity.Country;

@RestResource(exported = false)
public interface CountryRepository extends JpaRepository<Country, Long> {
}
