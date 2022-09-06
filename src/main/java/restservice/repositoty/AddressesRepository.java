package restservice.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import restservice.entity.Address;

@RestResource(exported = false)
public interface AddressesRepository extends JpaRepository<Address, Long> {
}
