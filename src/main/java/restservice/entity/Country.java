package restservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import restservice.dto.CountryDto;

import javax.persistence.*;

@Entity(name = "countries")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Country {
    @Id
    @GeneratedValue
    @Column(name = "Country_id")
    private Long countryId;
    private String name;

    public CountryDto toDto() {
        return new CountryDto(countryId, name);
    }
}
