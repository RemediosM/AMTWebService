package restservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import restservice.dto.AddressDto;
import restservice.dto.CityDto;

import javax.persistence.*;

@Entity(name = "cities")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class City {

    @Id
    @GeneratedValue
    @Column(name = "City_id")
    private Long cityId;
    private String name;

    @ManyToOne
    @JoinColumn(name="Country_id", nullable=false)
    private Country country;

    public CityDto toDto() {
        return new CityDto(cityId, name, country.toDto());
    }
}
