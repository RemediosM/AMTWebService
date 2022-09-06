package restservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

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

    @OneToMany(mappedBy = "country")
    private Set<City> cities;
}
