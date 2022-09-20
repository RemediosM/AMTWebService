package restservice.dto;

import lombok.*;
import restservice.entity.Country;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class CountryDto {
    Long countryId;
    String name;

    public Country toEntity() {
        return new Country(countryId, name);
    }
}
