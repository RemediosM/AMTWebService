package restservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "countries")
@NoArgsConstructor
@Setter
@Getter
public class Country {
    @Id
    @GeneratedValue
    @Column(name = "Country_id")
    private Long countryId;
    private String name;

}
