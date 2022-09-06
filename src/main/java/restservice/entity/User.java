package restservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "users")
@NoArgsConstructor
@Setter
@Getter
public class User {
    @Id
    private String login;
    private String password;
    private String mail;
}
