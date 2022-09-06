package restservice.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import restservice.entity.User;

@RestResource(exported = false)
public interface UserRepository extends JpaRepository<User, String> {
}
